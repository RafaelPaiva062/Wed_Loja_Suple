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

    // Salvando os produtos
    public Produtos salvarProduto(Produtos produtos){
        return  repositorioLoja.save(produtos);
    }
    //listar e mostra os produtos
    public List<Produtos> listarProdutos(){
        return (List<Produtos>) repositorioLoja.findAll();
    }

    //Buscar produtos
    public Produtos  buscarPorId(Long id){
       return repositorioLoja.findById(id).orElse(null);
    }

    //Buscar produtos com nome

    public Produtos buscarPorNome(String nome){
        return  repositorioLoja.findByNomeContainingIgnoreCase(nome);
    }

    //Atualização de produtos
    public class ProdutoNotFoundException extends RuntimeException {
        public ProdutoNotFoundException(String message) {
            super(message);
        }
    }
    // Modulos de atualização única //

    public Produtos atualizar(Long id_produtos, Produtos produtos){
        Produtos produto =repositorioLoja.findById(id_produtos)
                .orElseThrow(() -> new ProdutoNotFoundException("Produto não existe"));
        // Atualiza os campos do produto
        produto.setNome(produtos.getNome());
        produto.setPreco(produtos.getPreco());
        produto.setCategoria(produtos.getCategoria());
        produto.setQuantidade(produtos.getQuantidade());
        produto.setImagem(produtos.getImagem());
        return repositorioLoja.save(produto);
    }
    // NOVO: Atualizar vários produtos
    public List<Produtos> atualizarTodos(List<Produtos> produtos) {
        repositorioLoja.saveAll(produtos);
        return produtos;
    }
    // Deletar por id
    public void deletar(Long id){
        repositorioLoja.deleteById(id);
    }





}
