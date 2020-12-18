package com.company;

public class EmptyStringException extends Exception {
    public EmptyStringException() {
        super("Student's personal info is missing");
    }

}
