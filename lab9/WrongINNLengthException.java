package com.company;

public class WrongINNLengthException extends Exception {

    public WrongINNLengthException() {
        super("There should be 12 digits in INN");
    }

}
