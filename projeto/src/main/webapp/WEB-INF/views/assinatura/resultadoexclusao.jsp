<%@ page import = "java.util.List" %>
<%@ page import = "org.example.models.assinatura.Assinatura" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
    <title>Assinatura excluída</title>
    <link rel="stylesheet" type="text/css" href="../../../style.css" />
  </head>
  <body>
    <header class="header">
      <h1 class="title">Sistema de Controle de Assinantes</h1>
      <nav class="nav-menu">
        <ul>
          <li><a href='https://sistema-assinaturas.fmendest.repl.co/'>Página Inicial</a></li>
          <li><a href='https://sistema-assinaturas.fmendest.repl.co/consulta'>Consulta de Assinaturas</a></li>
          <li><a href='https://sistema-assinaturas.fmendest.repl.co/excluir'>Excluir assinatura</a></li>
          <li><a href='https://sistema-assinaturas.fmendest.repl.co/atualizar'>Alterar assinatura</a></li>
        </ul>
      </nav>
    </header>
    <main>
      <%
      boolean sucesso = (boolean) request.getAttribute("operacao_realizada");
      %>
        
      <%if(sucesso){%>
        <h2 class="subtitle">Assinatura excluída</h2>
        <%boolean exclusaoOK = (boolean) request.getAttribute("foiExcluido");%>
        <%if(exclusaoOK){%>
          <%Assinatura registroApagado = (Assinatura) request.getAttribute("antigo");
          Assinatura registroApagado = (Assinatura) request.getAttribute("antigo");%>
          <p>Os dados abaixo foram <b>excluidos</b> com sucesso:</p>
          <p><b>Nome</b>: <%= registroApagado.getNome() %></p>
          <p><b>CPF</b>: <%= registroApagado.getCpf() %></p>
          <p><b>Plano</b>: <%= registroApagado.getPlano() %></p>
          <p><b>Situação Cadastral</b>: <%= registroApagado.getSituacao() %></p>
        <%} else {%>
          <p>O Número de Identificação informado não foi localizado.</p>
        <%}%>
        
      <%} else {%>
        <h2 class="subtitle">Ocorreu uma <b>exceção</b> e não foi possível acessar o banco de dados.</h2>
      <%}%>
    </main>
  </body>
</html>