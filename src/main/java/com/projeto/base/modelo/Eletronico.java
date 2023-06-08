package com.projeto.base.modelo;

import com.projeto.base.interfaces.IEletronico;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Eletronico extends Item implements IEletronico{
	
	public Eletronico(String nome, Double peso, Tamanho tamanho) {
		super(peso, tamanho, nome);
	}
		
	@Override
	public void ligar(Item item) {
		log.info(item.getNome() + " ligado");
	}

	@Override
	public void desligar(Item item) {
		log.info(item.getNome() + " desligado");
	}

}
