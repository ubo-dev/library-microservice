package com.ubo.bookservice.dto;

public record UpdateBookRequest(String title, String author, String year, String isbn, String pressName) {
}
