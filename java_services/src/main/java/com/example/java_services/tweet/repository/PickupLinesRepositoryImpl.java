package com.example.java_services.tweet.repository;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class PickupLinesRepositoryImpl implements PickupLinesRepository {
    @Override
    public ArrayList<String> getPickupLinesContent() {
        return new ArrayList<String>(Arrays.asList("1", "2", "3", "4"));
    }
}
