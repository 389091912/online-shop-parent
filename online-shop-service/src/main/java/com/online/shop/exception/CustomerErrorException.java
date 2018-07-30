package com.online.shop.exception;

/**
 * Created by IntelliJ IDEA.
 * User: wsy
 * Date: 2018-07-30
 * Time: 22:59
 */
public class CustomerErrorException extends Exception {
    public CustomerErrorException() {
    }

    public CustomerErrorException(String message) {
        super( message );
    }

    public CustomerErrorException(String message, Throwable cause) {
        super( message, cause );
    }

    public CustomerErrorException(Throwable cause) {
        super( cause );
    }

    public CustomerErrorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super( message, cause, enableSuppression, writableStackTrace );
    }
}
