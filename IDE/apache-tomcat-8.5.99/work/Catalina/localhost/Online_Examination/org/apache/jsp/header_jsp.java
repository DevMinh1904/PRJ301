/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.99
 * Generated at: 2025-03-17 03:20:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Online Examination</title>\n");
      out.write("    <style>\n");
      out.write("        /* Header Styles */\n");
      out.write("        .header {\n");
      out.write("            background-color: #2c3e50;\n");
      out.write("            color: white;\n");
      out.write("            padding: 1rem 2rem;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: space-between;\n");
      out.write("            align-items: center;\n");
      out.write("            box-shadow: 0 2px 5px rgba(0,0,0,0.1);\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .logo {\n");
      out.write("            font-size: 1.8rem;\n");
      out.write("            font-weight: bold;\n");
      out.write("            color: white;\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .logo span {\n");
      out.write("            color: #3498db;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .nav-menu {\n");
      out.write("            display: flex;\n");
      out.write("            list-style: none;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .nav-menu li {\n");
      out.write("            margin-left: 2rem;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .nav-menu a {\n");
      out.write("            color: white;\n");
      out.write("            text-decoration: none;\n");
      out.write("            font-weight: 500;\n");
      out.write("            transition: color 0.3s;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .nav-menu a:hover {\n");
      out.write("            color: #3498db;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .search-cart {\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .search-form {\n");
      out.write("            margin-right: 1.5rem;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .search-form input {\n");
      out.write("            padding: 0.5rem;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 4px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .cart-icon {\n");
      out.write("            color: white;\n");
      out.write("            font-size: 1.2rem;\n");
      out.write("            text-decoration: none;\n");
      out.write("            position: relative;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .cart-count {\n");
      out.write("            position: absolute;\n");
      out.write("            top: -8px;\n");
      out.write("            right: -8px;\n");
      out.write("            background-color: #e74c3c;\n");
      out.write("            color: white;\n");
      out.write("            font-size: 0.7rem;\n");
      out.write("            border-radius: 50%;\n");
      out.write("            width: 16px;\n");
      out.write("            height: 16px;\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: center;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        @media (max-width: 768px) {\n");
      out.write("            .header {\n");
      out.write("                flex-direction: column;\n");
      out.write("                padding: 1rem;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .nav-menu {\n");
      out.write("                margin-top: 1rem;\n");
      out.write("                flex-wrap: wrap;\n");
      out.write("                justify-content: center;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .nav-menu li {\n");
      out.write("                margin: 0.5rem 1rem;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .search-cart {\n");
      out.write("                margin-top: 1rem;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header class=\"header\">\n");
      out.write("        <a href=\"index.jsp\" class=\"logo\">Online<span>Examination</span></a>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"search-cart\">\n");
      out.write("            <form class=\"search-form\">\n");
      out.write("                <input type=\"text\" placeholder=\"Search laptops...\">\n");
      out.write("            </form>\n");
      out.write("            <a href=\"login.jsp\" class=\"nav-menu-item\">Login</a>\n");
      out.write("        </div>\n");
      out.write("    </header>");
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
