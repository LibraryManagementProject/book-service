package com.example.library.book_service.repository;

import com.example.library.book_service.model.BooksBorrowed;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BooksBorrowedRepository extends JpaRepository<BooksBorrowed, Integer> {
    List<BooksBorrowed> findByUserIdAndReturnDateIsNull(int userId);
}
