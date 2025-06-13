package com.loja.loja_suple.model;

import jakarta.persistence.*;

@Entity
@Table(name = "produtos")
public  class Produtos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_produtos;
    private  String categoria;
    private  String nome;
    private  double preco;
    private  int quantidade;
    private byte[] imagens;

    public byte[] getImagem() {
        return imagens;
    }

    public void setImagem(byte[] imagem) {
        this.imagens = imagem;
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
