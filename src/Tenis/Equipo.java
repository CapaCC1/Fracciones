package Tenis;

import java.util.Objects;

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
	public Jugador getJugador1() {
		return jugador1;
		
	}
	public Jugador getJugador2() {
		return jugador2;
		
	}
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	
	public Jugador buscaJugador(String nombre) {
			
			if(jugador1.equals(new Jugador(nombre))) {
					return jugador1;
			}if(jugador2.equals(new Jugador(nombre))) {
				return jugador2;
			}
			return null;
	}
	 public String getEquipo(String nombre) {
	        if (nombre.equals(jugador1.getNombreJugador())) {
	            return jugador1.getNombreEquipo();
	        } else if (nombre.equals(jugador2.getNombreJugador())) {
	            return jugador2.getNombreEquipo();
	        } else {
	            return null;
	        }
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
	
	public String aniadeSaquesDirectos(String nombre) {
		Jugador jugador = buscaJugador(nombre);
		if(jugador != null) {
			jugador.aumentarSaquesDirectos();
			return "Saque Directo Agregado!";
		}else {
			return "Jugador NO Encontrado";
		}
	}
	
	@Override
	public String toString() {
		return nombreEquipo + "\n\tJugador 1: " + jugador1 + "\n"
				+ "\n\tJugador 2: " + jugador2 + "\n";				
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return Objects.equals(nombreEquipo, other.nombreEquipo);
	}
	
}
