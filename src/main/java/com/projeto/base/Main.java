package com.projeto.base;

import java.text.DecimalFormat;

import com.projeto.base.modelo.Eletronico;
import com.projeto.base.modelo.Item;
import com.projeto.base.modelo.Mochila;
import com.projeto.base.modelo.Tamanho;
import com.projeto.base.modelo.Utilidade;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Main {

	public static void main(String[] args) {

		Mochila mochila = new Mochila();

		Item celular = new Eletronico("Celular", 0.4, Tamanho.PEQUENO);
		Item garrafa = new Utilidade("Garrafa de água", 0.2, Tamanho.PEQUENO);
		Item notebook = new Eletronico("Notebook", 1.1, Tamanho.GRANDE);
		
		mochila.addItem(celular);
		mochila.addItem(garrafa);
		mochila.addItem(notebook);
		
		log.info("############# PESO TOTAL DA MOCHILA");
		Double sum = mochila.getItems().stream().mapToDouble(Item::getPeso).sum();
		
		log.info("Mochila pesa " + new DecimalFormat("#.##").format(sum) + "KG");
			
		log.info("############# LISTAGEM DE PRODUTOS DA MOCHILA");
		mochila.getItems().stream().forEach(e -> log.info(e.getNome()));

		log.info("############# FUNCOES DOS ITEMS");
		mochila.getItems().stream().forEach(e -> {
			
			if (e instanceof Eletronico) {
				log.info("############# ITEMS QUE PODEM SER LIGADOS E DESLIGADOS");
				Eletronico item = (Eletronico) e;
				item.ligar(e);
				item.desligar(e);
			} else if(e instanceof Utilidade) {
				log.info("############# ITEMS QUE PODEM SER ABERTOS E FECHADOS");
				Utilidade item = (Utilidade) e;
				item.abrir(e);
				item.fechar(e);
			}
			
		});

	}

}
