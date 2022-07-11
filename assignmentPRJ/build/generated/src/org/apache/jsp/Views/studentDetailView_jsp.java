package org.apache.jsp.Views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Student;

public final class studentDetailView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../CSS/studentDetailView.css\">\n");
      out.write("         \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <table style=\"width:100%\">\n");
      out.write("                <tr style=\"background-color:powderblue;\">\n");
      out.write("                    <td>Hello <a href=\"url\">truong gia binh</a></td>\n");
      out.write("                    <td>This is a Student Account</td>\n");
      out.write("                    <td><a href=\"url\">Log Out</a></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <div class = \"header\">\n");
      out.write("            <h1>Student Information</h1>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"wrap\">\n");
      out.write("            <div class=\"fleft\">\n");
      out.write("                <img src=\"https://upload.wikimedia.org/wikipedia/commons/1/11/Truong_Gia_Binh_-_Chairman_%26_CEO_of_FPT_Corporation.jpg\" >\n");
      out.write("                <table border=\"1\">\n");
      out.write("                    <tbody>\n");
      out.write("                            \n");
      out.write("                       \n");
      out.write("                        <tr>\n");
      out.write("                            <td style=\"background-color:powderblue;\">Full Name(*s1)</td>\n");
      out.write("                            <td ></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td style=\"background-color:powderblue;\">DOB</td>\n");
      out.write("                            <td></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td style=\"background-color:powderblue;\">Gender</td>\n");
      out.write("                            <td></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td style=\"background-color:powderblue;\">Roll Number</td>\n");
      out.write("                            <td></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td style=\"background-color:powderblue;\">Major</td>\n");
      out.write("                            <td></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td style=\"background-color:powderblue;\">Email</td>\n");
      out.write("                            <td></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"fright\">\n");
      out.write("                <div style = \"padding-left : 20% ; padding-bottom : 10px;\">\n");
      out.write("                    <label for=\"cars\">Choose Semester:(*c1)</label>\n");
      out.write("                    <select id=\"cars\" name=\"cars\">\n");
      out.write("                        <option value=\"volvo\">sum2022</option>\n");
      out.write("                        <option value=\"saab\">spring2022</option>\n");
      out.write("                        <option value=\"fiat\">winter2022</option>\n");
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <table class = \"tab\" border=\"1\">\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td style=\"background-color:powderblue;\">Course (*c2)</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><a href=\"url\">MAE</a></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><a href=\"url\">PRN</a></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><a href=\"url\">PRJ</a></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><a href=\"url\">MAD</a></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><a href=\"url\">SWP</a></td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><a href=\"url\">SWR</a></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><a href=\"url\">SWT</a></td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
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
