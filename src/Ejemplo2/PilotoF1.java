package Ejemplo2;

public class PilotoF1 {
	
	String nacionalidad;
	String nombre;
	String apellido;
	int edad;
	int dorsal;
	int numeroVictorias;
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public int getVictorias() {
		return numeroVictorias;
	}
	
	public int getDorsal() {
		return dorsal;
	}
	
	public void setDorsal (int dorsal) {
		this.dorsal = dorsal;
	}
	
	public void setVictorias (int numeroVictorias) {
		this.numeroVictorias = numeroVictorias;
	}
	
}
