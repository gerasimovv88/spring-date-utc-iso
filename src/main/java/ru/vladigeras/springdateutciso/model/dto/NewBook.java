package ru.vladigeras.springdateutciso.model.dto;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

/**
 * @author vladi_geras on 07.01.2020
 */
public class NewBook {
	private String name;
	private String author;

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private LocalDate publishedDate;

	public String getName() {
		return name;
	}

	public NewBook setName(String name) {
		this.name = name;
		return this;
	}

	public String getAuthor() {
		return author;
	}

	public NewBook setAuthor(String author) {
		this.author = author;
		return this;
	}

	public LocalDate getPublishedDate() {
		return publishedDate;
	}

	public NewBook setPublishedDate(LocalDate publishedDate) {
		this.publishedDate = publishedDate;
		return this;
	}
}
