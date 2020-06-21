package com.example.java_services.tweet.service;
import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class RandomServiceImpl implements RandomService {

    final static int MINIMUM = 1;
    
    @Override
    public Long generateRandomVal(Long no) {
        return new Random().longs(MINIMUM, MINIMUM, no).toArray()[0];
    }
}
