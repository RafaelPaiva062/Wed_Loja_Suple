package com.loja.loja_suple.controller;

import com.loja.loja_suple.model.Produtos;
import com.loja.loja_suple.repository.RepositorioLoja;
import com.loja.loja_suple.servico.Loja_servico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
                                @RequestParam("imagens") MultipartFile imagem,
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

    // Endpoint para carregar o formulário de atualização com dados existentes
    @GetMapping("/atualizar/{id}")
    public String carregarFormularioAtualizacao(@PathVariable("id") Long id, Model model, RedirectAttributes redirectAttributes) {
        Produtos produto = lojaServico.buscarPorId(id);
        if (produto == null) {
            redirectAttributes.addFlashAttribute("mensagemErro", "Produto não encontrado.");
            return "redirect:/produtos/listar";
        }
        model.addAttribute("produto", produto);
        return "produtosAtualizar"; // View que contém o formulário para atualizar produto
    }

    // Endpoint para atualizar produto
    @PostMapping("/atualizar")
    public String atualizarProdutos(@ModelAttribute Produtos produto,
                                    @RequestParam(value = "imagens", required = false) MultipartFile imagem,
                                    RedirectAttributes redirectAttributes) {
        try {
            if (imagem != null && !imagem.isEmpty()) {
                produto.setImagem(imagem.getBytes());
            } else {
                // Preserve existing image if no new image is uploaded
                Produtos produtoExistente = lojaServico.buscarPorId(produto.getId_produtos());
                if (produtoExistente != null) {
                    produto.setImagem(produtoExistente.getImagem());
                }
            }

            lojaServico.atualizar(produto.getId_produtos(), produto);
            redirectAttributes.addFlashAttribute("mensagem", "Produto atualizado com sucesso!");
            return "redirect:/produtos/listar";
        } catch (IOException e) {
            redirectAttributes.addFlashAttribute("mensagemErro", "Erro ao processar a imagem.");
            return "redirect:/produtos/atualizar/" + produto.getId_produtos();
        }
    }
    @GetMapping("/buscar")
    public String buscarPorNome(@RequestParam(required = false) String nome, Model model){
        if(nome ==null || nome.isEmpty()){
            model.addAttribute("produtos", List.of());
            model.addAttribute("mensagem","Numham noem informado pra á buscar");
            return  "buscar";
        }
        List<Produtos> encontrados = lojaServico.buscarPorNome(nome);
        model.addAttribute("produtos", encontrados);
        model.addAttribute("termoBusca", nome);
        return "buscar";

    }
    @DeleteMapping("/deleter/id")
    public ResponseEntity<?> deleter(@RequestParam Long id_produtos){
        lojaServico.deletar(id_produtos);
        return ResponseEntity.ok().build();
    }



}

