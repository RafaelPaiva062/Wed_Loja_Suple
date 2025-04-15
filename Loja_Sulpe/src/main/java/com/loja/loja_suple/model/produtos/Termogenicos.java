package com.loja.loja_suple.model.produtos;

import com.loja.loja_suple.model.Produtos;
import jakarta.persistence.*;

@Entity
@Table(name= "termogenicos")
public class Termogenicos  extends Produtos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_termogenicos;
    public Termogenicos(){super();}


    public Termogenicos(int id_termogenicos, int id_produtos, String nome, double preco, int quantidade ) {
        super(id_produtos, nome, preco, quantidade);
        this.id_termogenicos = id_termogenicos;
    }
    public int getId_termogenicos() {
        return id_termogenicos;
    }

    public void setId_termogenicos(int id_termogenicos) {
        this.id_termogenicos = id_termogenicos;
    }

}
