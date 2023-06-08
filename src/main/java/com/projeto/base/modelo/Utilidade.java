package com.projeto.base.modelo;

import com.projeto.base.interfaces.IUtilitario;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Utilidade extends Item implements IUtilitario{
	
	public Utilidade(String nome, Double peso, Tamanho tamanho) {
		super(peso, tamanho, nome);
	}
	
	@Override
	public void abrir(Item item) {
		log.info(item.getNome() + " aberto");
		
	}

	@Override
	public void fechar(Item item) {
		log.info(item.getNome() + " fechado");
	}
	
	

}
