package com.example.library.book_service.repository;

import com.example.library.book_service.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Books, Integer> {
    // JpaRepository provides all basic CRUD operations.
}
