package com.switchfully.Exceptions;

public class UnauthorizedException extends RuntimeException {
    public UnauthorizedException(String s) {
        super(s);
    }
}
