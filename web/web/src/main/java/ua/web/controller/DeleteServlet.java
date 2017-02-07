package ua.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.web.entity.Book;
import ua.web.service.BookService;
import ua.web.serviceImpl.BookServiceImpl;

public class DeleteServlet {

protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		BookService bookService = HomeServlet.context.getBean(BookServiceImpl.class);
		
		String id = req.getParameter("deleteBook");
		
		int idInt = 0;
		
		try {
			idInt = Integer.valueOf(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(idInt!=0){
		
		bookService.deleteBookById(idInt);
		
		}
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}
