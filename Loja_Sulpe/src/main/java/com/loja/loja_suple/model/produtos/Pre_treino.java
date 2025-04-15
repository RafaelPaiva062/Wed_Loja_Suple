package com.loja.loja_suple.model.produtos;

import com.loja.loja_suple.model.Produtos;
import jakarta.persistence.*;

@Entity
@Table(name = "pre_treino")
public class Pre_treino  extends Produtos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_pre_treino;
    public Pre_treino(){
        super();
    }


    public Pre_treino(int id_pre_treino, int id_produtos, String nome, double preco, int quantidade ) {
        super(id_produtos, nome, preco, quantidade);
        this.id_pre_treino = id_pre_treino;
    }
    public int getId_pre_treino() {
        return id_pre_treino;
    }

    public void setId_pre_treino(int id_pre_treino) {
        this.id_pre_treino = id_pre_treino;
    }


}
