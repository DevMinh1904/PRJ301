/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.99
 * Generated at: 2025-03-19 15:57:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/ducmi/OneDrive/Documents/GitHub/PRJ301/WebApplication_14/build/web/WEB-INF/lib/jstl-impl.jar!/META-INF/c.tld", Long.valueOf(1343794618000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-impl.jar", Long.valueOf(1742399830483L));
  }

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
      out.write("\n");
      out.write("<style>\n");
      out.write("    .footer {\n");
      out.write("        background-color: #2c3e50;\n");
      out.write("        color: #fff;\n");
      out.write("        padding: 3rem 0;\n");
      out.write("        margin-top: 2rem;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .footer-container {\n");
      out.write("        max-width: 1200px;\n");
      out.write("        margin: 0 auto;\n");
      out.write("        padding: 0 1rem;\n");
      out.write("        display: grid;\n");
      out.write("        grid-template-columns: repeat(4, 1fr);\n");
      out.write("        gap: 2rem;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .footer-section h3 {\n");
      out.write("        font-size: 1.2rem;\n");
      out.write("        margin-bottom: 1rem;\n");
      out.write("        color: #3498db;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .footer-section p {\n");
      out.write("        margin-bottom: 0.5rem;\n");
      out.write("        font-size: 0.9rem;\n");
      out.write("        line-height: 1.5;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .footer-links {\n");
      out.write("        list-style: none;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .footer-links li {\n");
      out.write("        margin-bottom: 0.5rem;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .footer-links a {\n");
      out.write("        color: #fff;\n");
      out.write("        text-decoration: none;\n");
      out.write("        transition: color 0.3s ease;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .footer-links a:hover {\n");
      out.write("        color: #3498db;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .social-links {\n");
      out.write("        display: flex;\n");
      out.write("        gap: 1rem;\n");
      out.write("        margin-top: 1rem;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .social-links a {\n");
      out.write("        color: #fff;\n");
      out.write("        text-decoration: none;\n");
      out.write("        font-size: 1.5rem;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .copyright {\n");
      out.write("        text-align: center;\n");
      out.write("        padding-top: 2rem;\n");
      out.write("        margin-top: 2rem;\n");
      out.write("        border-top: 1px solid #34495e;\n");
      out.write("        font-size: 0.9rem;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<footer class=\"footer\">\n");
      out.write("    <div class=\"footer-container\">\n");
      out.write("        <div class=\"footer-section\">\n");
      out.write("            <h3>Về chúng tôi</h3>\n");
      out.write("            <p>Shop Online là điểm đến tin cậy cho những sản phẩm chất lượng với giá cả hợp lý. Chúng tôi cam kết mang đến trải nghiệm mua sắm tốt nhất cho khách hàng.</p>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"footer-section\">\n");
      out.write("            <h3>Liên kết nhanh</h3>\n");
      out.write("            <ul class=\"footer-links\">\n");
      out.write("                <li><a href=\"#\">Trang chủ</a></li>\n");
      out.write("                <li><a href=\"#\">Sản phẩm</a></li>\n");
      out.write("                <li><a href=\"#\">Giỏ hàng</a></li>\n");
      out.write("                <li><a href=\"#\">Chính sách</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"footer-section\">\n");
      out.write("            <h3>Liên hệ</h3>\n");
      out.write("            <p>Địa chỉ: 123 Đường ABC, Quận XYZ</p>\n");
      out.write("            <p>Email: contact@shoponline.com</p>\n");
      out.write("            <p>Điện thoại: (84) 123-456-789</p>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"footer-section\">\n");
      out.write("            <h3>Theo dõi chúng tôi</h3>\n");
      out.write("            <p>Cập nhật tin tức mới nhất và khuyến mãi từ chúng tôi</p>\n");
      out.write("            <div class=\"social-links\">\n");
      out.write("                <a href=\"#\">📱</a>\n");
      out.write("                <a href=\"#\">💬</a>\n");
      out.write("                <a href=\"#\">📷</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"copyright\">\n");
      out.write("        <p>&copy; 2024 Shop Online. Tất cả quyền được bảo lưu.</p>\n");
      out.write("    </div>\n");
      out.write("</footer>");
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
