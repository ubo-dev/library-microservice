package com.ubo.libraryservice.service;

import com.ubo.bookservice.model.Library;
import com.ubo.libraryservice.dto.LibraryDto;
import com.ubo.libraryservice.repository.LibraryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LibraryServiceImpl implements LibraryService {

    private final LibraryRepository libraryRepository;

    public LibraryServiceImpl(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    public LibraryDto createLibrary() {
        Library newLibrary = libraryRepository.save(new Library());
        return new LibraryDto(newLibrary.getId());
    }

    public List<String> getAllLibraries() {

        return libraryRepository.findAll()
                .stream()
                .map(Library::getId)
                .collect(Collectors.toList());
    }
}