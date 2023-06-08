package com.projeto.base.modelo;

public abstract class Funcionalidade {
	
	
	public void abrir() {
		System.out.println("Abrir");
	} 
	
	public void fechar() {
		System.out.println("fechar");
	}
	
	public void ligar() {
		System.out.println("ligar");
	} 
	
	public void desligar() {
		System.out.println("desligar");
	} 
	
	public void funcao(Object obj) {
		
		if (obj instanceof Item) {
			
		}
		
	}

}
