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
	
	
	public Equipo buscaEquipo(String nombre) {
	    
	      if (equipo1.equals(new Equipo(nombre))) {
	        return equipo1;
	      }else {
	    	  return equipo2;
	      } 
	  }

}
