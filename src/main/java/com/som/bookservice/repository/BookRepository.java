package com.som.bookservice.repository;

import com.som.bookservice.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository
        extends JpaRepository<Book, Long> {
}