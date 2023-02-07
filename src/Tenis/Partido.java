package Tenis;

import java.util.ArrayList;

public class Partido {
	private ArrayList<Equipo> equipos;
	
	public Partido() {
		this.equipos = new ArrayList<>();
	}
	
	public void aniadirEquipo(Equipo equipo) {
		this.equipos.add(equipo);
	}
	
	public Jugador buscaJugador(String nombre) {
		for (Equipo equipo : equipos) {
			for (Jugador jugador : equipo.getJugadores()) {
				if(jugador.equals(new Jugador(nombre))) {
					return jugador;
				}	
			}
		}
		return null;
	}
	
	public Equipo buscaEquipo(String nombre) {
	    for (Equipo equipo : equipos) {
	      if (equipo.equals(new Equipo(nombre))) {
	        return equipo;
	      }
	    }
	    return null;
	  }
	
	public String aniadePuntoGanador(String nombre) {
		Jugador jugador = buscaJugador(nombre);
		if(jugador != null) {
			jugador.aumentarPuntosGanados();
			return "Punto Agregado!";
		}else {
			return "Jugador NO Encontrado";	
		}	
	}
	
	public String aniadeErroresNoForzados(String nombre) {
		Jugador jugador = buscaJugador(nombre);
		if(jugador != null) {
			jugador.aumentaErroresNoForzados();
			return "Error No Forzado Agregado!";
		}else {
			return "Jugador NO Encontrado";
		}
		
	}
	
	public String aumentarSaquesDirectos(String nombre) {
		Jugador jugador = buscaJugador(nombre);
		if(jugador != null) {
			jugador.aumentarSaquesDirectos();
			return "Saque Directo Agregado!";
		}else {
			return "Jugador NO Encontrado";
		}
		
	}
}
