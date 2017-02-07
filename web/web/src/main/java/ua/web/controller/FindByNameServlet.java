package ua.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.web.entity.Book;
import ua.web.service.BookService;
import ua.web.serviceImpl.BookServiceImpl;

public class FindByNameServlet extends HttpServlet{

protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		BookService bookService = HomeServlet.context.getBean(BookServiceImpl.class);
		
		String nameBook = req.getParameter("findBookByName");
		
		Book book = bookService.findByName(nameBook);
		
		req.setAttribute("BookIn", book);
		
		req.getRequestDispatcher("/views/findPage.jsp").forward(req, resp);
	}
}
