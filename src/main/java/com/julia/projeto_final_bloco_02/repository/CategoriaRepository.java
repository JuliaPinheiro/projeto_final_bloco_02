package com.julia.projeto_final_bloco_02.repository;

import com.julia.projeto_final_bloco_02.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);
}

