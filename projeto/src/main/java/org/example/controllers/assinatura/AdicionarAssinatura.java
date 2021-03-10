package org.example.controllers.assinatura;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

public class AdicionarAssinatura extends HttpServlet
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
      response.setContentType("text/html");
      response.setStatus(HttpServletResponse.SC_OK);

      RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/assinatura/adicionar.jsp");
      rd.forward(request, response);
      

    }
}