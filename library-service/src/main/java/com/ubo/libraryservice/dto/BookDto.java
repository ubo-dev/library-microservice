package com.ubo.libraryservice.dto;

import com.ubo.bookservice.model.Library;

public record BookDto(String id, String title, String author, String year, String isbn, String pressName) {
    public static BookDto convert(String id, String title, String author, String year, String isbn, String pressName) {
        return new BookDto(id, title, author, year, isbn, pressName);
    }
}

