package com.ubo.libraryservice.exception;

public class LibraryNotFoundException extends RuntimeException {
    public LibraryNotFoundException(String id) {
        super("Book with id " + id + " not found");
    }
}
