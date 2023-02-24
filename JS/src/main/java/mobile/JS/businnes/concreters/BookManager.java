package mobile.JS.businnes.concreters;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mobile.JS.businnes.abstracts.BookService;
import mobile.JS.dataAccess.abstracts.BookDao;
import mobile.JS.entities.Book;
@Service
public class BookManager implements BookService {

	 private BookDao bookdao;
	@Override
	public void add(Book book) {
		// TODO Auto-generated method stub
		this.bookdao.save(book);
	}

	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		return this.bookdao.findAll();
	}

	@Override
	public Book getByBookName(String bookName) {
		// TODO Auto-generated method stub
		return this.bookdao.getByBookName(bookName);
	}

}
