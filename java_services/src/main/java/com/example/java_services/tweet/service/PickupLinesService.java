package com.example.java_services.tweet.service;

import com.example.java_services.tweet.domain.PickupLines;
import java.util.Optional;

public interface PickupLinesService {
    /**
     * Randomly get a PickupLines from DB
     */
    Optional<PickupLines> getPickupLines();
}
