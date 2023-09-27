package mpiasa;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.ArrayList;
import java.util.List;


    public class EmpAddServelet extends HttpServlet {

        protected void doPost(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException {


                res.setContentType("text/html");
                PrintWriter out = res.getWriter();

                List<Emp>dolist= new ArrayList<>();
                dolist.add(new Emp( req.getParameter("nom"), req.getParameter("prenom")));

                ServletContext context = this.getServletContext();
                context.setAttribute("dolist",dolist);
                out.println("Vous etes dans AddServelet");
                
                    

        }
    } 



