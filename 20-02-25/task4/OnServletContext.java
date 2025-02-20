package servletpackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletContext;

@WebServlet("/OnServletContext")
public class OnServletContext extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        ServletContext context = getServletContext();
        String param1 = context.getInitParameter("n1");
        String param2 = context.getInitParameter("n2");

        out.println("<h2>ServletContext Example</h2>");
        out.println("<p>Value of n1: " + param1 + "</p>");
        out.println("<p>Value of n2: " + param2 + "</p>");
    }
}
