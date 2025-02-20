package servletpackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class SendRedirect
 */
@WebServlet("/redirect")
public class SendRedirect extends HttpServlet {

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { 

			resp.sendRedirect("https://www.geeksforgeeks.org/url-rewriting-using-java-servlet/"); 	} }