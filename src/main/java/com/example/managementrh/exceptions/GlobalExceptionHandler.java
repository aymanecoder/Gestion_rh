package com.example.managementrh.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(RhNotFoundException.class)
    public ResponseEntity<?> handleNotFoundException(RhNotFoundException exception , WebRequest request){
        ErrorResponse errorResponse = new ErrorResponse(new Date(),exception.getMessage(),request.getDescription(false));
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);

    }




}
