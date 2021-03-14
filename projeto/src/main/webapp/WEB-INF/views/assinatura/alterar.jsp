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
    <title>Atualizar assinatura</title>
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
      <h2 class="subtitle">Alterar assinatura</h2>
      <%
      List<Assinatura> assinaturas = (List<Assinatura>) request.getAttribute("assinaturas");
      boolean sucesso = (boolean) request.getAttribute("operacao_realizada");
      %>

      <%if(sucesso){%>
        <%if( !assinaturas.isEmpty() ){%>
          <table class="table">
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
        <p>Ocorreu uma <b>exceção</b> e não foi possível acessar a tabela de assinaturas.</p>
      <%}%>

      <p>Para <b>atualizar</b> preencha o formulário:</p>
      <form class="form" id="form" action="salvar_atualizacao" method="post">
        <div class="field">
          <label for="id">Número de identificação do registro</label>
          <input type="number" id="id" name="id" min="1">
        </div>

        <p>Digite os novos valores:</p>
        <div class="field">
          <label for="name">Nome</label>
          <input type="text" id="name" name="nome">
        </div>
        <div class="field">
          <label for="cpf">CPF</label>
          <input type="text" id="cpf" name="cpf">
        </div>
        <div class="field">
          <label for="plano">Plano</label>
          <select id="plano" name="plano">
            <option value="basico">Básico</option>
            <option value="plus">Plus</option>
            <option value="premium">Premium</option>
          </select>
        </div>
        <div class="field">
          <label for="situacao">Situação</label>
          <select id="situacao" name="situacao">
            <option value="ativo">Ativo</option>
            <option value="inativo">Inativo</option>
          </select>
        </div>
        <button class="button" type="submit">Atualizar</button>
      </form>
    </main>
  </body>
</html>