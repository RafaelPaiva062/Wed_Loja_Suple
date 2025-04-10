package com.loja.loja_suple.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_usuarios;
    private  String email;
    private  int telefone;
    private String nome;
    private int idade;
    private String login;
    private String senha;
    private String endereco;
    public Usuarios() {}

    public Usuarios(Long id_usuarios, String email, int telefone, String nome, int idade, String login, String senha, String endereco) {
       this.id_usuarios = id_usuarios;
       this.email = email;
       this.telefone = telefone;
       this.nome = nome;
       this.idade = idade;
       this.login = login;
       this.senha = senha;
       this.endereco = endereco;
   }


    public long getId_usuarios() {
        return id_usuarios;
    }

    public void setId_usuarios(long id_usuarios) {
        this.id_usuarios = id_usuarios;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
