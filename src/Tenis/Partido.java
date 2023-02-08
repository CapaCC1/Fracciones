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
	
	public String muestraEstadisticasJugador(String nombreJugador) {
	    Equipo equipo = equipo1.buscaEquipoJugador(nombreJugador, equipo1);
	    if (equipo != null) {
	        return equipo.muestraEstadisticasJugador(nombreJugador);
	        
	    }   
	     equipo = equipo2.buscaEquipoJugador(nombreJugador, equipo2);
	    if (equipo != null) {
	        return equipo.muestraEstadisticasJugador(nombreJugador);
	        
	    }
	    return "Jugador NO Encontrado";
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
	
	public int agregaSaqueDirecto(String nombre) {
	    Equipo equipo = null;
	    
	    if(equipo1.buscaJugador(nombre) != null) {
	      equipo = equipo1;
	    }else if (equipo2.buscaJugador(nombre) != null) {
	      equipo = equipo2;
	    }if (equipo != null) {
	      equipo.aniadeSaquesDirectos(nombre);
	     return 0;
	    }else {
	      return 1;
	    }
	  }
	
	public int agregaPuntoGanador(String nombre) {
	    Equipo equipo = null;
	    
	    if(equipo1.buscaJugador(nombre) != null) {
	      equipo = equipo1; 
	    }else if (equipo2.buscaJugador(nombre) != null) {
	      equipo = equipo2;
	    }if (equipo != null) {
	      equipo.aniadePuntoGanador(nombre);
	      return 1; 
	    }else {
	      return 0;
	    }
	  }
	
	public int agregaErrorNoForzado(String nombre) {
	    Equipo equipo = null;
	    
	    if(equipo1.buscaJugador(nombre) != null) {
	      equipo = equipo1; 
	    }else if (equipo2.buscaJugador(nombre) != null) {
	      equipo = equipo2;  
	    }if (equipo != null) {
	      equipo.aniadeErroresNoForzados(nombre);
	      return 0;
	    }else {	
	      return 1;

	    }
	  }
	
	public String muestraEstadisticasEquipo(String nombre) {
	    Equipo equipo = buscaEquipo(nombre);
	    if (equipo != null) {
	      return equipo.toString();
	    }else {
	    return "EQUIPO No encontrado.";
	  }
	}
	}

