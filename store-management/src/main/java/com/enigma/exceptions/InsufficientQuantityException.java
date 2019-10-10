package com.enigma.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class InsufficientQuantityException extends RuntimeException{

    public InsufficientQuantityException(String messages) {
        super(messages);
    }

    public InsufficientQuantityException() {
        super("Ini default Messages");
    }
}
