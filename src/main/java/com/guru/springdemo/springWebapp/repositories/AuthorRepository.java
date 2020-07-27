package com.guru.springdemo.springWebapp.repositories;

import com.guru.springdemo.springWebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
