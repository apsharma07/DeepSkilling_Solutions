package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private String libraryName;
    private BookRepository bookRepository;

    // Constructor for injection
    public BookService(String libraryName) {
        this.libraryName = libraryName;
    }

    // Setter for BookRepository
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void printBookDetails() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("Book Title: " + bookRepository.getBookTitle());
    }
}
