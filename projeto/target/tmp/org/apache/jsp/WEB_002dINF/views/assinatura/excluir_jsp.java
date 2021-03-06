/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.31.v20200723
 * Generated at: 2021-03-15 17:08:44 UTC
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

public final class excluir_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Excluir assinatura</title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"../../../style.css\" />\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <header class=\"header\">\n");
      out.write("      <h1 class=\"title\">Sistema de Controle de Assinantes</h1>\n");
      out.write("      <nav class=\"nav-menu\">\n");
      out.write("        <ul>\n");
      out.write("          <li><a href='https://sistema-assinaturas.fmendest.repl.co/'>P??gina Inicial</a></li>\n");
      out.write("          <li><a href='https://sistema-assinaturas.fmendest.repl.co/consulta'>Consulta de Assinaturas</a></li>\n");
      out.write("          <li><a href='https://sistema-assinaturas.fmendest.repl.co/excluir'>Excluir assinatura</a></li>\n");
      out.write("          <li><a href='https://sistema-assinaturas.fmendest.repl.co/atualizar'>Alterar assinatura</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </nav>\n");
      out.write("    </header>\n");
      out.write("    <main>\n");
      out.write("      <h2 class=\"subtitle\">Excluir assinatura</h2>\n");
      out.write("      ");

      List<Assinatura> assinaturas = (List<Assinatura>) request.getAttribute("assinaturas");
      boolean sucesso = (boolean) request.getAttribute("operacao_realizada");
      
      out.write("\n");
      out.write("\n");
      out.write("      ");
if(sucesso){
      out.write("\n");
      out.write("        ");
if( !assinaturas.isEmpty() ){
      out.write("\n");
      out.write("          <table class=\"table\">\n");
      out.write("            <tr>\n");
      out.write("              <th>N?? Identificador</th>\n");
      out.write("              <th>Nome</th>\n");
      out.write("              <th>CPF</th>\n");
      out.write("              <th>Plano</th>\n");
      out.write("              <th>Situa????o</th>\n");
      out.write("            </tr>\n");
      out.write("            ");
for(Assinatura assinatura : assinaturas){
      out.write("\n");
      out.write("              <tr>\n");
      out.write("                <td>");
      out.print( assinatura.getId() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( assinatura.getNome() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( assinatura.getCpf() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( assinatura.getPlano() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( assinatura.getSituacao() );
      out.write("</td>\n");
      out.write("              </tr>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("          </table>\n");
      out.write("        ");
} else {
      out.write("\n");
      out.write("          <p>N??o h?? dados cadastrados no banco.</p>\n");
      out.write("      ");
}
      out.write("\n");
      out.write("      ");
} else {
      out.write("\n");
      out.write("        <p>Ocorreu uma <b>exce????o</b> e n??o foi poss??vel acessar a tabela de assinaturas.</p>\n");
      out.write("      ");
}
      out.write("\n");
      out.write("\n");
      out.write("      <p>Para <b>excluir</b> um registro preencha o formul??rio:</p>\n");
      out.write("\n");
      out.write("      <form class=\"form\" id=\"form\" action=\"confirmacao_exclusao\" method=\"post\">\n");
      out.write("        <div class=\"field\">\n");
      out.write("          <label for=\"id\">N??mero de identifica????o do registro</label>\n");
      out.write("          <input type=\"number\" id=\"id\" name=\"id\" min=\"1\">\n");
      out.write("        </div>\n");
      out.write("        <button class=\"button\" type=\"submit\">Excluir</button>\n");
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
