package com.fatec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.model.Produto;
import com.fatec.repository.ProdutoRepository;

@RestController
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepo;
	
	@PostMapping("/produto/")
	public Produto postProduto(@Validated @RequestBody Produto produto) {
		Produto res = produtoRepo.save(produto);
		return res;
	}
	
	@GetMapping("/produtos/")
	public List<Produto> getHello() {
		List<Produto> produtos = produtoRepo.findAll();
		return produtos;
	}
	
	@GetMapping("/alo")
	public String getAlo() {
		return "alo";
	}
	
}
