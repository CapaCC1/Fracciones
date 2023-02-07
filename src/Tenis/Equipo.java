package Tenis;

import java.util.ArrayList;

public class Equipo {
	private String nombreEquipo;
	private Jugador jugador1;
	private Jugador jugador2;
	
	
	public Equipo(String nombreEquipo,Jugador jugador1,Jugador jugador2) {
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
		
		this.nombreEquipo = nombreEquipo;
		
	}
	
	public Equipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public ArrayList<Jugador> getJugadores() {
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		jugadores.add(jugador1);
		jugadores.add(jugador2);
		return jugadores;
		
	}
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	
	@Override
	public String toString() {
		return nombreEquipo + "\nJugador 1: " + jugador1 + "\n"
				+ "\nJugador 2: " + jugador2 + "\n";
				
				
	}
	
}
