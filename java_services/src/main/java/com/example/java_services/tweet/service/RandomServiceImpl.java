package com.example.java_services.tweet.service;
import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class RandomServiceImpl implements RandomService {
    
    @Override
    public Long generateRandomVal() {
        return new Random().nextLong();
    }
}
