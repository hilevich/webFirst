package ua.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.web.entity.Book;
import ua.web.service.BookService;
import ua.web.serviceImpl.BookServiceImpl;


public class SaveServlet extends HttpServlet{

protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		BookService bookService = 
				 HomeServlet.context.getBean(BookServiceImpl.class);
		

		
		String nameBook = req.getParameter("bookNameSave");
		String numberPageString =req.getParameter("numberPegeSave");
		int numberPageInt = 0;
		String nameAutor = req.getParameter("autorNameSave");
		try {
			if((numberPageString==null)||(numberPageString.equalsIgnoreCase("0"))){
				numberPageInt = 0;
			}
			else{
				numberPageInt = Integer.valueOf(numberPageString);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		Book book = new Book(nameBook, numberPageInt, nameAutor);
		
		bookService.saveBook(book);
		
	//	req.setAttribute("userIn", user);
		
		req.getRequestDispatcher("index.jsp").forward(req, resp);
		
		
	}
}
