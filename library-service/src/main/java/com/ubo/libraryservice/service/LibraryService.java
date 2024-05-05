package com.ubo.libraryservice.service;

import com.ubo.libraryservice.dto.LibraryDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LibraryService {

   //LibraryDto getAllBooksInLibraryById(String id);

   LibraryDto createLibrary();

   //void addBookToLibrary(CreateBookRequest request);
    List<String> getAllLibraries();
}
