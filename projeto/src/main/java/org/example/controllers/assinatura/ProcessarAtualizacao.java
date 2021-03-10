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

public class ProcessarAtualizacao extends HttpServlet
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
      doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("text/html");
      response.setStatus(HttpServletResponse.SC_OK);

      RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/assinatura/resultadoatualizacao.jsp");

      try{
        AssinaturasGateway ag = new AssinaturasGateway();
        Assinatura assinatura = new Assinatura();

        assinatura.setId( Integer.parseInt( request.getParameter("id") ) );
        assinatura.setNome( request.getParameter("nome") );
        assinatura.setCpf( request.getParameter("cpf") );
        assinatura.setPlano( request.getParameter("plano") );
        assinatura.setSituacao( request.getParameter("situacao") );
        
        boolean registroExiste = false;

        List<Assinatura> assinaturas = ag.getAll();

        for(Assinatura a: assinaturas){
          if( a.getId() == assinatura.getId() ){
            ag.update(assinatura);
            registroExiste = true;
            request.setAttribute("antigo", a);
            request.setAttribute("novo", assinatura);
            break;
          }
        }
        request.setAttribute("foiAlterado", registroExiste);
        request.setAttribute("operacao_realizada", true);
      } catch (Exception e) {
        request.setAttribute("operacao_realizada", false);
        System.out.println(e);
      } finally {
        rd.forward(request, response);
      }
    }
}