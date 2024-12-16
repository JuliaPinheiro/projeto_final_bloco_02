package com.julia.projeto_final_bloco_02.repository;


import com.julia.projeto_final_bloco_02.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    List<Produto> findAllByNomeContainingIgnoreCase(String nome);
}
