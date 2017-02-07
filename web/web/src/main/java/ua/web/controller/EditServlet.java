package ua.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.web.entity.Book;
import ua.web.service.BookService;
import ua.web.serviceImpl.BookServiceImpl;



public class EditServlet extends HttpServlet{

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		BookService bookService = 
				HomeServlet.context.getBean(BookServiceImpl.class);
		
		String idBookEdit = req.getParameter("bookIdEdit");
		
		String nameBookEdit = req.getParameter("bookNameEdit");
		
		String numberPageEdit = req.getParameter("numberPegeEdit");
		
		String nameAutorEdit = req.getParameter("autorNameEdit");
		
		int idBookEditInt = 0;
		
		int numbePageEditInt = 0;
		
		try {
			if((idBookEdit==null)||(idBookEdit.equals(0))){
				idBookEditInt = 0;
			}else{
				idBookEditInt = Integer.valueOf(idBookEdit);
			}
			
			if((numberPageEdit ==null)||(numberPageEdit.equals(0))){
				numbePageEditInt = 0;
			}else{
				numbePageEditInt = Integer.valueOf(numberPageEdit);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(idBookEditInt == 0){
		Book bookOld = bookService.findBookById(idBookEditInt);
		
		req.setAttribute("bookOldIn", bookOld);
		
		
		bookService.editBookById(idBookEditInt, nameBookEdit, numbePageEditInt, nameAutorEdit);
		
		Book bookNew = bookService.findBookById(idBookEditInt);
		
		req.setAttribute("bookNewIn", bookNew);
		
		}
		
		req.getRequestDispatcher("/views/edit.jsp").forward(req, resp);
	}
}
