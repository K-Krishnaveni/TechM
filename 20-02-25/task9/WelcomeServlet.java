package cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
	   private static final long serialVersionUID = 1L;
	       
	      protected void doGet(HttpServletRequest request, 
	            HttpServletResponse response)
	                   throws ServletException, IOException {
	        response.setContentType("text/html");  
	        PrintWriter out = response.getWriter();  
	        out.print("<h1>Valid application user.</h1>");  
	        out.close();    
	        }
	      }
