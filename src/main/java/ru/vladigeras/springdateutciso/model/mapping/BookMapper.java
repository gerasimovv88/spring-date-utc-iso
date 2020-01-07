package ru.vladigeras.springdateutciso.model.mapping;

import ru.vladigeras.springdateutciso.model.domain.BookDomain;
import ru.vladigeras.springdateutciso.model.dto.Book;
import ru.vladigeras.springdateutciso.model.dto.NewBook;

/**
 * @author vladi_geras on 07.01.2020
 */
public class BookMapper {
	private BookMapper() {
	}

	public static BookDomain of(NewBook from) {
		return new BookDomain()
				.setName(from.getName())
				.setAuthor(from.getAuthor())
				.setPublishedDate(from.getPublishedDate());
	}

	public static Book of(BookDomain from) {
		return new Book()
				.setId(from.getId())
				.setCreatedDate(from.getCreatedDate())
				.setDeleted(from.isDeleted())
				.setName(from.getName())
				.setAuthor(from.getAuthor())
				.setPublishedDate(from.getPublishedDate());
	}
}
