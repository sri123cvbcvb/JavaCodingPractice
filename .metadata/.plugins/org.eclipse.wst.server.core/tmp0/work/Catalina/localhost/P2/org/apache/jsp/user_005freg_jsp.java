/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.53
 * Generated at: 2024-06-18 04:40:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_005freg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!--\r\n");
      out.write("\tAuthor: W3layouts\r\n");
      out.write("\tAuthor URL: http://w3layouts.com\r\n");
      out.write("\tLicense: Creative Commons Attribution 3.0 Unported\r\n");
      out.write("\tLicense URL: http://creativecommons.org/licenses/by/3.0/\r\n");
      out.write("-->\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<!-- Meta tags -->\r\n");
      out.write("\t<title>USER DETAILS UPDATE</title>\r\n");
      out.write("\t<meta name=\"keywords\" content=\"General Application Form Responsive widget, Flat Web Templates, Android Compatible web template, \r\n");
      out.write("\tSmartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- stylesheets -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"asset7/css/style.css\" type=\"text/css\" media=\"all\">\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- google fonts  -->\r\n");
      out.write("\t<link href=\"//fonts.googleapis.com/css?family=Alegreya+Sans:100,100i,300,300i,400,400i,500,500i,700,700i,800,800i,900,900i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese\" rel=\"stylesheet\">\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction showMessage() {\r\n");
      out.write("\t    var myvalue = new URLSearchParams(window.location.search).get('email');\r\n");
      out.write("\t    console.log(myvalue);\r\n");
      out.write("\t    document.getElementById(\"myInput\").value = myvalue;\r\n");
      out.write("\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("\tbutton:hover{\r\n");
      out.write("\tbackground-color: white;\r\n");
      out.write("\t\r\n");
      out.write("\t}\r\n");
      out.write("\timg {\r\n");
      out.write("  animation: bounce 2s infinite;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@keyframes bounce {\r\n");
      out.write("  0% {\r\n");
      out.write("    transform: translateY(0);\r\n");
      out.write("  }\r\n");
      out.write("  50% {\r\n");
      out.write("    transform: translateY(-20px);\r\n");
      out.write("  }\r\n");
      out.write("  100% {\r\n");
      out.write("    transform: translateY(0);\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("\t\r\n");
      out.write("\t</style>\r\n");
      out.write("<body onload=\"showMessage()\">\r\n");
      out.write("\t<div class=\"w3ls-banner\">\r\n");
      out.write("\t<div class=\"heading\">\r\n");
      out.write("\t\t<h1>ADD MORE DETAILS</h1>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"back\">\r\n");
      out.write("\t<h3 style=\" margin-left: 927px\">Click To View Register Status</h3><br><br>\r\n");
      out.write("\t<img style=\"width:50px;margin-left: 1000px\" src=\"images/arr.png\" href=\"#top\" />\r\n");
      out.write("\t\t\t\t<button  style=\" margin-left: 1000px; padding: 7px 7px; border-radius: 5px; background-color:#007cc0; color:white; border-color:#007cc0; cursor: pointer;\" onclick=\"view()\">VIEW</button>\t\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t<div style=\" margin-top: -107px;\" class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"heading\">\r\n");
      out.write("\t\t\t\t<h2>Please Enter Your Details</h2>\r\n");
      out.write("\t\t\t\t<p>Fill the application form below and submit.</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"agile-form\">\r\n");
      out.write("\t\t\t\t<form action=\"Us_register\" method=\"post\"  enctype=\"multipart/form-data\" role=\"form\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"field-list\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"name\">\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"form-label\"> Name <span class=\"form-required\"> * </span></label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-input add\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"name\" placeholder=\"Name\" required>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li> \r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"form-label\"> E-Mail Address <span class=\"form-required\"> * </span></label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-input\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"email\" id=\"myInput\" name=\"email\" placeholder=\"Mail@example.com\" readonly=\"readonly\" required>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li> \r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"form-label\"> Phone Number <span class=\"form-required\"> * </span></label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-input\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"pn\" placeholder=\"Phone Number\" required >\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"form-label\"> Gender <span class=\"form-required\"> * </span></label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-input\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<select class=\"form-dropdown\" name=\"gender\" required>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"\">Gender</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"Male\"> Male </option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"Female\"> Female </option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"Transgender\"> Transgender </option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"form-label\"> Citizen <span class=\"form-required\"> * </span></label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-input\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<select class=\"form-dropdown\" name=\"citizen\" required>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"\">Select Country</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"United states\"> United states </option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"Afghanisthan\"> Afghanistan </option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"China\"> China </option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"Indonesia\"> Indonesia </option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"India\"> India </option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"England\"> England </option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"Others\"> Others </option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<li> \r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"form-label\">\r\n");
      out.write("\t\t\t\t\t\t\t   Address\r\n");
      out.write("\t\t\t\t\t\t\t   <span class=\"form-required\"> * </span>\r\n");
      out.write("\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-input\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"ad\" placeholder=\"address\" required >\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<li> \r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"form-label\">\r\n");
      out.write("\t\t\t\t\t\t\t   Aadhaar number\r\n");
      out.write("\t\t\t\t\t\t\t   <span class=\"form-required\"> * </span>\r\n");
      out.write("\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-input\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"aa\" placeholder=\"Aadhaar number\" required >\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li> \r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"form-label\">\r\n");
      out.write("\t\t\t\t\t\t\t   Profile Picture\r\n");
      out.write("\t\t\t\t\t\t\t   <span class=\"form-required\"> * </span>\r\n");
      out.write("\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-input\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input  type=\"file\" id=\"fileselect\" name=\"file1\" multiple=\"multiple\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"filedrag\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li> \r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"form-label\">\r\n");
      out.write("\t\t\t\t\t\t\t   License Proof\r\n");
      out.write("\t\t\t\t\t\t\t   <span class=\"form-required\"> * </span>\r\n");
      out.write("\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-input\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input  type=\"file\" id=\"fileselect\" name=\"file2\" multiple=\"multiple\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"filedrag\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<div class=\"submit_btn\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"Submit\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t<div class=\"back\">\r\n");
      out.write("\t\t\t\t<button  style=\"padding: 7px 7px; border-radius: 5px; background-color:#007cc0; color:white; border-color:#007cc0; cursor: pointer;\" onclick=\"back()\">BACK</button>\t\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script>\r\n");
      out.write("\tfunction back(){\r\n");
      out.write("\t\tvar email = document.getElementById(\"myInput\").value;\r\n");
      out.write("\t\t console.log(email);\r\n");
      out.write("\t\twindow.location.replace(\"user_home.jsp?p=\"+email);\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction view(){\r\n");
      out.write("\t\tvar email = document.getElementById(\"myInput\").value;\r\n");
      out.write("\t\t console.log(email);\r\n");
      out.write("\t\twindow.location.replace(\"user_view_reg.jsp?email=\"+email);\r\n");
      out.write("\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
