package com.loja.loja_suple.model.produtos;

import com.loja.loja_suple.model.Produtos;
import jakarta.persistence.*;


@Entity
@Table(name ="proteina")
public class Proteina extends Produtos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_proteina;
    public Proteina(){super();}


    public Proteina(int id_proteina, long id_produtos, String nome, double preco, int quantidade ) {
        super((int) id_produtos, nome, preco, quantidade);
        this.id_proteina = id_proteina;
     }
    public int getId_proteina() {
        return id_proteina;
    }

    public void setId_proteina(int id_proteina) {
        this.id_proteina = id_proteina;
    }
    }
