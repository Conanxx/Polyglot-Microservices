package com.example.java_services.tweet.service;

import com.example.java_services.tweet.domain.PickupLines;
import com.example.java_services.tweet.repository.PickupLinesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PickupLinesServiceImp implements PickupLinesService {

    private PickupLinesRepository pklRepo;
    private RandomService rdService;
        
    @Autowired
    public PickupLinesServiceImp(final PickupLinesRepository pklRepo, final RandomService rdService){
        this.pklRepo = pklRepo;
        this.rdService = rdService;
    }
    
    @Override
    public Optional<PickupLines> getPickupLines() {
        Long count = pklRepo.count();
        Long randomId = rdService.generateRandomVal(count);
        return pklRepo.findById(randomId);
    }
}
