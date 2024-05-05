package com.ubo.bookservice.service;

import com.ubo.bookservice.dto.BookDto;
import com.ubo.bookservice.dto.BookIdDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {

    List<BookDto> getAllBooks();

    BookDto getBookById(String id);

    BookIdDto getByIsbn(String isbn);

    BookDto getBookDetailsById(String id);
}
