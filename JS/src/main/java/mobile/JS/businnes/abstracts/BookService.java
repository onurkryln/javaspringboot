package mobile.JS.businnes.abstracts;

import java.util.List;

import mobile.JS.entities.Book;

public interface BookService {
void add(Book book);
List<Book> getAll();
Book getByBookName(String bookName);
}
