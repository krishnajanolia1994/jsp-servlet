

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class f_server extends HttpServlet {

   
   
    public void doGet(HttpServletRequest r, HttpServletResponse res)
            throws ServletException, IOException {
       PrintWriter pr=res.getWriter();
       pr.println("in first servelet");
       int n=Integer.parseInt(r.getParameter("n1"));
       if(n==1)
       {
           try {
               Thread.sleep(2000);
           } catch (InterruptedException ex) {
               Logger.getLogger(f_server.class.getName()).log(Level.SEVERE, null, ex);
           }
           res.sendRedirect("second");
       }
       else 
           pr.println("remain in first servlet");
    }

    

}
