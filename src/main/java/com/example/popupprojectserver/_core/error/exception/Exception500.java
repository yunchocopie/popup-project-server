package com.example.popupprojectserver._core.error.exception;

public class Exception500 extends RuntimeException{
    private final Integer errorCode = 500;

    public Exception500(String msg) {
        super(msg);
    }
}
