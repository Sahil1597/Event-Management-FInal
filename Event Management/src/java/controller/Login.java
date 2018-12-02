/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import modal.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modal.User;
import modal.UserDAO;

/**
 *
 * @author Sahil
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String Username = request.getParameter("Username");
        String Password = request.getParameter("Password");
        String abc = request.getParameter("abc");
        // System.out.println(Username + " " + Password);
        if(abc.equals("admin"))
        {
			AdminDAO adao = new AdminDAO();
			
			if(adao.validate(Username, Password))
			{
				HttpSession session = request.getSession();
				session.setAttribute("name",adao.getName());
				
				out.println("<script>");
				out.println("alert('Admin Login successful');");
				out.println("location = 'enter.jsp';");
				out.println("</script>");
			}
			else
			{
				out.println("<script>");
				out.println("alert('Invalid');");
				out.println("location = 'login.jsp';");
				out.println("</script>");
			}
        }
        else
        {
//            UserDAO udao = new UserDAO();
//
//            if(udao.validate(Username, Password))
//            {
//                HttpSession session = request.getSession();
//                session.setAttribute("name",udao.getFname());
//                session.setAttribute("ph",udao.getPh());
//                out.println("<script>");
//                out.println("alert('User Login successful');");
//                out.println("location = 'enter.jsp';");
//                out.println("</script>");
//            }
//            else
//            {
//                out.println("<script>");
//                out.println("alert('Invalid');");
//                out.println("location = 'login.jsp';");
//                out.println("</script>");
//            }
//        }
        
        
			String fname = request.getParameter("Username");
			
			
			String password = request.getParameter("Password");
			
			User l = new User(fname,password);
			         System.out.println("l.name = " + l.getFname() + " l.pwd = " + l.getPassword());
			
			
			UserDAO udao = new UserDAO(); 
			
			if(udao.validate(l))
			{
				 HttpSession session = request.getSession();
					session.setAttribute("name",udao.getFname());
					session.setAttribute("ph",udao.getPh());
					out.println("<script>");
					out.println("alert('User Login successful');");
					out.println("location = 'enter.jsp';");
					out.println("</script>");
			}
			else
			{
				out.println("<script>");
					out.println("alert('Invalid');");
					out.println("location = 'login.jsp';");
					out.println("</script>");
			}
		}
	}

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
