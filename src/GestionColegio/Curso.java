package GestionColegio;
import java.util.Arrays;
import java.util.Comparator;

public class Curso {
	private String asignatura;
    private Alumno[] lista;
    private int numAlumnos;
//    private int maxAlumnos = 30;

    public Curso(String asignatura) {
        this.asignatura = asignatura;
        this.lista = new Alumno[30];
//        this.numAlumnos = 0;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public void setLista(Alumno[] lista) {
        this.lista = lista;
    }

    public int getNumAlumnos() {
        return numAlumnos;
    }
    
    public String agregarAlumno(Alumno alumno) {
    	if(comprobarNumeroAlumnos()) {
    		
        	if (!comprobarDNI(alumno.getDni())) {	
            lista[numAlumnos] = alumno;
            numAlumnos++;
            return "\nALUMNO "  + alumno.getNombre() + " " + alumno.getApellidos() + " Agregado con EXITO\n";
        	}else {
        		return "\nEl ALUMNO " + alumno.getNombre() + " " + alumno.getApellidos()  + " con DNI "+ alumno.getDni() + " ya existe en el SISTEMA\n";
        	}
        	}else {
        		return "\nNumero MAXIMO de ALUMNOS alcanzado\n";
        	}
        }
    
    public String borrarAlumno(String dni) {
    	
        for (int i = 0; i < numAlumnos; i++) {
            Alumno alumno = lista[i];
            if (alumno.getDni().equals(dni)) {
            	
                for (int j = i; j < numAlumnos - 1; j++) {
                    lista[j] = lista[j + 1];
                }
                numAlumnos--;
                return "\nALUMNO "+ alumno.getNombre() + " " + alumno.getApellidos() + " eliminado con exito";
            }
        }
        return "El ALUMNO buscado NO existe";
        
    }

    public boolean comprobarDNI(String dni) {
    	for (int i = 0; i < numAlumnos; i++) {
            if (lista[i].getDni().equals(dni)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean comprobarNumeroAlumnos() {
    	return numAlumnos <= 30;
    	}
    
    public String mostrarAlumnos() {
    	
        String listaAlumnos = "Lista de alumnos del curso " + asignatura + ":\n\n";
        
        for (int i = 0; i < numAlumnos; i++) {
            Alumno alumno = lista[i];
       
            listaAlumnos += String.format("---------------------------------------------------------------------------------------------------------------------------------\n"
            		+ "| %-15s | %-10s | %-20s | %-40s | Nota: %2d [%2s]\n"
            		+ "---------------------------------------------------------------------------------------------------------------------------------\n",
            		
                    alumno.getNombre(), alumno.getApellidos(), alumno.getDni(),
                    alumno.getDireccion(), alumno.getNotaNumero(), alumno.getNotaLetra());
        }
        return listaAlumnos;
    }
    public void ordenarAlumnosAlfabeticamente() {
    	
        Arrays.sort(lista, 0, numAlumnos, new Comparator<Alumno>() {
            public int compare(Alumno alumno1, Alumno alumno2) {
                return alumno1.getNombre().compareTo(alumno2.getNombre());
            }
        });
    }
   
    public String modificarDireccion(String dni, String direccion) {
    	for (int i = 0; i < numAlumnos; i++) {
            Alumno alumno = lista[i];
            if (alumno.getDni().equals(dni)) {
            	alumno.setDireccion(direccion);
            }
    }
    	return "DIRECCION cambiada con EXITO";
    }
    
    public String cambiarNota(String dni,int notaNumero) {
    	for (int i = 0; i < numAlumnos; i++) {
			Alumno alumno = lista[i];
			if(alumno.getDni().equals(dni)) {
				alumno.setNotaNumero(notaNumero);
			}
		}
    	return "NOTA cambiada con EXITO";
    }
    
    public void asignarNota(int notaNumero, Alumno alumno) {
    	
    	if(notaNumero <= 0) {
    		alumno.setNotaLetra("No Presentado");
    		alumno.setNotaNumero(notaNumero);
    	}else if(notaNumero < 5 && notaNumero > 0) {
    		alumno.setNotaLetra("Suspenso");
    		alumno.setNotaNumero(notaNumero);
    	}else if(notaNumero >= 5 && notaNumero < 7) {
    		alumno.setNotaLetra("Aprobado");
    		alumno.setNotaNumero(notaNumero);
    	}else if(notaNumero >= 7 && notaNumero < 9) {
    		alumno.setNotaLetra("Notable");
    		alumno.setNotaNumero(notaNumero);
    	}else if(notaNumero >= 9 && notaNumero < 10) {
    		alumno.setNotaLetra("Sobresaliente");
    		alumno.setNotaNumero(notaNumero);
    	}else if(notaNumero == 10) {
    		alumno.setNotaLetra("Matricula De Honor");
    		alumno.setNotaNumero(notaNumero);
    	}
    }
    
    public String estadisticasCurso() {
    	int noPresentado = 0;
        int aprobados = 0;
        int suspendidos = 0;
        int notables = 0;
        int sobresalientes = 0;
        int matriculaHonor = 0;
        
        for (int i = 0; i < numAlumnos; i++) {
            Alumno alumno = lista[i];
            int nota = alumno.getNotaNumero();
            if(nota <= 0) {
            	noPresentado++;
            }
            if (nota >= 5 && nota < 7) {
                aprobados++;
                
            }if(nota < 5 && nota > 0) {
                suspendidos++;
            }
            if (nota >= 7 && nota < 9) {
                notables++;
            }
            if (nota >= 9 && nota < 10) {
                sobresalientes++;
            }
            if (nota == 10) {
                matriculaHonor++;
            }
        }
        double porcNoPresentados = (double) noPresentado / numAlumnos * 100;
        double porcAprobados = (double) aprobados / numAlumnos * 100;
        double porcSuspendidos = (double) suspendidos / numAlumnos * 100;
        double porcNotables = (double) notables / numAlumnos * 100;
        double porcSobresalientes = (double) sobresalientes / numAlumnos * 100;
        double porcMatriculaHonor = (double) matriculaHonor / numAlumnos * 100;
        
        return "Estadísticas del curso " + asignatura + ":\n\n"
        	+ "No Presentados: " + porcNoPresentados + "%\n"
            + "Aprobados: " + porcAprobados + "%\n"
            + "Suspendidos: " + porcSuspendidos + "%\n"
            + "Notables: " + porcNotables + "%\n"
            + "Sobresalientes: " + porcSobresalientes + "%\n"
            + "Matrícula de honor: " + porcMatriculaHonor + "%\n";
    }
    
}
    

    

