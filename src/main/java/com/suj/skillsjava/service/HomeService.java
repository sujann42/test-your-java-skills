package com.suj.skillsjava.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class HomeService {

    public String getWelcomeMessage(){
        return "If you are a Java enthusiast, you are the right place!!!";
    }

    public LocalDate getUpdatedDate(){
        return LocalDate.now();
    }


}
