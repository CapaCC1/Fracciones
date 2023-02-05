package Agendav2;

import java.util.Objects;

public class Contactov2 {
	private String nombre;
	private int telefono;
	private String correo;

public Contactov2 (String nombre, int telefono, String correo) {
	this.nombre = nombre;
	this.telefono = telefono;
	this.correo = correo;
}
public Contactov2 (String nombre) {
	this.nombre = nombre;
}
	public String getNombre() {
		return nombre;
	}
	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getTelefono() {
		return telefono;
	}
	
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	public String getCorreo() {
		return correo;
	}
	
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contactov2 other = (Contactov2) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		
		return String.format("---------------------------------------------------------------------------------------------\n"
        		+ "| Nombre: %-15s |Telefono: %-15s |Email: %-30s |\n"
        		+ "---------------------------------------------------------------------------------------------\n",
        		
                nombre, telefono, correo);
                
	}
	
	

}

