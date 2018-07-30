package com.online.shop.exception;

/**
 * Created by IntelliJ IDEA.
 * User: wsy
 * Date: 2018-07-29
 * Time: 20:35
 */
public class ProductTypeExistException extends Exception {

    public ProductTypeExistException() {
    }

    public ProductTypeExistException(String message) {
        super( message );
    }

    public ProductTypeExistException(String message, Throwable cause) {
        super( message, cause );
    }

    public ProductTypeExistException(Throwable cause) {
        super( cause );
    }

    public ProductTypeExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super( message, cause, enableSuppression, writableStackTrace );
    }
}
