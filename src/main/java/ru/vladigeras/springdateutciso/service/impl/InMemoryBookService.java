package ru.vladigeras.springdateutciso.service.impl;

import org.springframework.stereotype.Service;
import ru.vladigeras.springdateutciso.model.domain.BookDomain;
import ru.vladigeras.springdateutciso.model.dto.NewBook;
import ru.vladigeras.springdateutciso.model.mapping.BookMapper;
import ru.vladigeras.springdateutciso.service.BookService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author vladi_geras on 07.01.2020
 */
@Service
public class InMemoryBookService implements BookService {
	private final List<BookDomain> books = new ArrayList<>();

	@Override
	public List<BookDomain> get() {
		return books;
	}

	@Override
	public void add(NewBook newBook) {
		BookDomain book = BookMapper.of(newBook);
		book.setDeleted(false);
		book.setCreatedDate(LocalDateTime.now());
		
		synchronized (books) {
			book.setId((long) books.size());
			books.add(book);
		}
	}
}
