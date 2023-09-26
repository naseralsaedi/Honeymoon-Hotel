package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.sql.ResultSet;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style1.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body class=\"edit-page\">\n");
      out.write("        <h1>Edit Page</h1>\n");
      out.write("        <form action=\"UpdateData\" method=\"post\" class=\"database\">\n");
      out.write("\n");
      out.write("            <table align =\"center\"   color=\"black\" width =\"20%\" class=\"table-data12\" >\n");
      out.write("                ");
ResultSet rs = (ResultSet) request.getAttribute("EditDataTojsp");
                    if (rs.next()) {
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


                
      out.write("   \n");
      out.write("                <tr>\n");
      out.write("                    <td>ID</td>\n");
      out.write("                    <td> <input type=\"text\" name=\"id\" value=");
      out.print(id);
      out.write(" >  </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Name</td>\n");
      out.write("                    <td> <input type=\"text\" name=\"name\" value=");
      out.print(name);
      out.write(">  </td>\n");
      out.write("                </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <td>gender</td>\n");
      out.write("                    <td><select class=\"select\" name=\"renttype\" style=\"width: 300px;\">\n");
      out.write("                            <option>");
      out.print(gender);
      out.write("</option>\n");
      out.write("                            <option disabled selected>Select a Gender:</option>\n");
      out.write("                            <option value=\"female\">Female</option>\n");
      out.write("                            <option value=\"male\">Male</option>\n");
      out.write("                        </select><br>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>Phone</td>\n");
      out.write("                    <td> <input type=\"text\" name=\"phone\" value=");
      out.print(phone);
      out.write(">  </td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>Email</td>\n");
      out.write("                    <td> <input type=\"text\" name=\"email\" value=");
      out.print(email);
      out.write(">  </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>age</td>\n");
      out.write("                    <td> <input type=\"text\" name=\"email\" value=");
      out.print(age);
      out.write(">  </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>arrival</td>\n");
      out.write("                    <td> <input type=\"text\" name=\"email\" value=");
      out.print(arrival);
      out.write(">  </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>leaving</td>\n");
      out.write("                    <td> <input type=\"text\" name=\"email\" value=");
      out.print(leaving);
      out.write(">  </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>num</td>\n");
      out.write("                    <td> <input type=\"text\" name=\"email\" value=");
      out.print(num);
      out.write(">  </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>total</td>\n");
      out.write("                    <td> <input type=\"text\" name=\"email\" value=");
      out.print(total);
      out.write(">  </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Room Type</td>\n");
      out.write("                    <td><select  class=\"select\" name=\"cartype\" style=\"width: 300px;\">\n");
      out.write("                            <option>");
      out.print(roomtype);
      out.write("</option>\n");
      out.write("                            <option disabled selected>Select a Room</option>\n");
      out.write("                            <option value=\"single\">Single</option>\n");
      out.write("                            <option value=\"twin\">Twin</option>\n");
      out.write("                            <option value=\"king\">King</option>\n");
      out.write("                            <option value=\"deluxe\">Deluxe</option>\n");
      out.write("                        </select><br>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("             \n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td> </td>\n");
      out.write("                    <td> <input type=\"submit\" value=\"Update\" name= \"update\" style=\"background: #111120; color: white;\" /> </td>\n");
      out.write("                </tr>                \n");
      out.write("                ");
 }
      out.write("     \n");
      out.write("            </table>\n");
      out.write("        </form> \n");
      out.write("    </body> \n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
