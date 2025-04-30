package com.loja.loja_suple.controller;

import com.loja.loja_suple.model.Produtos;
import com.loja.loja_suple.repository.RepositorioLoja;
import com.loja.loja_suple.servico.Loja_servico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProdutosController {

    @Autowired
    private RepositorioLoja repositorioLoja;

    @Autowired
    private Loja_servico lojaServico;
    @GetMapping("/")
    public String paginaInicial(){
        return "paginaInicial";
    }


   @GetMapping("/listar")
   public String listaProdutos(Model model){
       List<Produtos> produtos= lojaServico.listarProdutos();
       model.addAttribute("produtos",produtos);
       model.addAttribute("produto", new Produtos());
    return "listar";
   }
}
