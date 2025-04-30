package com.loja.loja_suple.servico;

import com.loja.loja_suple.model.Produtos;
import com.loja.loja_suple.repository.RepositorioLoja;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Loja_servico {

    private List<Produtos> produtos;

    public List<Produtos> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produtos> produtos) {
        this.produtos = produtos;
    }
    @Autowired
    private RepositorioLoja repositorioLoja;
    public Loja_servico(RepositorioLoja repositorioLoja){
        this.repositorioLoja =repositorioLoja;
    }

    public Produtos salvarProduto(Produtos produtos){
        return  repositorioLoja.save(produtos);
    }
    public List<Produtos> listarProdutos(){
        return (List<Produtos>) repositorioLoja.findAll();
    }


}
