<%@ page import = "java.util.List" %>
<%@ page import = "org.example.models.assinatura.Assinatura" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Atualizar</title>
</head>
<body>
  <h1>Sistema de Controle de Assinantes</h1>
  <hr>
  <h2>Atualizar uma assinatura</h2>
<%
boolean sucesso = (boolean) request.getAttribute("operacao_realizada");
%>
  
<%if(sucesso){%>
  <%boolean alteracaoOK = (boolean) request.getAttribute("foiAlterado");%>
  <%if(alteracaoOK){%>
    <%Assinatura novo = (Assinatura) request.getAttribute("novo");
    Assinatura antigo = (Assinatura) request.getAttribute("antigo");%>
    <p>Os dados abaixo foram <b>atualizados</b> com sucesso:</p>
    <table>
      <tr>
        <th>N° Identificação <%= novo.getId() %></th>
        <th>Antigo</th>
        <th>Atual</th>
      </tr>
      <tr>
        <th>Nome</th>
        <td><%= antigo.getNome() %></td>
        <td><%= novo.getNome() %></td>
      </tr>
      <tr>
        <th>CPF</th>
        <td><%= antigo.getCpf() %></td>
        <td><%= novo.getCpf() %></td>
      </tr>
      <tr>
        <th>Plano</th>
        <td><%= antigo.getPlano() %></td>
        <td><%= novo.getPlano() %></td>
      </tr>
      <tr>
        <th>Situação</th>
        <td><%= antigo.getSituacao() %></td>
        <td><%= novo.getSituacao() %></td>
      </tr>
    </table>
  <%} else {%>
    <p>O Número de Identificação informado não foi localizado.</p>
  <%}%>
  
<%} else {%>
  <p>Ocorreu uma <b>exceção</b> e não foi possível acessar o banco de dados.</p>
<%}%>
  <br><br>
  <a href='https://sistema-assinaturas.fmendest.repl.co/'>Página Inicial</a> - 
  <a href='https://sistema-assinaturas.fmendest.repl.co/consulta'>Consulta de assinaturas</a> - 
  <a href='https://sistema-assinaturas.fmendest.repl.co/adicionar'>Adicionar assinatura</a> - 
  <a href='https://sistema-assinaturas.fmendest.repl.co/excluir'>Excluir assinatura</a>
</body>
</html>