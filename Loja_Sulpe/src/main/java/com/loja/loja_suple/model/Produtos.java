package com.loja.loja_suple.model;

import jakarta.persistence.*;

@Entity
@Table(name = "produtos")
public abstract class Produtos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_produtos;
    private  String categoria;
    private  String nome;
    private  double preco;
    private  int quantidade;
    public Produtos(int id_produtos, String nome, double preco, int quantidade) {
    }


    public Produtos() {
      this.id_produtos = id_produtos;
      this.categoria = categoria;
      this.nome = nome;
      this.preco = preco;
      this.quantidade = quantidade;

    }
    public long getId_produtos() {
        return id_produtos;
    }

    public void setId_produtos(long id_produtos) {
        this.id_produtos = id_produtos;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
