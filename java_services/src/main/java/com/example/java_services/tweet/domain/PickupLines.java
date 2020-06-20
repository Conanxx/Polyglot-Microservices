package com.example.java_services.tweet.domain;

import lombok.Getter;

import javax.persistence.Entity; 
import javax.persistence.Column; 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType; 
import javax.persistence.Id; 


@Getter
@Entity
public class PickupLines {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="PICKUPLINE_ID")
    private Long id;
    
    private final String content;

    public PickupLines(String content){
        this.content = content;
    }
}
