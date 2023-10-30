package com.fatec.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {

	
	@Id
	@Column(name="cod_produto")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="nome_produto", length=20, nullable = false)
	private String nomeProduto;
	
	@Column(name="valor_unitario", length=20, nullable=false)
	private double valorUnitario;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getId() {
		return id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}
	
	
}
