package com.projeto.base.modelo;

public abstract class Item{
	
	private Double peso;
	private Tamanho tamanho;
	private String nome;
	
	protected Item(Double peso, Tamanho tamanho, String nome) {
		super();
		this.peso = peso;
		this.tamanho = tamanho;
		this.nome = nome;
	}
	
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Tamanho getTamanho() {
		return tamanho;
	}
	public void setTamanho(Tamanho tamanho) {
		this.tamanho = tamanho;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
