package com.loja.loja_suple.controller;

import com.loja.loja_suple.model.Produtos;
import com.loja.loja_suple.repository.RepositorioLoja;
import com.loja.loja_suple.servico.Loja_servico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/produtos")
public class ProdutosController {

    @Autowired
    private RepositorioLoja repositorioLoja;

    @Autowired
    private Loja_servico lojaServico;

    @GetMapping("/form")
    public String formularioProduto(Model model) {
        model.addAttribute("produto", new Produtos());
        return "produtos";
    }
    // Endpoint para listar produtos
    @GetMapping("/listar")
    public String listaProdutos(Model model) {
        List<Produtos> produtos = lojaServico.listarProdutos();
        model.addAttribute("produtos", produtos);
        model.addAttribute("produto", new Produtos());
        return "listar"; // Retorna a view "listar"
    }

    // Endpoint para criar um novo produto
    @PostMapping("/salvar")
    public String salvarProduto(@ModelAttribute Produtos produto,
                                @RequestParam("imagem") MultipartFile imagem,
                                RedirectAttributes redirectAttributes) {
        try {
            if (!imagem.isEmpty()) {
                produto.setImagem(imagem.getBytes());
            }

            lojaServico.salvarProduto(produto);
            redirectAttributes.addFlashAttribute("mensagem", "Produto cadastrado com sucesso!");
        } catch (IOException e) {
            redirectAttributes.addFlashAttribute("mensagemErro", "Erro ao processar a imagem.");
        }

        return "redirect:/produtos/form";
    }

    // Endpoint para a página inicial
    @GetMapping("/menu")
    public String paginaInicial() {
        return "paginaInicial"; // Retorna a view "paginaInicial"
    }
}