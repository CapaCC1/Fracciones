package Tenis;

import java.util.Objects;

public class Equipo {
	private String nombreEquipo;
	private Jugador jugador1;
	private Jugador jugador2;
	private int puntosGanadoresTotales;
	private int erroresNoForzadosTotales;
	private int saquesDirectosTotales;
	
	public Equipo(String nombreEquipo,Jugador jugador1,Jugador jugador2) {
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
		this.nombreEquipo = nombreEquipo;
		this.puntosGanadoresTotales = 0;
		this.erroresNoForzadosTotales = 0;
		this.saquesDirectosTotales = 0;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public int getPuntosGanadoresTotales() {
		return puntosGanadoresTotales;
	}

	public void setPuntosGanadoresTotales(int puntosGanadoresTotales) {
		this.puntosGanadoresTotales = puntosGanadoresTotales;
	}

	public int getErroresNoForzadosTotales() {
		return erroresNoForzadosTotales;
	}

	public void setErroresNoForzadosTotales(int erroresNoForzadosTotales) {
		this.erroresNoForzadosTotales = erroresNoForzadosTotales;
	}

	public int getSaquesDirectosTotales() {
		return saquesDirectosTotales;
	}

	public void setSaquesDirectosTotales(int saquesDirectosTotales) {
		this.saquesDirectosTotales = saquesDirectosTotales;
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
		return Objects.equals(jugador1, other.jugador1) && Objects.equals(jugador2, other.jugador2);
	}

	@Override
	public String toString() {
		return nombreEquipo + "\nJugador 1: " + jugador1
				+ "\nJugador 2: " + jugador2;
	}
	
}
