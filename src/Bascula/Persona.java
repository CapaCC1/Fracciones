package Bascula;

public class Persona {
	private String nombre;
	private String dni;
	private int edad;
	private String sexo;
	private double peso;
	private double altura;
	
	Persona(String nombre, String dni, int edad, String sexo, double peso, double altura){
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		
	}
	Persona(){
		this.sexo = "H";
		this.nombre = "";
		this.dni = "";
		this.edad = 0;
		this.peso = 0;
		this.altura = 0;
	}
	
	Persona(String nombre, int edad, String sexo){
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		}
	
	// Métodos de acceso
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
	
	public double determina_IMC() {
		return peso / (altura * altura);
	}
	
	public boolean esMayordeEdad() {
		return edad > 18;
	}
	
	public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", DNI: " + dni + ", Sexo: " + sexo + ", Peso: " + peso + "kg, Altura: " + altura + "m, IMC: ";
    }
}
