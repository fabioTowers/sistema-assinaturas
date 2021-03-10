package org.example.controllers.assinatura;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import java.util.List;

import org.example.models.assinatura.Assinatura;
import org.example.models.assinatura.AssinaturasGateway;

public class ProcessarExclusao extends HttpServlet
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
      doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("text/html");
      response.setStatus(HttpServletResponse.SC_OK);

      RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/assinatura/resultadoexclusao.jsp");

      try{
        AssinaturasGateway ag = new AssinaturasGateway();
        Integer id = Integer.parseInt( request.getParameter("id") );
        boolean registroExiste = false;

        List<Assinatura> assinaturas = ag.getAll();

        for(Assinatura a: assinaturas){
          if( a.getId() == id ){
            ag.delete(id);
            registroExiste = true;
            request.setAttribute("registroApagado", a);
            break;
          }
        }
        request.setAttribute("foiExcluido", registroExiste);
        request.setAttribute("operacao_realizada", true);
      } catch (Exception e) {
        request.setAttribute("operacao_realizada", false);
        System.out.println(e);
      } finally {
        rd.forward(request, response);
      }
    }
}