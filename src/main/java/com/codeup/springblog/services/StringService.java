package com.codeup.springblog.services;


import org.springframework.stereotype.Service;

@Service
public class StringService {

    public String returnInCaps(String string) {
        return string.toUpperCase();
    }

}
