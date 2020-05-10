package com.example.java_services.tweet.repository;

import com.example.java_services.tweet.domain.PickupLines;

import java.util.ArrayList;

public interface PickupLinesRepository {
    ArrayList<PickupLines> getPickupLines();
}
