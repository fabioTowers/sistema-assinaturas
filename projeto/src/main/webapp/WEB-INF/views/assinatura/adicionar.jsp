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
    <title>Adicionar nova assinatura</title>
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
      <h2 class="subtitle">Adicionar nova assinatura</h2>
      <form class="form" action="SalvarFormulario" method="post">
        <div class="field">
          <label for="nome">Nome</label>
          <input type="text" id="nome" name="nome">
        </div>
        <div class="field">
          <label for="name">CPF</label>
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
        <button class="button" type="submit">Adicionar</button>
      </form>
    </main>
  </body>
</html>