package com.loja.loja_suple.model.produtos;

import com.loja.loja_suple.model.Produtos;
import jakarta.persistence.*;

@Entity
@Table(name ="aminoacidos")
public class Aminoacidos extends Produtos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_aminoacido;
    public Aminoacidos(){
        super();
    }

    public Aminoacidos(int id_aminoacido, int id_produtos, String nome, double preco, int quantidade ) {
        super(id_produtos,nome,preco,quantidade);
        this.id_aminoacido = id_aminoacido;
    }

    public int getId_aminoacido() {
        return id_aminoacido;
    }

    public void setId_aminoacido(int id_aminoacido) {
        this.id_aminoacido = id_aminoacido;
    }

}
