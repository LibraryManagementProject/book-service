package com.example.library.book_service.service;

import com.example.library.book_service.model.Books;
import com.example.library.book_service.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    // Fetch all books
    public List<Books> getAllBooks() {
        return bookRepository.findAll();
    }

    // Fetch book by ID
    public Optional<Books> getBookById(Integer id) {
        return bookRepository.findById(id);
    }

    // Add a new book
    public Books addBook(Books book) {
        return bookRepository.save(book);
    }

    // Delete a book by ID
    public void deleteBook(Integer id) {
        bookRepository.deleteById(id);
    }
}
