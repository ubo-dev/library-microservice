package com.ubo.libraryservice.repository;

import com.ubo.bookservice.model.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends JpaRepository<Library, String> {
}