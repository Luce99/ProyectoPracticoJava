package com.cmc.evaluacion.otro.servicios;

import java.util.ArrayList;
import java.util.HashMap;

import com.cmc.evaluacion.otro.entidades.Carta;
import com.cmc.evaluacion.otro.entidades.Naipe;

public class Juego {

	private Naipe naipe;
	private ArrayList<Carta> naipeBarajado;
	private HashMap<String, ArrayList<Carta>> cartasJugador;
	private ArrayList<String> keys;
	
	public Naipe getNaipe() {
		return naipe;
	}


	public void setNaipe(Naipe naipe) {
		this.naipe = naipe;
	}


	public HashMap<String, ArrayList<Carta>> getCartasJugador() {
		return cartasJugador;
	}


	public void setCartasJugador(HashMap<String, ArrayList<Carta>> cartasJugador) {
		this.cartasJugador = cartasJugador;
	}


	@Override
	public String toString() {
		return "Juego [naipe=" + naipe + ", cartasJugador=" + cartasJugador + "]";
	}


	public Juego(String[]id){
		cartasJugador = new HashMap<String, ArrayList<Carta>>();
		int tamaño = id.length;
		keys = new ArrayList<String>();
		for (int i =0; i<tamaño;i++){
			ArrayList<Carta> c = new ArrayList<Carta>();
			 cartasJugador.put(id[i], c);
			 keys.add(id[i]);
		}
	}
	
	public Juego(){
		naipe = new Naipe();
		naipeBarajado = naipe.barajar();
		
	}
	
	public void entregarCartas(int cartasPorJugador){
		Juego juego = new Juego();
		int jugadores = keys.size();
		int contador = 0;
		int contador2 = 0;
			for (int x =0; x<jugadores; x++){
				contador =0;
				ArrayList<Carta> res = cartasJugador.get(keys.get(x));
				while (contador<cartasPorJugador){
				res.add(juego.naipeBarajado.get(contador2));
				contador += 1;
				contador2 = contador2 + 1 ;
				}
		}
	}
	
	public int devolverTotal(String id){
		ArrayList<Carta> cartas = cartasJugador.get(id);
		int suma = 0;
		 for (Carta c : cartas){
			 suma += c.getNumero().getValor();
		 }
	return suma;
	}
	
	public String determinarGanador(){
		String idGanador = keys.get(0);
		int sumaGanador= devolverTotal(keys.get(0));
		int jugadores = keys.size();
		for (int i =0; i<jugadores; i++){
			if (devolverTotal(keys.get(i))>sumaGanador){
				sumaGanador= devolverTotal(keys.get(i));
				idGanador= keys.get(i);
			}
		}
		return idGanador;
	}
	
	
	
	
}
