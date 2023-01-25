package Fraccion;
import java.util.InputMismatchException;
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
		try {	
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
		System.out.println("10-Prueba Equals");
		System.out.println("11-Salir del programa");
		int seleccion = in1.nextInt();
				
		System.out.println();
		switch (seleccion) {
		case 1: 
			System.out.println("Introduzca La FRACCION en formato numerador/denominador");
			String cadena = in1.next();
			Fraccion fr1 = leeFraccion(cadena);
			System.out.println("OPCION 1:");
			System.out.print("\tINVERTIR Fraccion: ");
			Fraccion invertida = fr1.invierte();
			System.out.println(invertida);
			break;
		case 2:
			System.out.println("Introduzca FRACCION en formato numerador/denominador");
			cadena = in1.next();
			fr1 = leeFraccion(cadena);
			fr1.simplificar();
			System.out.println("OPCION 2: ");		
			System.out.println("Introduzca el numero por el que MULTIPLICAR: ");	
			int numero = in1.nextInt();
			Fraccion multiplica = fr1.multiplica(numero);
			System.out.print("\tMULTIPLICA Fraccion " + fr1 + " por " + numero + " = " + multiplica);
			System.out.println();
			break;
		case 3:
			System.out.println("Introduzca La Primera FRACCION en formato numerador/denominador");
			cadena = in1.next();
			fr1 = leeFraccion(cadena);
			fr1.simplificar();
			System.out.println("OPCION 3: ");
			System.out.println("Introduzca la segunda FRACCION en formato numerador/denominador");
			cadena = in1.next();
			Fraccion fr2 = leeFraccion(cadena);
			fr2.simplificar();
			Fraccion multiplicar = fr1.multiplicar(fr2);
			System.out.println("OPCION 4: ");
			System.out.println("\tMULTIPLICAR Fracciones " + fr1 + " por " + fr2 + " = " + multiplicar);
			System.out.println();
			break;
		case 4:
			System.out.println("Introduzca La FRACCION en formato numerador/denominador");
			cadena = in1.next();
			fr1 = leeFraccion(cadena);
			System.out.println("OPCION 4:");
			Fraccion simplificada = fr1.simplificar();
			System.out.println("\tFraccion " + fr1 + " SIMPLIFICADA: " + simplificada);
			System.out.println();
			break;
		case 5:
			System.out.println("Introduzca La FRACCION en formato numerador/denominador");
			cadena = in1.next();
			fr1 = leeFraccion(cadena);
			fr1.simplificar();
			System.out.println("OPCION 5:");
			System.out.println("Introduzca el numero por el que DIVIDIR: ");	
			numero = in1.nextInt();
			Fraccion divide = fr1.divide(numero);
			System.out.print("\tDIVIDIR Fraccion: " + fr1 + " entre " + numero + " = " + divide);
			System.out.println();
			break;
		case 6:
			System.out.println("Introduzca La Primera FRACCION en formato numerador/denominador");
			cadena = in1.next();
			fr1 = leeFraccion(cadena);
			fr1.simplificar();
			System.out.println("Introduzca la Segunda FRACCION en formato numerador/denominador");
			cadena = in1.next();
			System.out.println("OPCION 6:");
			Fraccion fr3 = leeFraccion(cadena);
			fr3.simplificar();
			Fraccion dividir = fr1.dividir(fr3);
			System.out.println("\tDIVIDIR Fracciones " + fr1 + " por " + fr3 + " = " + dividir);
			System.out.println();
			break;
		case 7:
			System.out.println("Introduzca La Primera FRACCION en formato numerador/denominador");
			cadena = in1.next();
			fr1 = leeFraccion(cadena);
			fr1.simplificar();
			System.out.println("Introduzca La Segunda FRACCION en formato numerador/denominador");
			cadena = in1.next();
			System.out.println("OPCION 7:");
			Fraccion fr4 = leeFraccion(cadena);
			fr4.simplificar();
			if(fr1.fraccionEquivalente(fr4)) {
				System.out.println("\tLas fracciones " + fr1 + " y "  + fr4 + " SON EQUIVALENTES");
				System.out.println();
			}else {
				System.out.println("\tLas fracciones " + fr1 + " y "  + fr4 + " NO SON EQUIVALENTES");
				System.out.println();
			}
		case 8:
			System.out.println("Introduzca La Primera FRACCION en formato numerador/denominador");
			cadena = in1.next();
			fr1 = leeFraccion(cadena);
			fr1.simplificar();
			System.out.println("Introduzca la Segunda FRACCION en formato numerador/denominador");
			cadena = in1.next();
			System.out.println("OPCION 8:");
			Fraccion fr5 = leeFraccion(cadena);
			fr5.simplificar();
			System.out.println("\tLa SUMA de la Fraccion " + fr1 + " y la Fraccion " + fr5 + " = " + fr1.suma(fr5));
			System.out.println();
		case 9:
			System.out.println("Introduzca La Primera FRACCION en formato numerador/denominador");
			cadena = in1.next();
			fr1 = leeFraccion(cadena);
			fr1.simplificar();
			System.out.println("Introduzca la Segunda FRACCION en formato numerador/denominador");
			cadena = in1.next();
			System.out.println("OPCION 9:");
			Fraccion fr6 = leeFraccion(cadena);
			fr6.simplificar();
			System.out.println("\tLa RESTA de la Fraccion " + fr1 + " y la Fraccion " + fr6 + " = " + fr1.resta(fr6));
			System.out.println();
		case 10:
			System.out.println("Introduzca La Primera FRACCION en formato numerador/denominador");
			cadena = in1.next();
			fr1 = leeFraccion(cadena);
			fr1.simplificar();
			System.out.println("Introduzca la Segunda FRACCION en formato numerador/denominador");
			cadena = in1.next();
			System.out.println("OPCION 10:");
			Fraccion fr7 = leeFraccion(cadena);
			fr7.simplificar();
			if(fr1.equals(fr7)) {
				System.out.println("\tLa Fraccion " +fr1+ " y la fraccion " + fr7 +" SON FRACCIONES IGUALES");
				System.out.println();
				break;
			}else {
				System.out.println("\tLa Fraccion " +fr1+ " y la fraccion " + fr7 +" NO SON FRACCIONES IGUALES");
				System.out.println();
				break;
			}
		case 11:
			System.out.println("OPCION 11:");
			System.out.println("\tSaliendo del Programa...");
			salir = true;
			break;
			}
		}catch(NumberFormatException e) {
			System.err.println("FRACCION INCORRECTA");
			salir = false;
		}catch(InputMismatchException ex) {
			System.err.println("OPCION INCORRECTA");
			in1.next();
		}
		}
		in1.close();
	}
}