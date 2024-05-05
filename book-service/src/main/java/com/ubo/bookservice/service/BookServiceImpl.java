package com.ubo.bookservice.service;

import com.ubo.bookservice.dto.BookDto;
import com.ubo.bookservice.dto.BookIdDto;
import com.ubo.bookservice.exception.BookNotFoundException;
import com.ubo.bookservice.repository.BookRepository;

import java.util.List;

public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<BookDto> getAllBooks() {
        return bookRepository.findAll()
                .stream()
                .map(BookDto::convert)
                .toList();
    }

    public BookDto getBookById(String id) {
        return bookRepository.findById(id)
                .map(BookDto::convert)
                .orElseThrow(
                        () -> new BookNotFoundException("Book not found")
                );
    }

    public BookIdDto getByIsbn(String isbn) {
        return bookRepository.findByIsbn(isbn)
                .map(book -> new BookIdDto(book.getId(), book.getIsbn()))
                .orElseThrow(() -> new BookNotFoundException("Book could not found by isbn: " + isbn));
    }


    public BookDto getBookDetailsById(String id) {
        return bookRepository.findById(id)
                .map(BookDto::convert)
                .orElseThrow(() -> new BookNotFoundException("Book could not found by id:" + id));
    }
}
