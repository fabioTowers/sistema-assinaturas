package org.example.models.assinatura;

import java.sql.*;
import java.util.*;
import org.example.models.ConnectionFactory;
import org.example.models.assinatura.Assinatura;;

public class AssinaturasGateway {
  private Connection conn = ConnectionFactory.getConnection();

  /*Consultar todos os registros da tabela*/
  public List<Assinatura> getAll() throws SQLException {
    List<Assinatura> assinaturas = new ArrayList<>();

    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM assinaturas");

    while(rs.next()){
      Assinatura assinatura = new Assinatura();

      assinatura.setId( rs.getInt("id") );
      assinatura.setNome( rs.getString("nome") );
      assinatura.setCpf( rs.getString("cpf") );
      assinatura.setPlano( rs.getString("plano") );
      assinatura.setSituacao( rs.getString("situacao") );

      assinaturas.add(assinatura);
    }

    return assinaturas;
  }

  /*Adicionar novo registro a tabela*/
  public void create(Assinatura assinatura) throws SQLException {
    String SQL_INSERT = "INSERT INTO assinaturas (nome, cpf, plano, situacao) VALUES (?, ?, ?, ?);";
    PreparedStatement pstm = conn.prepareStatement(SQL_INSERT);

    pstm.setString(1, assinatura.getNome());
    pstm.setString(2, assinatura.getCpf());
    pstm.setString(3, assinatura.getPlano());
    pstm.setString(4, assinatura.getSituacao());

    pstm.execute();
    pstm.close();
  }

  /*Atualizar registro na tabela*/
  public void update(Assinatura assinatura) throws SQLException {
    String SQL_UPDATE = "UPDATE assinaturas SET nome=?, cpf=?, plano=?, situacao=? WHERE id=?";

    PreparedStatement pstm = conn.prepareStatement(SQL_UPDATE);
    pstm.setString(1, assinatura.getNome());
    pstm.setString(2, assinatura.getCpf());
    pstm.setString(3, assinatura.getPlano());
    pstm.setString(4, assinatura.getSituacao());
    pstm.setInt(5, assinatura.getId());

    pstm.executeUpdate();
    pstm.close();
  }

  /*Deletar um registro da tabele*/
  public void delete(Integer id) throws SQLException  {
    String SQL_DELETE = "DELETE FROM assinatura WHERE id = ?;";
    PreparedStatement pstm = conn.prepareStatement(SQL_DELETE);
    pstm.setInt(1, id);
    pstm.executeUpdate();
    pstm.close();
  }

}
