package mobile.JS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mobile.JS.entities.Book;
@Repository
public interface BookDao extends JpaRepository<Book, Integer>{

	 Book getByBookName(String bookName);
}
