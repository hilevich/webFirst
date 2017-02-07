package ua.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ua.web.entity.Book;



public interface BookDao extends JpaRepository<Book, Integer> {

	@Query("select d from Book d where d.nameBook=:name")
	public Book findBookByName(@Param("name")String nameBook);
}
