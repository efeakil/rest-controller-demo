package com.codersnitch.restcontrollerdemo.rest;

public class StudentNotFoundException extends RuntimeException {
    
    private int id;

    public StudentNotFoundException(String message) {
        super(message);
    }

    public StudentNotFoundException(Throwable cause) {
        super(cause);
    }

    public StudentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    
}