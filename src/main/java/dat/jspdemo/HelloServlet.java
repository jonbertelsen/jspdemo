package dat.jspdemo;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "IndexServlet", value = "/index")
public class HelloServlet extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
       String msg = "Welcome to this page";
       request.setAttribute("message", msg);
       request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}