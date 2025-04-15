package com.loja.loja_suple.model.produtos;

import com.loja.loja_suple.model.Produtos;
import jakarta.persistence.*;

@Entity
@Table(name = "hipercalorico" )
public class Hipercalorico extends Produtos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_hipercalorico;
    public Hipercalorico() {
        super();
    }


    public  Hipercalorico(int id_hipercalorico, int id_produtos, String nome, double preco, int quantidade ) {
        super(id_produtos,nome,preco,quantidade);
        this.id_hipercalorico =id_hipercalorico;
    }
    public int getId_hipercalorico() {
        return id_hipercalorico;
    }

    public void setId_hipercalorico(int id_hipercalorico) {
        this.id_hipercalorico = id_hipercalorico;
    }
}
