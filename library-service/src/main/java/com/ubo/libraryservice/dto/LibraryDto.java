package com.ubo.libraryservice.dto;

import java.util.List;

public record LibraryDto(String libraryId, List<BookDto> bookDtoList) {
    public LibraryDto(String id) {
        this(id, null);
    }
}
