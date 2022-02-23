package com.cmc.evaluacion.otro.entidades;

import java.util.ArrayList;

public class Naipe {

	private ArrayList<Numero> numerosPosibles;
	private ArrayList<Carta> cartas;
	
	public ArrayList<Carta> getCartas() {
		return cartas;
	}
	
	public ArrayList<Numero> getNumerosPosibles() {
		return numerosPosibles;
	}

	public void setNumerosPosibles(ArrayList<Numero> numerosPosibles) {
		this.numerosPosibles = numerosPosibles;
	}

	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}

	public Naipe (){
		numerosPosibles = new ArrayList<Numero>();
		numerosPosibles.add(new Numero("A", 11));
		numerosPosibles.add(new Numero("2", 2));
		numerosPosibles.add(new Numero("3", 3));
		numerosPosibles.add(new Numero("4", 4));
		numerosPosibles.add(new Numero("5", 5));
		numerosPosibles.add(new Numero("6", 6));
		numerosPosibles.add(new Numero("7", 7));
		numerosPosibles.add(new Numero("8", 8));
		numerosPosibles.add(new Numero("9", 9));
		numerosPosibles.add(new Numero("10", 10));
		numerosPosibles.add(new Numero("J", 10));
		numerosPosibles.add(new Numero("Q", 10));
		numerosPosibles.add(new Numero("K", 10));
		
		cartas = new ArrayList<Carta>();
		for (Numero n : numerosPosibles){
			cartas.add(new Carta(n, Palos.CORAZON_NEGRO));
			cartas.add(new Carta(n, Palos.DIAMANTE));
			cartas.add(new Carta(n, Palos.CORAZON_ROJO));
			cartas.add(new Carta(n, Palos.TREBOL));
			
		}
	}
	
	public ArrayList<Carta> barajar(){
		ArrayList<Carta> auxiliar = new ArrayList<Carta>();
		for (int x =1; x <=100;x++){
		int random = Random.obtenerPosicion();
		Carta c =cartas.get(random);
		if (c.getEstado().equals("N")){
			auxiliar.add(c);
			c.setEstado("C");
		} 
		}
			for (Carta ca : cartas) {
				if (ca.getEstado().equals("N")) {
					auxiliar.add(ca);
					ca.setEstado("C");
				}
			}
		return auxiliar;
	}
	
	
	
	
	
}
