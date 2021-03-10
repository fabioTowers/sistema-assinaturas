package org.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().println("<!DOCTYPE html>");
        response.getWriter().println("<html lang='pt-br'>");

        response.getWriter().println("<head>");
        response.getWriter().println("<meta charset='UTF-8'>");
        response.getWriter().println("<meta http-equiv='X-UA-Compatible' content='IE=edge'>");
        response.getWriter().println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        response.getWriter().println("<title>Início</title>");
        response.getWriter().println("</head>");

        response.getWriter().println("<body>");
        response.getWriter().println("<h1>Sistema de Controle de Assinantes</h1>");
        response.getWriter().println("<hr>");
        response.getWriter().println("<ul>");
        response.getWriter().println("<li><a href='https://sistema-assinaturas.fmendest.repl.co/consulta'>Consultar assinaturas</a></li>");
        response.getWriter().println("<li><a href='#'>Adicionar assinatura</a></li>");
        response.getWriter().println("<li><a href='#'>Alterar assinatura</a></li>");
        response.getWriter().println("<li><a href='#'>Excluir assinatura</a></li>");
        response.getWriter().println("</ul>");
        response.getWriter().println("</body>");

        response.getWriter().println("</html>");
    }
}