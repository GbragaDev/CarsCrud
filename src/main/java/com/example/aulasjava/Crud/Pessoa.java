package com.example.aulasjava.Crud;

public class Pessoa {

  private long id;
  private String nome;
  private String apelido;


  public Pessoa(long id, String nome, String apelido) {
    this.id = id;
    this.nome = nome;
    this.apelido = apelido;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getApelido() {
    return apelido;
  }

  public void setApelido(String apelido) {
    this.apelido = apelido;
  }

  @Override
  public String toString() {
    return "Pessoa{" +
      "id=" + id +
      ", nome='" + nome + '\'' +
      ", apelido='" + apelido + '\'' +
      '}';
  }
}


