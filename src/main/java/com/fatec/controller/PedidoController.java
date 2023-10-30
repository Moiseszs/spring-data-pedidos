package com.fatec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.model.Pedido;
import com.fatec.repository.PedidoRepository;

@RestController
public class PedidoController {

	@Autowired
	private PedidoRepository pedidoRepo;
	
	@PostMapping("/pedido/")
	public Pedido novoPedido(@Validated @RequestBody Pedido pedido) {
		Pedido res = pedidoRepo.save(pedido);
		return res;
	}
}
