package com.example.java_services.tweet.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity; 
import javax.persistence.Column; 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType; 
import javax.persistence.Id; 

@RequiredArgsConstructor
@Getter
@Entity
public class PickupLines {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="PICKUPLINE_ID")
    private Long id;
    
    private final String content;

    PickupLines(){
        this("A lame one");
    }
}
