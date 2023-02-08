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
	
	public Jugador buscaJugador(String nombreJugador) {
        if (jugador1.equals(new Jugador(nombreJugador))) {
            return jugador1;
        }
        if (jugador2.equals(new Jugador(nombreJugador))) {
            return jugador2;
        }
        return null;
	}
	
	public int aniadePuntoGanador(String nombre) {
		Jugador jugador = buscaJugador(nombre);
		if(jugador != null) {
			jugador.aumentarPuntosGanados();
			return 0;
		}else {
			return 1;	
		}	
	}
	
	public int aniadeErroresNoForzados(String nombre) {
		Jugador jugador = buscaJugador(nombre);
		if(jugador != null) {
			jugador.aumentaErroresNoForzados();
			return 2;
		}else {
			return 1;
		}
		
	}
	
	public int aniadeSaquesDirectos(String nombre) {
		Jugador jugador = buscaJugador(nombre);
		if(jugador != null) {
			jugador.aumentarSaquesDirectos();
			return 3;
		}else {
			return 1;
		}
	}
	
	public String muestraEstadisticasJugador(String nombreJugador) {
	    Jugador jugador = buscaJugador(nombreJugador);
	    String resultado = "";
	    if (jugador != null) {
	      resultado += jugador.toString();
	    }
	    return resultado;
	  }
	
	private int calculaPuntosGanadoresTotales() {
	    int puntos = 0;
	    if (jugador1 != null && jugador1.getPuntosGanadores() != 0) {
	      puntos += jugador1.getPuntosGanadores();
	    }
	    if (jugador2 != null && jugador2.getPuntosGanadores() != 0) {
	      puntos += jugador2.getPuntosGanadores();
	    }
	    return puntos;
	  }
	
	private int calculaErroresNoForzadosTotales() {
	    int puntos = 0;
	    if (jugador1 != null && jugador1.getErroresNoForzados() != 0) {
	      puntos += jugador1.getErroresNoForzados();
	    }
	    if (jugador2 != null && jugador2.getErroresNoForzados() != 0) {
	      puntos += jugador2.getErroresNoForzados();
	    }
	    return puntos;
	  }
	
	private int calculaSaquesDirectosTotales() {
	    int puntos = 0;
	    if (jugador1 != null && jugador1.getSaquesDirectos() != 0) {
	      puntos += jugador1.getSaquesDirectos();
	    }
	    if (jugador2 != null && jugador2.getSaquesDirectos() != 0) {
	      puntos += jugador2.getSaquesDirectos();
	    }
	    return puntos;
	  }
	
	public Equipo buscaEquipoJugador(String nombre, Equipo equipo) {
		Jugador jugador = buscaJugador(nombre);
	    if (jugador != null) {
	      return equipo;
	    }
	    jugador = buscaJugador(nombre);
	    if (jugador != null) {
	      return equipo;
	    }
	    return null;
	  }
	
	public String toString() {
		String resultado = "";
		resultado += "Equipo: " + nombreEquipo;
		int puntosGanadoresTotales = calculaPuntosGanadoresTotales();
		int erroresNoForzadosTotales = calculaErroresNoForzadosTotales();
		int saquesDirectosTotales = calculaSaquesDirectosTotales();
		
		if(puntosGanadoresTotales > 0) {
			resultado += "\nPuntos GANADORES: " + puntosGanadoresTotales;
		}if(erroresNoForzadosTotales > 0) {
			resultado += "\nErrores No Forzados: " + erroresNoForzadosTotales;
		}if(saquesDirectosTotales > 0) {
			resultado += "\nSaques Directos: " + saquesDirectosTotales;
		}if(puntosGanadoresTotales == 0 && erroresNoForzadosTotales == 0 && saquesDirectosTotales == 0) {
			resultado += " Sin DATOS Registrados";
		}
		return resultado;
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
