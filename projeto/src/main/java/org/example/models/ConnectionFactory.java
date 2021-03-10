package org.example.models;

import java.sql.*;
import java.util.Properties;

public class ConnectionFactory{

  public static Connection getConnection(){
    try {
      Class.forName("org.postgresql.Driver");
      String url = "jdbc:postgresql://ziggy.db.elephantsql.com:5432/gttocayu";
      Properties props = new Properties();
      props.setProperty("user","gttocayu");//Usuário
      props.setProperty("password","kFaDR6NSV5SrHE5CpJMuQVbih3rLG9TA");//Senha
      Connection conn = DriverManager.getConnection(url, props);
      return conn;
    } catch(Exception e) {
      System.out.println(e);
    }
    return null;
  }//fecha o método getConnection()

}//Classe
