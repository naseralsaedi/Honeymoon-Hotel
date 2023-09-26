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
@WebServlet(urlPatterns = {"/getdata"})
public class getdata extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    DatabaseConnection dbconn;
    Connection conn;
    Statement stmt;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {

            /* TODO output your page here. You may use following sample code. */
            String id = request.getParameter("id");
            String name = request.getParameter("name");
            int age = Integer.parseInt(request.getParameter("age"));
            String phone = request.getParameter("phone");
            String email = request.getParameter("email");
            String gender = request.getParameter("renttype");
            String arrival = request.getParameter("arrival");
            String leave = request.getParameter("leaving");

            String room_type = request.getParameter("cartype");
            int num = Integer.parseInt(request.getParameter("num"));
                double total = 0;

            if (age >= 18) {

                switch (room_type) {
                    case "Singlearoom":
                        total = num * 200;

                        break;
                    case "twinroom":
                        total = num * 250;

                        break;
                    case "kingroom":
                        total = num * 300;

                        break;
                    case "deluxe":
                        total = num * 350;

                        break;

                }

            } else {

                RequestDispatcher rd = request.getRequestDispatcher("age.html");
                rd.forward(request, response);
                conn = dbconn.closeConn();

            }

            dbconn = new DatabaseConnection();
            conn = dbconn.setConn();
            stmt = conn.createStatement();

            // Insert into DB
            String str = "insert into book values ("
                    + "'" + id + "', "
                    + "'" + name + "', "
                    + "'" + gender + "', "
                    + "'" + phone + "',"
                    + "'" + email + "', "
                    + "'" + age + "', "
                    + "'" + arrival + "', "
                    + "'" + leave + "', "
                    + "'" + num + "',"
                    + "'" + total + "',"
                    + "'" + room_type + "'"
                    + ")";
            stmt.executeUpdate(str);
        } catch (Exception e) {
            out.println("ERROR: Insert into DB: " + e);
            return;
        }

        // After storing data successfully forward to index.jsp  
        //Close database
        RequestDispatcher rd = request.getRequestDispatcher("datainserted.html");
        rd.forward(request, response);
        conn = dbconn.closeConn();
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
