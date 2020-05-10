package com.example.java_services.tweet.domain;

import lombok.Getter;

@Getter
public class PickupLines {

    private final String content;

    public PickupLines(String content){
        this.content = content;
    }
}
