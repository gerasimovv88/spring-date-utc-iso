package ru.vladigeras.springdateutciso.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.vladigeras.springdateutciso.model.dto.BooksResponse;
import ru.vladigeras.springdateutciso.model.dto.NewBook;
import ru.vladigeras.springdateutciso.service.BookService;

/**
 * @author vladi_geras on 07.01.2020
 */
@RestController
@RequestMapping("/v1/books")
public class BookController {
	private final BookService bookService;

	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	@GetMapping("")
	@ResponseStatus(HttpStatus.OK)
	public BooksResponse get() {
		return new BooksResponse(bookService.get());
	}

	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public void add(@RequestBody NewBook book) {
		bookService.add(book);
	}
}
