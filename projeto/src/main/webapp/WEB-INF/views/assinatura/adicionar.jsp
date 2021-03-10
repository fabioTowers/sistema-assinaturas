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

  <form action="SalvarFormulario" method="post">
    Nome: <input type="text" name="nome">
    <br>
    CPF: <input type="text" name="cpf">
    <br>
    Plano: <select name="plano">
      <option value="basico">Básico</option>
      <option value="plus">Plus</option>
      <option value="premium">Premium</option>
    </select>
    <br>
    Situação: <select name="situacao">
      <option value="ativo">Ativo</option>
      <option value="inativo">Inativo</option>
    </select>
    <br>
  <button type="submit">Adicionar</button>
  </form>

  <br><br>
  <a href='https://sistema-assinaturas.fmendest.repl.co/'>Voltar</a>
</body>
</html>