package com.online.shop.exception;

/**
 * Created by IntelliJ IDEA.
 * User: wsy
 * Date: 2018-07-30
 * Time: 22:57
 */
public class CustomerNotFountException extends Exception {

    public CustomerNotFountException() {
    }

    public CustomerNotFountException(String message) {
        super( message );
    }

    public CustomerNotFountException(String message, Throwable cause) {
        super( message, cause );
    }

    public CustomerNotFountException(Throwable cause) {
        super( cause );
    }

    public CustomerNotFountException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super( message, cause, enableSuppression, writableStackTrace );
    }
}
