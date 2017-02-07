package ua.web.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.web.dao.BookDao;
import ua.web.entity.Book;
import ua.web.service.BookService;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BookDao bookDao;
	
	@Override
	public void saveBook(Book book) {
	
		bookDao.save(book);
	}

	@Override
	public void deleteBookById(int idBook) {
		
		bookDao.delete(idBook);
		
	}

	@Override
	public Book findBookById(int idBook) {
		
		return bookDao.findOne(idBook);
	}

	@Override
	public void editBookById(int idBook, String nameBook, int numberPage, String nameAutor) {
		
		if(idBook!=0){
		Book book = findBookById(idBook);
		
		if(nameBook!=null){
			book.setNameBook(nameBook);
		}
		
		if(numberPage!=0){
			book.setNumberPage(numberPage);
		}
		
		if(nameAutor!=null){
			book.setNameAutor(nameAutor);
		}
		
		bookDao.save(book);
		}
	}

	@Override
	public Book findByName(String name) {
		
		return bookDao.findBookByName(name);
	}

}
