package com.loja.loja_suple.model.produtos;

import com.loja.loja_suple.model.Produtos;
import jakarta.persistence.*;

@Entity
@Table(name="vitaminas")
public class Vitaminas extends Produtos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_vitaminas;
    public Vitaminas(){super();}
    public Vitaminas(int id_vitaminas,int id_produtos, String nome, double preco, int quantidade ) {
        super(id_produtos, nome, preco, quantidade);
        this.id_vitaminas = id_vitaminas;
    }

    public int getId_vitaminas() {
        return id_vitaminas;
    }

    public void setId_vitaminas(int id_vitaminas) {
        this.id_vitaminas = id_vitaminas;
    }
}
