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
	
	public String aniadePuntoGanador(String nombre) {
		Jugador jugador = buscaJugador(nombre);
		if(jugador != null) {
			jugador.aumentarPuntosGanados();
			puntosGanadoresTotales++;
			return "Punto Agregado!";
		}else {
			return "Jugador NO Encontrado";	
		}	
	}
	
	public String aniadeErroresNoForzados(String nombre) {
		Jugador jugador = buscaJugador(nombre);
		if(jugador != null) {
			jugador.aumentaErroresNoForzados();
			erroresNoForzadosTotales++;
			return "Error No Forzado Agregado!";
		}else {
			return "Jugador NO Encontrado";
		}
		
	}
	
	public String aniadeSaquesDirectos(String nombre) {
		Jugador jugador = buscaJugador(nombre);
		if(jugador != null) {
			jugador.aumentarSaquesDirectos();
			saquesDirectosTotales++;
			return "Saque Directo Agregado!";
		}else {
			return "Jugador NO Encontrado";
		}
		
	}
	
	public String muestraEstadisticasJugador(String nombreJugador) {
		String resultado = "";
	    Jugador jugador = buscaJugador(nombreJugador);
	    if (jugador != null) {
	      return jugador.obtenEstadisticasJugador();
	    }else {
	     resultado += "JUGADOR No Encontrado!";
	    }
	    return resultado;
	  }
	public String obtenEstadisticasEquipo() {
		String resultado = "";
		
		resultado += nombreEquipo;
		if(puntosGanadoresTotales > 0) {
			resultado += "\nPuntos GANADORES: " + puntosGanadoresTotales;
		}if(erroresNoForzadosTotales > 0) {
			resultado += "\nErrores No Forzados: " + erroresNoForzadosTotales;
		}if(saquesDirectosTotales > 0) {
			resultado += "\nSaques Directos: " + saquesDirectosTotales;
		}if(puntosGanadoresTotales == 0 && erroresNoForzadosTotales == 0 && saquesDirectosTotales == 0) {
			resultado += " SIN DATOS";
		}
		return resultado;
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
