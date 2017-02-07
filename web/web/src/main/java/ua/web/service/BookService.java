package ua.web.service;


import ua.web.entity.Book;

public interface BookService {

		void saveBook(Book book);
		
		void deleteBookById(int idBook);
		
		Book findBookById(int idBook);
		
		void editBookById(int idBook, String nameBook, int numberPage, String nameAutor);
		
		Book findByName(String name);
}
