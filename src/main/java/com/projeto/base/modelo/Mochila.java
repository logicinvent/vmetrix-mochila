package com.projeto.base.modelo;

import java.util.LinkedList;
import java.util.List;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Mochila {
	
	private static final double PESO_MAXIMO_MOCHILA = 3.0;
	private LinkedList<Item> items = new LinkedList<Item>();

	public List<Item> getItems() {
		return items;
	}

	public void addItem(Item item) {
		if(validarPeso(item)) {
			this.items.add(item);
		}else {
			log.error("############# Item não adicionado: Mochila cheia para o item: " + item.getNome() );
		}
	}

	public void removeItem(Item item) {
		this.items.remove(item);
	}
	
	private boolean validarPeso(Item item) {
		
		double pesoTotal = items.stream()
			.mapToDouble(Item::getPeso).sum();
		
		pesoTotal+=item.getPeso();
		
		if (pesoTotal <= PESO_MAXIMO_MOCHILA )
			return Boolean.TRUE;
		
		return Boolean.FALSE;
	}
	
}
