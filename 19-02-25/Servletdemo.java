package servlet;
	import jakarta.servlet.ServletException;
	import jakarta.servlet.http.HttpServlet;
	import jakarta.servlet.http.HttpServletRequest;
	import jakarta.servlet.http.HttpServletResponse;
	import jakarta.servlet.annotation.WebServlet;
	import java.io.IOException;
	import java.io.PrintWriter;
	@WebServlet("/demo") 
	/**
	 * Servlet implementation class MyFirstServlet
	 */
	public class Servletdemo extends HttpServlet {
		private static final long serialVersionUID = 1L;


		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			response.getWriter().append("Servlet example ").append(request.getContextPath());
			response.setContentType("text/html");
	        response.getWriter().println("<h1>Hello, Servlet!</h1>");
	             
		       PrintWriter pwriter = response.getWriter();    
		       pwriter.println("<html><body>");
		       pwriter.println("<h2>Html file from Servlet!</h2>");
		       pwriter.println("</body></html>");
	}
	}