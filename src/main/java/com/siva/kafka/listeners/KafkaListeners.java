package com.siva.kafka.listeners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.siva.elastic.repositories.BookRepository;
import com.siva.model.Book;

@Service
public class KafkaListeners {
	@Autowired
	private BookRepository repo;

	@KafkaListener(topics = "SpringBootTopic", groupId = "group")
	public void process(Book book) {
		repo.save(book);
	}

}
