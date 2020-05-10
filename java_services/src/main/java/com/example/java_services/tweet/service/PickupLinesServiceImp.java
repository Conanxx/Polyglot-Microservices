package com.example.java_services.tweet.service;

import com.example.java_services.tweet.domain.PickupLines;
import com.example.java_services.tweet.repository.PickupLinesRepository;
import org.springframework.beans.factory.annotation.Autowired;


public class PickupLinesServiceImp implements PickupLinesService {

    private PickupLinesRepository pklRepo;
    private RandomService rdService;
        
    @Autowired
    public PickupLinesServiceImp(final PickupLinesRepository pklRepo, final RandomService rdService){
        this.pklRepo = pklRepo;
        this.rdService = rdService;
    }
    
    @Override
    public PickupLines getPickupLines() {
        return new PickupLines("Just kidding!");
    }
}
