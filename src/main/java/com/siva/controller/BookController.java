package com.siva.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siva.model.Book;

@RestController
@RequestMapping("kafka")
public class BookController {
	@Autowired
	private KafkaTemplate<String, Book> kafkaTemplate;
	
	private static final String TOPIC = "SpringBootTopic";

	@PostMapping("/publish")
	public String publishBook(@RequestBody Book book) {
		kafkaTemplate.send(TOPIC, book);
		return "Published Successfully";
	}
}
