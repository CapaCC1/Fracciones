package Tenis;

public class Partido {
	private Equipo equipo1;
	private Equipo equipo2;
	
	public Partido(Equipo equipo1, Equipo equipo2) {
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
	}

	public Equipo getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}

	public Equipo getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}
	
	public Equipo buscaEquipoJugador(String nombre) {
		Jugador jugador = equipo1.buscaJugador(nombre);
	    if (jugador != null) {
	      return equipo1;
	    }
	    jugador = equipo2.buscaJugador(nombre);
	    if (jugador != null) {
	      return equipo2;
	    }
	    return null;
	  }
	
	public Equipo buscaEquipo(String nombre) {
		
	    if (equipo1.equals(new Equipo(nombre))) {
	      return equipo1;
	    }
	    
	    if (equipo2.equals(new Equipo(nombre))) {
	      return equipo2;
	    }
	    return null;
	  }
	
	public String agregaSaqueDirecto(String nombre) {
	    Equipo equipo = null;
	    String resultado = "";
	    
	    if(equipo1.buscaJugador(nombre) != null) {
	      equipo = equipo1;
	      
	    }else if (equipo2.buscaJugador(nombre) != null) {
	      equipo = equipo2;
	      
	    }if (equipo != null) {
	      resultado = equipo.aniadeSaquesDirectos(nombre);
	      return resultado;
	      
	    }else {
	    	
	      resultado = "Jugador NO encontrado en ambos equipos";
	      return resultado;
	    }
	  }
	
	public String agregaPuntoGanador(String nombre) {
	    Equipo equipo = null;
	    String resultado = "";
	    
	    if(equipo1.buscaJugador(nombre) != null) {
	      equipo = equipo1;
	      
	    }else if (equipo2.buscaJugador(nombre) != null) {
	      equipo = equipo2;
	      
	    }if (equipo != null) {
	      resultado = equipo.aniadePuntoGanador(nombre);
	      return resultado;
	      
	    }else {
	    	
	      resultado = "Jugador NO encontrado en ambos equipos";
	      return resultado;
	    }
	  }
	
	public String agregaErrorNoForzado(String nombre) {
	    Equipo equipo = null;
	    String resultado = "";
	    
	    if(equipo1.buscaJugador(nombre) != null) {
	      equipo = equipo1;
	      
	    }else if (equipo2.buscaJugador(nombre) != null) {
	      equipo = equipo2;
	      
	    }if (equipo != null) {
	      resultado = equipo.aniadeErroresNoForzados(nombre);
	      return resultado;
	      
	    }else {
	    	
	      resultado = "JUGADOR No encontrado en ambos equipos";
	      return resultado;
	    }
	  }
	
	public String muestraEstadisticasEquipo(String nombre) {
	    Equipo equipo = buscaEquipo(nombre);
	    if (equipo != null) {
	      return equipo.obtenEstadisticasEquipo();
	    }
	    return "EQUIPO No encontrado.";
	  }
	}

