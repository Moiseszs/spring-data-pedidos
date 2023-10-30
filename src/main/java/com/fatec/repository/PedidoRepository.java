package com.fatec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}
