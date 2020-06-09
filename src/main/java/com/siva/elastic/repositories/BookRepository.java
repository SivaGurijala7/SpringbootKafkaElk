package com.siva.elastic.repositories;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.siva.model.Book;

public interface BookRepository extends ElasticsearchRepository<Book, Integer> {

}
