package com.fatec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
