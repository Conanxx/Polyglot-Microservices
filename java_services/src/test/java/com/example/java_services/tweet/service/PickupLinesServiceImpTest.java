package com.example.java_services.tweet.service;

import com.example.java_services.tweet.domain.PickupLines;
import com.example.java_services.tweet.repository.PickupLinesRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Arrays;

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
        given(rdService.generateRandomVal()).willReturn(3);
        given(pklRepo.getPickupLinesContent()).willReturn(new ArrayList<String>(Arrays.asList("1", "2", "3", "4")));

         // When
         PickupLines pkl = pklServiceImp.getPickupLines();

        // // Then
         assertThat(pkl.getContent()).isEqualTo("Just kidding!");
    }
}
