package ua.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.web.entity.Book;
import ua.web.service.BookService;
import ua.web.serviceImpl.BookServiceImpl;

public class FindByIdServlet extends HttpServlet{

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		BookService bookService = HomeServlet.context.getBean(BookServiceImpl.class);
		
		String id = req.getParameter("bookIdFind");
		
		int idInt = 0;
		
		try {
			idInt = Integer.valueOf(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Book book = bookService.findBookById(idInt);
		
		req.setAttribute("BookIn", book);
		
		req.getRequestDispatcher("/views/findPage.jsp").forward(req, resp);
	}
}
