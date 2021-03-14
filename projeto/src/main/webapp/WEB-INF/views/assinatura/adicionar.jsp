<%@ page import = "java.util.List" %>
<%@ page import = "org.example.models.assinatura.Assinatura" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Adicionar nova assinatura</title>
  <style>
    .form {

    }

    .form > .field {
      margin-bottom: 10px;
      display: flex;
      flex-direction: column;
      align-items: flex-start;
    }

    .form > .field > label {
      color: gray;
    }

    .form > .field > input, .form > .field > select {
      border: 1px solid black;
      border-radius: 10px;
    }

    .button {
      background-color: black;
      color: white;
      border: none;
      padding: 10px 20px;
      border-radius: 10px;
    }
  </style>
</head>
<body>
  <header>
    <h1>Sistema de Controle de Assinantes</h1>
    <nav>
      <ul>
        <li><a href='https://sistema-assinaturas.marianazangrossi.repl.co/'>Página Inicial</a></li>
        <li><a href='https://sistema-assinaturas.marianazangrossi.repl.co/excluir'>Excluir assinatura</a></li>
        <li><a href='https://sistema-assinaturas.marianazangrossi.repl.co/atualizar'>Alterar assinatura</a></li>
      </ul>
    </nav>
  </header>
  <hr/>
  <main>
    <h2>Adicionar nova assinatura</h2>
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