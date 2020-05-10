package com.example.java_services.tweet.service;

import com.example.java_services.tweet.domain.PickupLines;
import org.springframework.beans.factory.annotation.Autowired;

public class PickupLinesServiceImp implements PickupLinesService {

    @Autowired
    public PickupLinesServiceImp(){

    }
    
    @Override
    public PickupLines getPickupLines() {
        return new PickupLines("Just kidding!");
    }
}
