package com.fatec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.model.Produto;
import com.fatec.model.ProdutoPedido;
import com.fatec.repository.ProdutoPedidoRepository;

@RestController
public class ProdutoPedidoController {

	@Autowired
	private ProdutoPedidoRepository vinculoRepo;
	
	@PostMapping("vinculo/")
	public ProdutoPedido novoVinculo(@Validated @RequestBody ProdutoPedido vinculo) {
		ProdutoPedido res = vinculoRepo.save(vinculo);
		return res;
	}
}
