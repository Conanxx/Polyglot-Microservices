package com.example.java_services.tweet.controller;

import com.example.java_services.tweet.domain.PickupLines;
import com.example.java_services.tweet.service.PickupLinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

// package com.example.java_services.tweet.domain.PickupLines;
// package com.example.java_services.tweet.service.PickupLinesService;

@RestController
@RequestMapping("/lines")
public class PickupLinesController {

    private final PickupLinesService pkService;

    @Autowired
    public PickupLinesController(final PickupLinesService pkService){
        this.pkService = pkService;
    }

    @GetMapping("/random")
    Optional<PickupLines> getRandomLines() {
        return pkService.getPickupLines();
    }
    
}
