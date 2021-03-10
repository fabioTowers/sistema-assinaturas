package org.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConsultarAssinaturas extends HttpServlet
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        try {
          Class.forName("org.postgresql.Driver");
          String url = "jdbc:postgresql://ziggy.db.elephantsql.com:5432/gttocayu";
          Properties props = new Properties();
          props.setProperty("user","gttocayu");//Usuário
          props.setProperty("password","kFaDR6NSV5SrHE5CpJMuQVbih3rLG9TA");//Senha
          Connection conn = DriverManager.getConnection(url, props);

          Statement stmt = conn.createStatement();
          ResultSet rs = stmt.executeQuery("SELECT * FROM assinaturas;");

          response.setContentType("text/html");
          response.setStatus(HttpServletResponse.SC_OK);

          PrintWriter out = response.getWriter();

          out.println("<!DOCTYPE html>");
          out.println("<html lang='pt-br'>");

          out.println("<head>");
            out.println("<meta charset='UTF-8'>");
            out.println("<meta http-equiv='X-UA-Compatible' content='IE=edge'>");
            out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
            out.println("<title>Consulta</title>");
          out.println("</head>");

          out.println("<body>");
            out.println("<h1>Sistema de Controle de Assinantes</h1>");
            out.println("<hr>");
            out.println("<h2>Consultar assinanturas</h2>");

            out.println("<table>");
              out.println("<tr>");
                out.println("<th>Nome</th>");
                out.println("<th>CPF</th>");
                out.println("<th>Plano</th>");
                out.println("<th>Situação</th>");
              out.println("</tr>");

              while(rs.next()){
                out.println("<tr>");
                out.println("<td>"+ rs.getString("nome") +"</td>");
                out.println("<td>"+ rs.getString("cpf") +"</td>");
                out.println("<td>"+ rs.getString("plano") +"</td>");
                out.println("<td>"+ rs.getString("situacao") +"</td>");
                out.println("</tr>");
              }
              out.println("</table>");
              
              rs.close();
              conn.close();
              
              out.println("<br><br>");
              out.println("<a href='https://sistema-assinaturas.fmendest.repl.co/'>Voltar</a>");
          out.println("</body>");
        out.println("</html>");

        } catch(Exception e) {
          System.out.println(e);
        }

    
    }
}