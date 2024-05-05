package com.ubo.bookservice.dto;

import com.ubo.bookservice.model.Book;

public record BookDto(String id, String title, String author, String year, String isbn, String pressName) {
    public static BookDto convert(Book book) {
        return new BookDto(book.getId(), book.getTitle(), book.getAuthor(),
                       book.getBookYear(), book.getIsbn(), book.getPressName());
    }
}

