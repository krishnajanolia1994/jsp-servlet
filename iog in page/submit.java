

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class submit extends HttpServlet {

    protected void doGet(HttpServletRequest r, HttpServletResponse res)
            throws ServletException, IOException {
        String uname=r.getParameter("user_name");
        String pass=r.getParameter("user_password");
        if(uname.equals("krishna") && pass.equals("janoliya"))
        {
            HttpSession s=r.getSession();
            s.setAttribute("uname", uname);
            res.sendRedirect("video.jsp");
        }
    }

   
   
}
