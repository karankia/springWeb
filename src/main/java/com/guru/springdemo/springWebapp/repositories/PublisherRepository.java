package com.guru.springdemo.springWebapp.repositories;

import com.guru.springdemo.springWebapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
