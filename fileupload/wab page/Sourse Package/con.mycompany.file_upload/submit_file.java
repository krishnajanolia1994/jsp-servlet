
package com.mycompany.file_upload;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
/**
 *
 * @author student
 */
public class submit_file extends HttpServlet {

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());
        try {
            List<FileItem> list_file=sf.parseRequest(request);
            for(FileItem item : list_file)
            {
                try {
                    item.write(new File("/home/student/my_upload"+item.getName()));
                } catch (Exception ex) {
                    Logger.getLogger(submit_file.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        } catch (FileUploadException ex) {
            Logger.getLogger(submit_file.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

}
