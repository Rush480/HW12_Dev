package org.example.app.Exceptions;

public class DuplicateIdException extends Exception {
    private final String id;

    public DuplicateIdException(String id, String message) {
        super(message);
        this.id = id;
    }

    public String getId() {
        return id;
    }
}