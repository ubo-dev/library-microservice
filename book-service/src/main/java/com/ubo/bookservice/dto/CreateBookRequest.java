package com.ubo.bookservice.dto;

public record CreateBookRequest(String title, String author, String year, String isbn, String pressName) {
}
