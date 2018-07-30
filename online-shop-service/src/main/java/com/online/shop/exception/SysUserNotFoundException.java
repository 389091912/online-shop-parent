package com.online.shop.exception;

/**
 * Created by IntelliJ IDEA.
 * User: wsy
 * Date: 2018-07-22
 * Time: 23:20
 */
public class SysUserNotFoundException extends Exception {
    public SysUserNotFoundException() {
    }

    public SysUserNotFoundException(String message) {
        super( message );
    }

    public SysUserNotFoundException(String message, Throwable cause) {
        super( message, cause );
    }

    public SysUserNotFoundException(Throwable cause) {
        super( cause );
    }

    public SysUserNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super( message, cause, enableSuppression, writableStackTrace );
    }
}
