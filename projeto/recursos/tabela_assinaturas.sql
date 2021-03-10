/*Criação da tabela assinaturas*/
CREATE TABLE assinaturas (
  id SMALLSERIAL,
  nome VARCHAR(100) NOT NULL,
  cpf VARCHAR(30) NOT NULL,
  plano VARCHAR(20) NOT NULL,
  situacao VARCHAR(20) NOT NULL,
  PRIMARY KEY (id)
);
/*
Valores:
plano: basico/plus/premium
situacao: ativo/inativo
*/

/*Query inserida para teste*/
INSERT INTO assinaturas (nome, cpf, plano, situacao) VALUES ('Bob', '12345678910', 'basico', 'ativo');

SELECT * FROM assinaturas;
