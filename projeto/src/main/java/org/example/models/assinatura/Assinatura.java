package org.example.models.assinatura;

public class Assinatura {
    private Integer id;
    private String nome;
    private String cpf;
    private String plano;
    private String situacao;

    public void setId(Integer id){
      this.id = id;
    }
    public Integer getId(){
      return id;
    }

    public void setNome(String nome){
      this.nome = nome;
    }
    public String getNome(){
      return nome;
    }

    public void setCpf(String cpf){
      this.cpf = cpf;
    }
    public String getCpf(){
      return cpf;
    }

    public void setPlano(String plano){
      this.plano = plano;
    }
    public String getPlano(){
      return plano;
    }

    public void setSituacao(String situacao){
      this.situacao = situacao;
    }
    public String getSituacao(){
      return situacao;
    }
}
