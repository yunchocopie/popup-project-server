package com.example.popupprojectserver._core.error.exception;

public class Exception400 extends RuntimeException{
    private final Integer errorCode = 400;

    public Exception400(String msg) {
        super(msg);
    }
}