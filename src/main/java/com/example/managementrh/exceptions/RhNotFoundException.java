package com.example.managementrh.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RhNotFoundException extends RuntimeException{
    public RhNotFoundException(String message){
        super(message);
    }
}
