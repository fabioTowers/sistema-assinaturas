<%@ page import = "java.util.List" %>
<%@ page import = "org.example.models.assinatura.Assinatura" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Consulta</title>
</head>
<body>
  <h1>Sistema de Controle de Assinantes</h1>
  <hr>
  <h2>Consulta de assinanturas</h2>
<%
List<Assinatura> assinaturas = (List<Assinatura>) request.getAttribute("assinaturas");
boolean sucesso = (boolean) request.getAttribute("operacao_realizada");
%>

<%if(sucesso){%>
  <%if( !assinaturas.isEmpty() ){%>
    <table>
      <tr>
        <th>N° Identificador</th>
        <th>Nome</th>
        <th>CPF</th>
        <th>Plano</th>
        <th>Situação</th>
      </tr>
      <%for(Assinatura assinatura : assinaturas){%>
        <tr>
          <td><%= assinatura.getId() %></td>
          <td><%= assinatura.getNome() %></td>
          <td><%= assinatura.getCpf() %></td>
          <td><%= assinatura.getPlano() %></td>
          <td><%= assinatura.getSituacao() %></td>
        </tr>
      <%}%>
    </table>
  <%} else {%>
    <p>Não há dados cadastrados no banco.</p>
  <%}%>
<%} else {%>
  <p>Ocorreu uma <b>exceção</b> e não foi possível consultar os dados.</p>
<%}%>

  <br><br>
  <a href='https://sistema-assinaturas.fmendest.repl.co/'>Voltar</a>
</body>
</html>