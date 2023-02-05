package Agendav2;
import java.util.ArrayList;

public class Agendav2 {
	
	private ArrayList<Contactov2> lista = new ArrayList<Contactov2>(100);
	
	public int comprobarContacto() {
		
		int numContactos = 0;
	    for (Contactov2 contacto : lista) {
	        if (contacto != null) {
	            numContactos++;
	        }
	    }
	    return numContactos;
	}
	
	public int getNumContactos() {
		int numContactos = comprobarContacto();
		return numContactos;
	}
	
	public String agregarContacto(Contactov2 contacto) {
		
	    	if(comprobarContacto() <= 100) {
	        	if (!lista.contains(contacto)) {	
	            lista.add(contacto);
	            return "\nCONTACTO "  + contacto.getNombre() + " " + "Agregado con EXITO\n";
	        	}else {
	        		return "\nEl CONTACTO " + contacto.getNombre() + " "  + "ya existe en el SISTEMA\n";
	        	}
	        }else {
	        	return "\nNumero MAXIMO de CONTACTOS alcanzado\n";
	        }
	        }

	public String borrarContacto(String nombre) {
	
		for (Contactov2 contacto : lista) {	
					
			if (contacto.equals(new Contactov2(nombre))){
			
				if (lista.contains(contacto)) {	
					lista.remove(contacto);
					return "CONTACTO Elimnado";
				}else {		
					return "";
			}
			}
		}
		return "El CONTACTO buscado NO existe!";
		}

	public String buscarContacto(String nombre) {
		
		for (Contactov2 contacto : lista) {	
					
			if (contacto.equals(new Contactov2(nombre))){
				return contacto.toString();
			}
		}
		return "El CONTACTO buscado NO existe!";
		}
	
	public String modificarContactoNombre(String nombre, String nombre1) {
		
		for (Contactov2 contacto : lista) {	
			if (contacto.equals(new Contactov2(nombre))){
				contacto.setNombre(nombre1);
				return "Nombre CAMBIADO con EXITO";
			}else {
				return "";		
			}
	}
		return "El CONTACTO buscado NO existe!";
	}
	
	public String modificarContactoTelefono(String nombre, int telefono) {
		
		for (Contactov2 contacto : lista) {	
			if (contacto.equals(new Contactov2(nombre))){
				contacto.setTelefono(telefono);
				return "Telefono CAMBIADO con EXITO";
			}else {
				return "El CONTACTO buscado NO existe!";
			}		
	}
		return "";
	}
	
	public String modificarContactoCorreo(String nombre, String correo) {
		
		for (Contactov2 contacto : lista) {	
			if (contacto.equals(new Contactov2(nombre))){
				contacto.setCorreo(correo);
				return "Correo CAMBIADO con EXITO";
			}else {
				return "";			
			}
	}
		return "El CONTACTO buscado NO existe!";
	}
	
	@Override
	public String toString() {
		return lista.toString();
	}

}
