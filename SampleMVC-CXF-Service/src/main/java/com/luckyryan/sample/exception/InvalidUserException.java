package com.luckyryan.sample.exception;

/**
 * User: ryan
 * Date: 2/20/13
 */
public class InvalidUserException extends RuntimeException {

    public InvalidUserException(String s) {
        super(s);
    }
}
