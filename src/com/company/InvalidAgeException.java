package com.company;

public class InvalidAgeException extends RuntimeException{
    public InvalidAgeException() {
    }

    public InvalidAgeException(String message) {
        super(message);
    }
}
