package GestionColegio;

public class Alumno {

	private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;
    private int notaNumero;
    private String notaLetra;	
	
    public Alumno(String nombre, String apellidos, String dni, String direccion, int notaNumero, String notaLetra) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.notaNumero = notaNumero;
        this.notaLetra = notaLetra;
    }
    public Alumno(String nombre, String apellidos, String dni, String direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;

    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNotaNumero() {
        return notaNumero;
    }

    public void setNotaNumero(int notaNumero) {
        this.notaNumero = notaNumero;
    }

    public String getNotaLetra() {
        return notaLetra;
    }

    public void setNotaLetra(String notaLetra) {
        this.notaLetra = notaLetra;
    }
    public boolean equals(Alumno alumno) {
    	return (this.dni == alumno.getDni());
    }
    
    
}
