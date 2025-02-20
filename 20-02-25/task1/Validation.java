package servletpackage;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/link1")
public class Validation extends HttpServlet 
{    
   public void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException 
   {
       response.setContentType("text/html");      
       PrintWriter pwriter = response.getWriter();                
       String name=request.getParameter("uname");      
       String pass=request.getParameter("upass");
       if(name.equals("Chaitanya") &&  pass.equals("beginnersbook"))
       {          
          RequestDispatcher dis=request.getRequestDispatcher("welcome");          
          dis.forward(request, response);      
       }
else
       {      
          pwriter.print("User name or password is incorrect!");          
          RequestDispatcher dis=request.getRequestDispatcher("form2.html");          
          dis.include(request, response);                             
          }}}