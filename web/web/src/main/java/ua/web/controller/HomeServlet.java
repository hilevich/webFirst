package ua.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HomeServlet extends HttpServlet {

	
	static ConfigurableApplicationContext context; 
	
	static{
	
		context = new ClassPathXmlApplicationContext("/META-INF/appContext.xml");
		
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}
