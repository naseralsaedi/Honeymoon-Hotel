package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.Iterator;

public final class displayrent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style1.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <Script type=\"text/javascript\">\n");
      out.write("            function editRecord(id) {\n");
      out.write("                url = \"EditRecord\";\n");
      out.write("                window.location.href = \"http://localhost:8080/finalproject_1/\" + url + \"?id=\" + id;\n");
      out.write("            }\n");
      out.write("            function deleteRecord(id) {\n");
      out.write("                url = \"DeleteRecord\";\n");
      out.write("                window.location.href = \"http://localhost:8080/finalproject_1/\" + url + \"?id=\" + id;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        <div class=\"database\">\n");
      out.write("            ");
      out.write("\n");
      out.write("            <div class=\"continer\">\n");
      out.write("                <h1>Book Table</h1>\n");
      out.write("                <table align=\"center\" bordr=\"0\" border color=\"black\" cellpadding=\"1\" width=\"60%\" class=\"table-data\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td>ID</td>\n");
      out.write("                        <td>Name</td>\n");
      out.write("                        <td>Gender</td>\n");
      out.write("                        <td>Age</td>\n");
      out.write("                        <td>Phone</td>\n");
      out.write("                        <td>Email</td>\n");
      out.write("                        <td>Arrival date</td>\n");
      out.write("                        <td>Leave date</td>\n");
      out.write("                        <td>#Number of nights</td>\n");
      out.write("                        <td>Room type</td>\n");
      out.write("                        <td>Edit</td>\n");
      out.write("                        <td>Delete</td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
Iterator itr;
      out.write("\n");
      out.write("                    ");
List data = (List) request.getAttribute("hotel");
                        for (itr = data.iterator(); itr.hasNext();) {
                    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        ");
String s = (String) itr.next();
      out.write("\n");
      out.write("\n");
      out.write("                        <td> ");
      out.print(s);
      out.write("</td>\n");
      out.write("                        <td> ");
      out.print(itr.next());
      out.write("</td>             \n");
      out.write("                        <td> ");
      out.print(itr.next());
      out.write("</td>\n");
      out.write("                        <td> ");
      out.print(itr.next());
      out.write("</td>\n");
      out.write("                        <td> ");
      out.print(itr.next());
      out.write("</td>\n");
      out.write("                        <td> ");
      out.print(itr.next());
      out.write("</td>\n");
      out.write("                        <td> ");
      out.print(itr.next());
      out.write("</td>\n");
      out.write("                        <td> ");
      out.print(itr.next());
      out.write("</td>\n");
      out.write("                        <td> ");
      out.print(itr.next());
      out.write("</td>\n");
      out.write("                        <td> ");
      out.print(itr.next());
      out.write("</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        ");
      out.write("\n");
      out.write("                        <td><input type=\"submit\" value=\"Edit\" name=\"Edit\" onclick=\"editRecord(");
      out.print(s);
      out.write(");\"/></td>\n");
      out.write("                        <td><input type=\"submit\" value=\"Delete\" name=\"Delete\" onclick=\"deleteRecord(");
      out.print(s);
      out.write(");\"/></td>\n");
      out.write("\n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("                    </tr>       \n");
      out.write("                </table>\n");
      out.write("                <a href=\"index.html\" style=\"\n");
      out.write("                   text-decoration: none;\n");
      out.write("                   cursor: pointer;\n");
      out.write("                   font-size: 1.2rem;\n");
      out.write("                   background-color: #f1f1f1;\n");
      out.write("                   padding: 4px 18px;\n");
      out.write("                   border: 0;\n");
      out.write("                   border-radius: 6px;\n");
      out.write("                   \">Back</a>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
