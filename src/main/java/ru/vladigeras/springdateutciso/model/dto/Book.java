package ru.vladigeras.springdateutciso.model.dto;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author vladi_geras on 07.01.2020
 */
public class Book {
	private Long id;

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private LocalDateTime createdDate;

	private boolean deleted;
	private String name;
	private String author;

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private LocalDate publishedDate;

	public Long getId() {
		return id;
	}

	public Book setId(Long id) {
		this.id = id;
		return this;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public Book setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
		return this;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public Book setDeleted(boolean deleted) {
		this.deleted = deleted;
		return this;
	}

	public String getName() {
		return name;
	}

	public Book setName(String name) {
		this.name = name;
		return this;
	}

	public String getAuthor() {
		return author;
	}

	public Book setAuthor(String author) {
		this.author = author;
		return this;
	}

	public LocalDate getPublishedDate() {
		return publishedDate;
	}

	public Book setPublishedDate(LocalDate publishedDate) {
		this.publishedDate = publishedDate;
		return this;
	}
}
