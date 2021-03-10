package org.example.controllers.assinatura;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

import org.example.models.assinatura.Assinatura;
import org.example.models.assinatura.AssinaturasGateway;

public class SalvarFormulario extends HttpServlet
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
      doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("text/html");
      response.setStatus(HttpServletResponse.SC_OK);



      RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/assinatura/resultadooperacao.jsp");
      /*response.getWriter().println("<h1>"+request.getParameter("nome")+"</h1>");
      response.getWriter().println("<h1>"+request.getParameter("cpf")+"</h1>");
      response.getWriter().println("<h1>"+request.getParameter("plano")+"</h1>");
      response.getWriter().println("<h1>"+request.getParameter("situacao")+"</h1>");*/

      try{
        Assinatura nova = new Assinatura();
        AssinaturasGateway ag = new AssinaturasGateway();

        nova.setNome( request.getParameter("nome") );
        nova.setCpf( request.getParameter("cpf") );
        nova.setPlano( request.getParameter("plano") );
        nova.setSituacao( request.getParameter("situacao") );

        ag.create( nova );
        request.setAttribute("operacao_realizada", true);
        request.setAttribute("assinatura_salva", nova);
      } catch (Exception e) {
        request.setAttribute("operacao_realizada", false);
        System.out.println(e);
      } finally {
        rd.forward(request, response);
      }
    }
}