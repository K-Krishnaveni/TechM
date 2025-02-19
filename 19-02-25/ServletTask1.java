package servlet;
	import java.io.IOException;
	import jakarta.servlet.ServletException;
	import jakarta.servlet.annotation.WebServlet;
	import jakarta.servlet.http.HttpServlet;
	import jakarta.servlet.http.HttpServletRequest;
	import jakarta.servlet.http.HttpServletResponse;
	@WebServlet("/hello")
	public class ServletTask1 extends HttpServlet {
	    private static final long serialVersionUID = 1L;

	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        response.setContentType("text/html");
	        
	        response.getWriter().println(
	                "<!DOCTYPE html>" +
	                "<html>" +
	                "<head>" +
	                "<title>Styled Servlet</title>" +
	                "<style>" +
	                "body { font-family: Arial, sans-serif; background-color: #f0f8ff; text-align: center; padding: 50px; }" +
	                "h1 { color: #ff6347; }" +
	                "p { font-size: 18px; color: #333; }" +
	                ".box { background: pink; padding: 20px; border-radius: 10px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); display: inline-block; }" +
	                "</style>" +
	                "</head>" +
	                "<body>" +
	                "<div class='box'>" +
	                "<h1>Welcome to My Styled Servlet!</h1>" +
	                "<p>This is a simple servlet that returns an HTML page with some CSS styling.</p>" +
	                "</div>" +
	                "</body>" +
	                "</html>"
	        );
	    }
	}


