package com.switchfully.Exceptions;

public class MandatoryFieldException extends NullPointerException{

    public MandatoryFieldException(String s) {
        super(s);
    }
}
