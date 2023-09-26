/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author in7rt
 */
@WebServlet(urlPatterns = {"/EditRecord"})
public class EditRecord extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    Connection conn;
    Statement stm;
    ResultSet rs;
    DatabaseConnection dbconn;
    String id, query;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

             id = request.getParameter("id_new");
            out.print(id);
        try {
//            dbconn = new DatabaseConnection();
//            conn = dbconn.setConn();
//            stm = conn.createStatement();
       
           
//            query = "select * from tablerent where id=" + id;
//            rs = stm.executeQuery(query);
//            
//                 String id = rs.getString("id");
//                String name = rs.getString("name");
//                String age = rs.getString("age");
//                String phone = rs.getString("phone");
//                String email = rs.getString("email");
//                String cartype = rs.getString("cartype");
//                String renttype = rs.getString("renttype");
//                String num = rs.getString("num");
//                String price = rs.getString("price");
//                out.print(id+name+age);
            

        } 
        catch (Exception e) {
        }
//        request.setAttribute("EditDataTojsp", rs);
//        RequestDispatcher rd = request.getRequestDispatcher("edit.jsp");
//        rd.forward(request, response);

        dbconn.closeConn();

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
