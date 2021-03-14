/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.31.v20200723
 * Generated at: 2021-03-14 23:52:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.assinatura;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import org.example.models.assinatura.Assinatura;

public final class adicionar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("org.example.models.assinatura.Assinatura");
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Roboto&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <title>Adicionar nova assinatura</title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"../../../style.css\" />\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <header class=\"header\">\n");
      out.write("      <h1 class=\"title\">Sistema de Controle de Assinantes</h1>\n");
      out.write("      <nav class=\"nav-menu\">\n");
      out.write("        <ul>\n");
      out.write("          <li><a href='https://sistema-assinaturas.fmendest.repl.co/'>Página Inicial</a></li>\n");
      out.write("          <li><a href='https://sistema-assinaturas.fmendest.repl.co/consulta'>Consulta de Assinaturas</a></li>\n");
      out.write("          <li><a href='https://sistema-assinaturas.fmendest.repl.co/excluir'>Excluir assinatura</a></li>\n");
      out.write("          <li><a href='https://sistema-assinaturas.fmendest.repl.co/atualizar'>Alterar assinatura</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </nav>\n");
      out.write("    </header>\n");
      out.write("    <main>\n");
      out.write("      <h2 class=\"subtitle\">Adicionar nova assinatura</h2>\n");
      out.write("      <form class=\"form\" action=\"SalvarFormulario\" method=\"post\">\n");
      out.write("        <div class=\"field\">\n");
      out.write("          <label for=\"nome\">Nome</label>\n");
      out.write("          <input type=\"text\" id=\"nome\" name=\"nome\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"field\">\n");
      out.write("          <label for=\"name\">CPF</label>\n");
      out.write("          <input type=\"text\" id=\"cpf\" name=\"cpf\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"field\">\n");
      out.write("          <label for=\"plano\">Plano</label>\n");
      out.write("          <select id=\"plano\" name=\"plano\">\n");
      out.write("            <option value=\"basico\">Básico</option>\n");
      out.write("            <option value=\"plus\">Plus</option>\n");
      out.write("            <option value=\"premium\">Premium</option>\n");
      out.write("          </select>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"field\">\n");
      out.write("          <label for=\"situacao\">Situação</label>\n");
      out.write("          <select id=\"situacao\" name=\"situacao\">\n");
      out.write("            <option value=\"ativo\">Ativo</option>\n");
      out.write("            <option value=\"inativo\">Inativo</option>\n");
      out.write("          </select>\n");
      out.write("        </div>\n");
      out.write("        <button class=\"button\" type=\"submit\">Adicionar</button>\n");
      out.write("      </form>\n");
      out.write("    </main>\n");
      out.write("  </body>\n");
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
