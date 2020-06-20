package com.example.java_services.tweet.service;

import com.example.java_services.tweet.domain.PickupLines;
import com.example.java_services.tweet.repository.PickupLinesRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

class PickupLinesServiceImpTest {

    private PickupLinesServiceImp pklServiceImp;

    @Mock
    private PickupLinesRepository pklRepo;

    @Mock
    private RandomService rdService;
        
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        pklServiceImp = new PickupLinesServiceImp(pklRepo, rdService);
    }


    @Test
    public void getPickupLinesTest(){

        // Given

        PickupLines funny = new PickupLines("Well, here I am. What are your other two wishes?");
        
        given(rdService.generateRandomVal()).willReturn(3L);
        given(pklRepo.findById(3L)).willReturn(Optional.of(funny));

        // When
        Optional<PickupLines> pkl = pklServiceImp.getPickupLines();

        //Then
        assertThat(pkl).isEqualTo(Optional.of(funny));
        // assertThat(funny .getContent()).isEqualTo("hello");
        // assertThat(pkl.getContent()).isEqualTo(funny.getContent());
    }
}
