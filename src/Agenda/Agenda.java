package Agenda;

public class Agenda {
	
	private Contacto[] lista = new Contacto[100];

	public Contacto[] getLista() {
		return lista;
	}

	public void setLista(Contacto[] lista) {
		this.lista = lista;
	}
	
	public int comprobarAlumnos() {
		int numContactos = 0;
    	for (int i = 0; i < lista.length; i++) {
			if(lista[i] != null) {
				numContactos++;
			}
		}
    	return numContactos;
    	}
	public int getNumContactos() {
		int numContactos = comprobarAlumnos();
		return numContactos;
	}
	
	public boolean comprobarNombre(String nombre) {
		int numContactos = comprobarAlumnos();
    	for (int i = 0; i < numContactos; i++) {
            if (lista[i].getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }
	
	 public String agregarContacto(Contacto contacto) {
		 int numContactos = comprobarAlumnos();
	    	if(comprobarAlumnos() <= 100) {
	    		
	        	if (!comprobarNombre(contacto.getNombre())) {	
	            lista[numContactos] = contacto;
	            numContactos++;
	            return "\nCONTACTO "  + contacto.getNombre() + " " + "Agregado con EXITO\n";
	        	}else {
	        		return "\nEl CONTACTO " + contacto.getNombre() + " "  + "ya existe en el SISTEMA\n";
	        	}
	        }else {
	        	return "\nNumero MAXIMO de CONTACTOS alcanzado\n";
	        }
	        }
	 
	 public String mostrarAlumnos() {
		 int numContactos = comprobarAlumnos();
	        String listaContactos = "Lista de CONTACTOS de la agenda:\n\n";
	        for (int i = 0; i < numContactos; i++) {
	            Contacto contacto = lista[i];
	       
	            listaContactos += String.format("---------------------------------------------------------------------------------------------\n"
	            		+ "| Nombre: %-15s |Telefono: %-15s |Email: %-30s |\n"
	            		+ "---------------------------------------------------------------------------------------------\n",
	            		
	                    contacto.getNombre(), contacto.getTelefono(), contacto.getCorreo());
	                    
	        }
	        return listaContactos;
	    }
	 public String borrarContacto(String nombre) {
		 int numContactos = comprobarAlumnos();
		 
	        for (int i = 0; i < numContactos; i++) {
	            Contacto contacto = lista[i];
	            	
	            if (contacto.getNombre().equals(nombre)){
	            	
	                for (int j = i; j < numContactos - 1; j++) {
	                    lista[j] = lista[j + 1];
	                }
	                lista[numContactos - 1] = null;
	                return "\nCONTACTO "+ contacto.getNombre() + " eliminado con exito";
	            }
	            
	        }
	        return "El CONTACTO buscado NO existe";
	        
	    }
	 
	 public String buscarContacto(String nombre) {
	        int numContactos = comprobarAlumnos();
	        for (int i = 0; i < numContactos; i++) {
	            Contacto contacto = lista[i];
	            if (contacto.getNombre().equals(nombre)){
	                return String.format("---------------------------------------------------------------------------------------------\n"
		            		+ "| Nombre: %-15s |Telefono: %-15s |Email: %-30s |\n"
		            		+ "---------------------------------------------------------------------------------------------\n",
		            		
		                    contacto.getNombre(), contacto.getTelefono(), contacto.getCorreo());
	            }
	        }
	        return "El CONTACTO buscado NO existe";
	    }
	 public String modificarContactoNombre(String nombre, String nombre1) {
		 int numContactos = comprobarAlumnos();
	        for (int i = 0; i < numContactos; i++) {
	        	
	        	 Contacto contacto = lista[i];
	        		 
	        		 if (contacto.getNombre().equals(nombre)){
		            	contacto.setNombre(nombre1);
		            	return "Nombre CAMBIADO con EXITO";
		            }else {
		            	
		            }
	        	 }
	        return "El CONTACTO buscado NO existe!";
	        }
	
	public String modificarContactoTelefono(String nombre, int telefono) {
		 int numContactos = comprobarAlumnos();
	        for (int i = 0; i < numContactos; i++) {
	        	
	        	 Contacto contacto = lista[i];

	        		 
		            if (contacto.getNombre().equals(nombre)){
		            	contacto.setTelefono(telefono);
		            	return "Telefono CAMBIADO con EXITO";
		            	
		            }else{
		            	
		            } 
	        	 }
	        return "El CONTACTO buscado NO existe!";
	        }
	public String modificarContactoCorreo(String nombre, String correo) {
		 int numContactos = comprobarAlumnos();
		 
	        for (int i = 0; i < numContactos; i++) {
	        	
	        	 Contacto contacto = lista[i];
	        		 
		            if (contacto.getNombre().equals(nombre)){
		            	contacto.setCorreo(correo);
		            	return "Correo CAMBIADO con EXITO";
		            }else{
		            } 	 
	        }
	        return "El CONTACTO buscado NO existe!";
	}
	 
}