package com.example.java_services.tweet.service;

import com.example.java_services.tweet.domain.PickupLines;

public interface PickupLinesService {
    /**
     * Randomly get a PickupLines from DB
     */
    PickupLines getPickupLines();
}
