package com.loja.loja_suple.repository;

import com.loja.loja_suple.model.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositorioLoja extends JpaRepository<Produtos, Long> {


    List<Produtos> findByNomeContainingIgnoreCase(String nome);
}
