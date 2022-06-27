package org.apache.jsp.Views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class courseMarkView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../CSS/courseMarkView.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <table style=\"width: 100%;\">\n");
      out.write("                <tbody>\n");
      out.write("                    <tr style=\"background-color: pink;\">\n");
      out.write("                        <td>Hello <a href=\"url\">truong gia binh</a></td>\n");
      out.write("                        <td>This is a Teacher Account</td>\n");
      out.write("                        <td><a href=\"url\">Log Out</a></td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"wrap\">\n");
      out.write("            <div class=\"option\">\n");
      out.write("                <form action=\"/action_page.php\">\n");
      out.write("                    <div style = \"padding-top : 10%; padding-left : 20% ; padding-bottom : 20px;\">\n");
      out.write("                        <label for=\"semester\">Choose Semester :</label>\n");
      out.write("                        <select id=\"semester\" name=\"semester\">\n");
      out.write("                            <option value=\"volvo\">sum2022</option>\n");
      out.write("                            <option value=\"saab\">spring2022</option>\n");
      out.write("                            <option value=\"fiat\">winter2022</option>\n");
      out.write("                        </select>\n");
      out.write("                        <label for=\"course\">Choose Course :</label>\n");
      out.write("                        <select id=\"course\" name=\"course\">\n");
      out.write("                            <option value=\"volvo\">sum2022</option>\n");
      out.write("                            <option value=\"saab\">spring2022</option>\n");
      out.write("                            <option value=\"fiat\">winter2022</option>\n");
      out.write("                        </select>\n");
      out.write("                        <input type=\"submit\" value=\"Submit\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"tab\">\n");
      out.write("                <h2 style=\"text-align : center\">Course : MAE</h2>\n");
      out.write("                <h2 style=\"text-align : center\">Semester : MAE</h2>\n");
      out.write("                <form action=\"/action_page.php\">\n");
      out.write("                    <table class = \"tab2\" border=\"1\">\n");
      out.write("                        <tbody>\n");
      out.write("                            <tr>\n");
      out.write("                                <th class=\"col\">Student(*g1)</th>\n");
      out.write("                                <th class=\"col\">Workshop 1</th>\n");
      out.write("                                <th class=\"col\">Workshop 2</th>\n");
      out.write("                                <th class=\"col\">Practice 1</th>\n");
      out.write("                                <th class=\"col\">Practive 2</th>\n");
      out.write("                                <th class=\"col\">Practical Test</th>\n");
      out.write("                                <th class=\"col\">Final Test</th>\n");
      out.write("                                <th class=\"col\">Average</th>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Student 1</td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Student 2</td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Student 3</td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Student 3</td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Student 4</td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Student 5</td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Student 6</td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Student 7</td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Student 8</td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                                <td><input type=\"text\" value=\"4\" class = \"txtb\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                    <input type=\"submit\" value=\"Submit\">\n");
      out.write("                </form>\n");
      out.write("            </div>     \n");
      out.write("        </div>   \n");
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
