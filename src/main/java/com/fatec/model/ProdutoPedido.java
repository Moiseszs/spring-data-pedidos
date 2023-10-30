package com.fatec.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "produto_pedido")
@IdClass(ProdutoPedido.class)
public class ProdutoPedido{

	private static final long serialVersionUID = 1L;

	
	@Id
	@JoinColumn(name="cod_produto")
	@ManyToOne(targetEntity = Produto.class,fetch = FetchType.EAGER)
	private Integer produtoCodigo;
	
	@Id
	@JoinColumn(name="id_pedido")
	@ManyToOne(targetEntity = Pedido.class,fetch = FetchType.EAGER)
	private Integer pedidoId;
	
	@Column(name="qtde")
	private int qtde;
	
	@Column(name="valor_total")
	private double valorTotal;


	public int getProdutoCodigo() {
		return produtoCodigo;
	}

	public void setProdutoCodigo(int produtoCodigo) {
		this.produtoCodigo = produtoCodigo;
	}

	public int getPedidoId() {
		return pedidoId;
	}

	public void setPedidoId(int pedidoId) {
		this.pedidoId = pedidoId;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
