package com.switchfully.Exceptions;

public class InvalidPriceException extends IllegalArgumentException{
    public InvalidPriceException(String message) {
        super(message);
    }
}
