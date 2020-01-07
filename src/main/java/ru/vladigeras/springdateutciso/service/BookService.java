package ru.vladigeras.springdateutciso.service;

import ru.vladigeras.springdateutciso.model.domain.BookDomain;
import ru.vladigeras.springdateutciso.model.dto.NewBook;

import java.util.List;

/**
 * @author vladi_geras on 07.01.2020
 */
public interface BookService {
	List<BookDomain> get();

	void add(NewBook book);
}
