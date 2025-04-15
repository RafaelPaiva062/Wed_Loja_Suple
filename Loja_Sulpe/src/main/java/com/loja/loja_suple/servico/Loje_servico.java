package com.loja.loja_suple.servico;

import com.loja.loja_suple.model.Produtos;
import com.loja.loja_suple.repository.RepositorioLoja;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class Loje_servico {
    @Autowired
    private RepositorioLoja repositorioLoja;
    public Loje_servico(RepositorioLoja repositorioLoja){
        this.repositorioLoja =repositorioLoja;
    }

    public Produtos salvarProduto(Produtos produtos){
        repositorioLoja.setRepositorioLoja(UUID.randomUUID().toString());
        return  repositorioLoja.save(produtos);
    }
    public List<Produtos> listarProdutos(){
        return (List<Produtos>) repositorioLoja.findAll();
    }


}
