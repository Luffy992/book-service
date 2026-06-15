package com.som.bookservice.service;

import com.som.bookservice.entity.Book;
import com.som.bookservice.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository
            bookRepository;

    public Book createBook(
            Book book) {

        return bookRepository.save(
                book
        );
    }

    public List<Book> getAllBooks() {

        return bookRepository.findAll();
    }

    public Book getBookById(
            Long id) {

        return bookRepository
                .findById(id)
                .orElseThrow(
                        () -> new RuntimeException(
                                "Book not found"
                        )
                );
    }

    public Book updateBook(
            Long id,
            Book updatedBook) {

        Book book =
                bookRepository
                        .findById(id)
                        .orElseThrow(
                                () -> new RuntimeException(
                                        "Book not found"
                                )
                        );

        book.setTitle(
                updatedBook.getTitle()
        );

        book.setAuthor(
                updatedBook.getAuthor()
        );

        book.setPrice(
                updatedBook.getPrice()
        );

        book.setStock(
                updatedBook.getStock()
        );

        return bookRepository.save(
                book
        );
    }

    public String deleteBook(
            Long id) {

        bookRepository.deleteById(
                id
        );

        return "Book Deleted Successfully";
    }

    public Page<Book> getBooks(
            int page,
            int size) {

        return bookRepository.findAll(
                PageRequest.of(
                        page,
                        size
                )
        );
    }
}