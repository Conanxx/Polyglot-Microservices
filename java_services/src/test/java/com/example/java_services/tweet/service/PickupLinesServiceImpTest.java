package com.example.java_services.tweet.service;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

class PickupLinesServiceImpTest {

    private PickupLinesServiceImp pklServiceImp;
        
    @Before
    void setUp() {
        MockitoAnnotations.initMocks(this);
        pklServiceImp = new PickupLinesServiceImp();
    }


    @Test
    public void getPickupLinesTest(){
        
    }
}
