package Ejemplo4;

public class Caballo {
	
	String nombre, color, raza, sexo;
	int peso;
	double velocidadMaxima;
	
	Caballo(String nombre, String color, String raza, String sexo, int peso, double velocidadMaxima){
		this.nombre = nombre;
		this.color = color;
		this.raza = raza;
		this.sexo = sexo;
		this.peso = peso;
		this.velocidadMaxima = velocidadMaxima;
	}
	
	Caballo() {
		this.sexo = "macho";
	}
	
	Caballo(String s){
		if(s.equals("macho")) {
			this.sexo = s;
		}else if(sexo.equals("hembra")){
			this.sexo = s;
		}else {
			System.out.println("Esa condicion sexual no existe");
			this.sexo = "hermafrodita";
		}
	}
	
	String getNombre() {
		return this.nombre;
	}
	
	String getSexo() {
		return this.sexo;
	}
	
	double getVelocidadMaxima() {
		return this.velocidadMaxima;
	}
	
	void relincha() {
		System.out.println("¡hiiii, hiiii, hiiii!\n");
	}
	
	void cepillarCaballo() {
		System.out.println("*Caballo poner cara de gustito*");
	}
	
	void caballoCome (String comida) {
		if(comida.equals("zanahoria")) {
			System.out.println("*Caballo se lo come felizmente*");
		}else {
			System.out.println("*Caballo se va enfadado*");
		}
	}
	
	void carreraCaballos (Caballo rival) {
		if (this.sexo.equals("hembra")) {
			System.out.println("Corre " + this.nombre + " contra " + rival.getNombre());
			System.out.println(this.nombre + " dice: Las damas no hacemos carreras");

		}else {
			if(rival.getSexo().equals("hembra")){
				System.out.println("Corre " + this.nombre + " contra " + rival.getNombre());
				System.out.println(rival.getNombre() + " dice: Las damas no hacemos carreras");
			}else {
				if(this.velocidadMaxima > rival.getVelocidadMaxima()) {
					System.out.println("Corre " + this.nombre + " contra " + rival.getNombre());
					System.out.println("GANA " + this.nombre);
				}else {
					System.out.println("Corre " + this.nombre + " contra " + rival.getNombre());
					System.out.println("GANA " + rival.getNombre());
				}
			}
		}
	}
	
}
