package com.siva.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "indexsiva", type = "book", shards = 2)
public class Book {
	private String name;
	private String author;
	@Id
	private int id;

	public Book() {
		super();
	}

	public Book(String name, String author, int id) {
		super();
		this.name = name;
		this.author = author;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
