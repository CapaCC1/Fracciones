package Fraccion;
import java.util.Scanner;
public class PruebaFraccion {
	public static Fraccion leeFraccion(String cadena) {
	    String[] partes = cadena.split("/");
	    int numerador = Integer.parseInt(partes[0]);
	    int denominador = Integer.parseInt(partes[1]);
	    
	    return new Fraccion(numerador, denominador);
	}
	
	public static void main(String[] args) {
		
		Scanner in1 = new Scanner(System.in);
		
		boolean salir = false;
		System.out.println("***-- PROGRAMA PARA OPERAR CON Fracciones --***");
		
		while (!salir) {
		
		System.out.println();
		System.out.println("1-Invierte Fraccion");
		System.out.println("2-Multiplica Numero por Fraccion");
		System.out.println("3-Multiplica Fraccion por Fraccion");
		System.out.println("4-Simplifica una Fraccion");
		System.out.println("5-Divide una Fraccion por un numero");
		System.out.println("6-Divide una Fraccion por otra Fraccion");
		System.out.println("7-¿Son equivalentes dos Fracciones?");
		System.out.println("8-Suma Fracciones");
		System.out.println("9-Resta Fracciones");
		System.out.println("10-Salir del programa");
		int seleccion = in1.nextInt();
			
		System.out.println("Introduzca Fraccion en formato numerador/denominador");
		
		String cadena = in1.next();
		Fraccion fr1 = leeFraccion(cadena);
		System.out.println();
		switch (seleccion) {
		case 1: 
			System.out.println("OPCION 1:");
			System.out.print("\tInvertir Fraccion: ");
			Fraccion invertida = fr1.invierte();
			System.out.println(invertida);
			break;
		case 2:
			System.out.println("OPCION 2: ");		
			System.out.println("Introduzca el numero por el que MULTIPLICAR: ");	
			int numero = in1.nextInt();
			Fraccion multiplica = fr1.multiplica(numero);
			System.out.print("\tMultiplica Fraccion " + fr1 + " por " + numero + " = " + multiplica.simplificar());
			break;
		case 3:
			System.out.println("OPCION 3: ");
			System.out.println("Introduzca la segunda Fraccion en formato numerador/denominador");
			cadena = in1.next();
			Fraccion fr2 = leeFraccion(cadena);
			Fraccion multiplicar = fr1.multiplicar(fr2);
			System.out.println("OPCION 4: ");
			System.out.println("\tMultiplicar Fracciones " + fr1 + " por " + fr2 + " = " + multiplicar.simplificar());
			break;
		case 4:
			System.out.println("OPCION 4:");
			Fraccion simplificada = fr1.simplificar();
			System.out.println("\tFraccion " + fr1 + " simplificada: " + simplificada);
			break;
		case 5:
			System.out.println("OPCION 5:");
			System.out.println("Introduzca el numero por el que DIVIDIR: ");	
			numero = in1.nextInt();
			Fraccion divide = fr1.divide(numero);
			System.out.print("\tDividir Fraccion: " + fr1 + " entre " + numero + " = " + divide);
			break;
		case 6:
			System.out.println("Introduzca la segunda Fraccion en formato numerador/denominador");
			cadena = in1.next();
			System.out.println("OPCION 6:");
			Fraccion fr3 = leeFraccion(cadena);
			Fraccion dividir = fr1.dividir(fr3);
			System.out.println("\tDividir Fracciones " + fr1 + " por " + fr3 + " = " + dividir.simplificar());
			break;
		case 7:
			System.out.println("Introduzca la segunda Fraccion en formato numerador/denominador");
			cadena = in1.next();
			System.out.println("OPCION 7:");
			Fraccion fr4 = leeFraccion(cadena);
			fr1.simplificar();
			fr4.simplificar();
			if(fr1.fraccionEquivalente(fr4)) {
				System.out.println("\tLas fracciones " + fr1 + " y "  + fr4 + " SON EQUIVALENTES");
			}else {
				System.out.println("\tLas fracciones " + fr1 + " y "  + fr4 + " NO SON EQUIVALENTES");
			}
		}
		}
		
	}

}
