package GestionColegio;

public class Curso {
	private String asignatura;
    private Alumno[] lista;
    private int numAlumnos;
    private int maxAlumnos = 30;

    public Curso(String asignatura) {
        this.asignatura = asignatura;
        this.lista = new Alumno[maxAlumnos];
        this.numAlumnos = 0;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public Alumno[] getLista() {
        return lista;
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
    public boolean comprobarDNI(String dni) {
    	for (int i = 0; i < numAlumnos; i++) {
            if (lista[i].getDni().equals(dni)) {
                return true;
            }
        }
        return false;
    }
    public boolean comprobarNumeroAlumnos() {
    	return numAlumnos < maxAlumnos;
    	}
    }

    

