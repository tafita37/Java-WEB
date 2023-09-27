package mpiasa;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.ArrayList;
import java.util.List;


    public class EmplistServelet extends HttpServlet {
        protected void doGet(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException {
               // List<Emp>list= new ArrayList<>();
                ServletContext context = this.getServletContext(); 

                List<Emp>list= (List<Emp>)context.getAttribute("dolist");
                

                public List <Emp> getlisteEmp( ) 
                    

        }
    } 