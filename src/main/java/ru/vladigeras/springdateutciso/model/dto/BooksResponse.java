package ru.vladigeras.springdateutciso.model.dto;

import ru.vladigeras.springdateutciso.model.domain.BookDomain;
import ru.vladigeras.springdateutciso.model.mapping.BookMapper;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author vladi_geras on 07.01.2020
 */
public class BooksResponse {
	private List<Book> books;

	public BooksResponse(List<BookDomain> books) {
		if (books == null) {
			this.books = Collections.emptyList();
		} else {
			this.books = books
					.stream()
					.map(BookMapper::of)
					.collect(Collectors.toList());
		}
	}

	public List<Book> getBooks() {
		return books;
	}
}
