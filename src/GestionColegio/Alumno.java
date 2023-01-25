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
}
