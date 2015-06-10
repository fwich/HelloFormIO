package it.wich.helloformio;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/greeter")
public class Greeter extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setHeader("Content-Type", "text/plain");
		resp.getWriter().println(greet(getName(req)));
		
	}
	
	private String getName(HttpServletRequest req) {
		String name = "Anonymous";
		if(req.getParameter("name") != null){
			name = req.getParameter("name").trim();
		}
		return name;
	}
	
	static String greet(String name){
		return "Hello, " + name;
	}
}
