package mobile.JS.ApiControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mobile.JS.businnes.abstracts.BookService;
import mobile.JS.entities.Book;

@RestController
@RequestMapping("/api/books")
public class Controller {
	@Autowired
private BookService bookService;
	@GetMapping("/getall")
	public List<Book> getAll() {
		return this.bookService.getAll();
	}
	@PostMapping("/add") 
	public void add(Book book) {
		this.bookService.add(book);
		
	}
}
