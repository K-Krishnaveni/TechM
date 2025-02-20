package servletpackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class InitParamExample
 */
@WebServlet("/IniParamExample")
public class InitParamExample extends HttpServlet {   
    
    protected void doGet(HttpServletRequest request, 
      HttpServletResponse response)
            throws ServletException, IOException {
  response.setContentType("text/html");
PrintWriter out = response.getWriter();      
      ServletConfig config=getServletConfig();        
      String address = config.getInitParameter("address");
	String email = config.getInitParameter("email");
	String phone = config.getInitParameter("phone");
out.print("Address: " + address + "\n");
	out.print("Email: " + email + "\n");
	out.print("Phone: " + phone + "");
      
      out.close();     
      }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

}
