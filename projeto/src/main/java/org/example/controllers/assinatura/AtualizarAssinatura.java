package org.example.controllers.assinatura;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

import org.example.models.assinatura.AssinaturasGateway;
import org.example.models.assinatura.Assinatura;

public class AtualizarAssinatura extends HttpServlet
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

      response.setContentType("text/html");
      response.setStatus(HttpServletResponse.SC_OK);

      RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/assinatura/alterar.jsp");

      try {
        AssinaturasGateway ag = new AssinaturasGateway();
        List<Assinatura> assinaturas = ag.getAll();

        request.setAttribute("assinaturas", assinaturas);
        request.setAttribute("operacao_realizada", true);
        
        } catch(Exception e) {
          request.setAttribute("operacao_realizada", false);
          System.out.println(e);
        } finally {
          rd.forward(request, response);
        }
    
    }
}