# Gerenciamento de Assinaturas

Esse projeto tem a finalidade de servir como controle de assinaturas para uma empresa de TV a cabo. Com esse sistema é possível consultar, alterar, excluir e adicionar assinaturas.

Foi feito utilizando o Java para Web com o *Framework* **Maven** e sua estrutura implementa o padrão MVC.

O servidor web utilizado foi o [Jetty](https://www.eclipse.org/jetty/).

Esse sistema online acessa um banco de dados onde os dados são persistidos. O banco utilizado foi o **PostgreeSQL**.

O banco de dados criado para a aplicação possui a seguinte tabela:

id | nome | cpf | plano | situacao
-|

O script SQL utilizado está disponível [aqui](https://github.com/fabioTowers/sistema-assinaturas/blob/master/projeto/recursos/tabela_assinaturas.sql).

Esse projeto foi desenvolvido utilizando a IDE online [repl.it](https://repl.it/) e a plataforma de banco de dados é a [Elephant SQL](https://www.elephantsql.com/).

E por fim, [aqui](https://repl.it/@fmendest/sistema-assinaturas) você pode ver a aplicação funcionando ;)
