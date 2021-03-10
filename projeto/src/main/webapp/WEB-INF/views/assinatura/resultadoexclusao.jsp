<%@ page import = "java.util.List" %>
<%@ page import = "org.example.models.assinatura.Assinatura" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Adicionar novo</title>
</head>
<body>
  <h1>Sistema de Controle de Assinantes</h1>
  <hr>
  <h2>Adicionar nova assinatura</h2>
<%
boolean sucesso = (boolean) request.getAttribute("operacao_realizada");
%>
  
<%if(sucesso){%>
  <%boolean exclusaoOK = (boolean) request.getAttribute("foiExcluido");%>
  <%if(exclusaoOK){%>
    <%Assinatura registroApagado = (Assinatura) request.getAttribute("registroApagado");%>
    <p>Os dados abaixo foram <b>excluidos</b> com sucesso:</p>
    <p><b>Nome</b>: <%= registroApagado.getNome() %></p>
    <p><b>CPF</b>: <%= registroApagado.getCpf() %></p>
    <p><b>Plano</b>: <%= registroApagado.getPlano() %></p>
    <p><b>Situação Cadastral</b>: <%= registroApagado.getSituacao() %></p>
  <%} else {%>
    <p>O Número de Identificação informado não foi localizado.</p>
  <%}%>
  
<%} else {%>
  <p>Ocorreu uma <b>exceção</b> e não foi possível acessar o banco de dados.</p>
<%}%>
  <br><br>
  <a href='https://sistema-assinaturas.fmendest.repl.co/consulta'>Consulta de Assinaturas</a>
  <br>
  <a href='https://sistema-assinaturas.fmendest.repl.co/'>Voltar à Página Inicial</a>
</body>
</html>