package com.guru.springdemo.springWebapp.repositories;

import com.guru.springdemo.springWebapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
