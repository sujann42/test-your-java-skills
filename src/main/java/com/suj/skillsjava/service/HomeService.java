package com.suj.skillsjava.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class HomeService {

    public String getWelcomeMessage(){
        return "Get your list of students.";
    }

    public LocalDate getUpdatedDate(){
        return LocalDate.now();
    }


}
