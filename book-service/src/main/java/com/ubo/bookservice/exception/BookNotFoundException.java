package com.ubo.bookservice.exception;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(String id) {
        super("Book with id " + id + " not found");
    }
}
