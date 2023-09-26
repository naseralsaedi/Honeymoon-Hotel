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
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author in7rt
 */
@WebServlet(urlPatterns = {"/display"})
public class display extends HttpServlet {

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
    Statement stmt;
    ResultSet rs;
    DatabaseConnection dbconn;
    List lst = new ArrayList();


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            dbconn = new DatabaseConnection();
            conn = dbconn.setConn();
            stmt = conn.createStatement();
            String query = "select * from book order by id ";

            rs = stmt.executeQuery(query);
            //Extract data from resultset and fill in an arraylist
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                String phone = rs.getString("phone");
                String email = rs.getString("email");
                String age = rs.getString("age");
                String arrival = rs.getString("arrival");
                String leaving = rs.getString("leaving");
                String num = rs.getString("num");
                String total = rs.getString("total");
                String roomtype = rs.getString("roomtype");

                 lst.add(id);
                lst.add(name);
                lst.add(gender);
                lst.add(phone);
                lst.add(email);
                lst.add(age);
                lst.add(arrival);
                lst.add(leaving);
                lst.add(num);
                lst.add(total);
                lst.add(roomtype);

            }
            rs.close();

        } catch (Exception e) {
            RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
            rd.forward(request, response);

        }

//        // Forwarding data to displayrecord.jsp
        request.setAttribute("hotel", lst);
        RequestDispatcher rd = request.getRequestDispatcher("displayrent.jsp");
        rd.forward(request, response);
        lst.clear();
        out.close();


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
