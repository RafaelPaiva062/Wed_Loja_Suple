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
    public  Hipercalorico(int id_hipercalorico, ) {

    }
}
