package cookie;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MyFilter
 */
@WebServlet("/MyFilter")
public class MyFilter implements Filter {
    private FilterConfig filterConfig;
    
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }
public void doFilter(ServletRequest request, 
            ServletResponse response,FilterChain chain) 
                       throws IOException, ServletException {
response.setContentType("text/html"); 
        PrintWriter out = response.getWriter();
        String appUser = filterConfig.getInitParameter("appUser");
        if (appUser != null && appUser.equals("jai")) {
            chain.doFilter(request, response); 
        } else {
            out.print("Invalid application user.");
        }
}  
    
    public void destroy() { }
    }

