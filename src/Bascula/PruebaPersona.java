package Bascula;
import java.util.Scanner;
public class PruebaPersona {

	public static String comprobarIMC(double imc, String nombre1) {
		String resultado = "";
		if(imc < 18.5) {
			resultado += ("El IMC de " + nombre1 + " es " + imc);
			resultado += (" -> Peso Insuficiente ");
			
		}else if(imc > 18.5 && imc < 24.9){
			resultado += ("El IMC de " + nombre1 + " es " + imc);
			resultado+=(" -> Normopeso");
			
		}else if(imc > 25 && imc < 26.9) {
			resultado += ("El IMC de " + nombre1 + " es " + imc);
			resultado += (" -> Sobrepeso Grado 1");
			
		}else if(imc > 27 && imc < 29.9) {
			resultado += ("El IMC de " + nombre1 + " es " + imc);
			resultado += (" -> Sobrepeso Grado 2 (Preobesidad)");
			
		}else if(imc > 30 && imc < 34.9) {
			resultado += ("El IMC de " + nombre1 + " es " + imc);
			resultado += (" -> Obesidad Tipo 1");
			
		}else if(imc > 35 && imc < 39.9) {
			resultado += ("El IMC de " + nombre1 + " es " + imc);
			resultado += (" -> Obesidad Tipo 2");
			
		}else if(imc > 40 && imc < 49.9) {
			resultado += ("El IMC de " + nombre1 + " es " + imc);
			resultado += (" -> Obesidad Tipo 3(Morbida)");
			
		}else if(imc > 50) {
			resultado += ("El IMC de " + nombre1 + " es " + imc);
			resultado += (" -> Obesidad Tipo 3(Extrema)");
			
		}
		return resultado;
	}
	
	public static void main(String[] args) {
		
		Scanner in1 = new Scanner (System.in);
		boolean salir = false;
		System.out.println("--PROGRAMA BASCULA--");
		
		while(!salir) {
			
			System.out.println();
			System.out.println("1-Persona 1");
			System.out.println("2-Persona 2");
			System.out.println("3-Persona 3");
			System.out.println();
			System.out.println("Elija la Opcion Deseada: ");
			int opcion = in1.nextInt();
			switch(opcion) {
			case 1:

					System.out.println("PERSONA 1");
					System.out.println("\tObtencion de Atributos por Teclado");
					System.out.println();
					System.out.println("Introduzca el NOMBRE de la primera PERSONA");
					String nombre1 = in1.next();
					System.out.println("Introduzca la EDAD de la primera PERSONA");
					int edad1 = in1.nextInt();
					System.out.println("Introduca el SEXO de la primera PERSONA");
					String sexo1 = in1.next();
					System.out.println("Introduzca el PESO de la primera PERSONA");
					double peso1 = in1.nextDouble();
					System.out.println("Introduzca la ALTURA de la primera PERSONA");
					double altura1 = in1.nextDouble();
					Persona persona1 = new Persona(nombre1, "123456789X", edad1, sexo1, peso1, altura1);	
					double imc = persona1.determina_IMC();
					System.out.println(comprobarIMC(imc, nombre1));
					break;
					
				
			case 2:
				System.out.println("PERSONA 2");
				System.out.println("\tAl Objeto se le pasan por parámetro el nombre, la edad y el sexo.\n "
						+ "El peso y la altura le serán proporcionados a través de los métodos set");
				Persona persona2 = new Persona("Nicolas", "123456789X", 25, "H", 85, 1.75);
				break;
			case 3:
				System.out.println("PERSONA 3");
				System.out.println("Se inicializa por parametros directamente ");
				Persona persona3 = new Persona("Sara", "123456789X", 23, "M", 65, 1.65);
				break;
			}
		}
		
		
		
		
	}
}
