package com.toy_store.Exeption;

public class ToyException extends RuntimeException{

    /**
     * Toy creation exception
     * @param message - output message
     */
    public ToyException(String message) {
        super(message);
    }
    
}
