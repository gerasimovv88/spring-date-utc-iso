package ru.vladigeras.springdateutciso.model.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author vladi_geras on 07.01.2020
 */
public class BookDomain {
	private Long id;
	private LocalDateTime createdDate;
	private boolean deleted;
	private String name;
	private String author;
	private LocalDate publishedDate;

	public Long getId() {
		return id;
	}

	public BookDomain setId(Long id) {
		this.id = id;
		return this;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public BookDomain setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
		return this;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public BookDomain setDeleted(boolean deleted) {
		this.deleted = deleted;
		return this;
	}

	public String getName() {
		return name;
	}

	public BookDomain setName(String name) {
		this.name = name;
		return this;
	}

	public String getAuthor() {
		return author;
	}

	public BookDomain setAuthor(String author) {
		this.author = author;
		return this;
	}

	public LocalDate getPublishedDate() {
		return publishedDate;
	}

	public BookDomain setPublishedDate(LocalDate publishedDate) {
		this.publishedDate = publishedDate;
		return this;
	}
}
