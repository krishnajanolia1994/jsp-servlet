

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class second extends HttpServlet {

    
    protected void doGet(HttpServletRequest r, HttpServletResponse res)
            throws ServletException, IOException {
        PrintWriter pr=res.getWriter();
        pr.println("h1");
        pr.println("in second servlet");
        pr.println("/h1");
        
    }


}
