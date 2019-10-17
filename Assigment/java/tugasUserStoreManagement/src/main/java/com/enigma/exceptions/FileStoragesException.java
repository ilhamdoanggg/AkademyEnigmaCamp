package com.enigma.exceptions;

public class FileStoragesException extends RuntimeException {
    public FileStoragesException(String message) {
        super(message);
    }
    public FileStoragesException(String message, Throwable cause) {
        super(message, cause);
    }
}
