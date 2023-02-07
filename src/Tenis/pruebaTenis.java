package Tenis;

import java.util.Scanner;

public class pruebaTenis {
	
	public static void main(String[] args) {
		
		Scanner in1 = new Scanner (System.in);
		boolean salir = false;
		
		System.out.println("*FINAL RONALD GARROS*");
		System.out.println("");
		System.out.println("Introduzca el NOMBRE del PRIMER EQUIPO");
		String primerEquipo = in1.next();
		System.out.print("Jugador 1: ");
		in1.nextLine();
		String jugadorN1 = in1.nextLine();
		Jugador jugador1 = new Jugador(jugadorN1);
		
		System.out.print("Jugador 2: ");
		String jugadorN2 = in1.nextLine();
		Jugador jugador2 = new Jugador(jugadorN2);
		
		Equipo equipo1 = new Equipo(primerEquipo, jugador1, jugador2);
		
		System.out.println("");
		System.out.println("Introduzca el NOMBRE del SEGUNDO EQUIPO");
		String segundoEquipo = in1.next();
		System.out.print("Jugador 1: ");
		in1.nextLine();
		jugadorN1 = in1.nextLine();
		jugador1 = new Jugador(jugadorN1);
		
		System.out.print("Jugador 2: ");
		jugadorN2 = in1.nextLine();
		jugador2 = new Jugador(jugadorN2);
		
		Equipo equipo2 = new Equipo(segundoEquipo, jugador1, jugador2);
		Partido partido1 = new Partido();
		partido1.aniadirEquipo(equipo1);
		partido1.aniadirEquipo(equipo2);
		
		while(!salir) {
			System.out.println("");
			System.out.println("ESTADISTICAS");
			System.out.println("1. Contabiliza Punto Ganador");
			System.out.println("2. Contabiliza Error No Forzado");
			System.out.println("3. Contabiliza Saque Directo");
			System.out.println("4. Muestra Estadisticas de Jugador");
			System.out.println("5. Muestra Estadisticas de Equipo");
			int seleccion = in1.nextInt();
			switch(seleccion) {
			case 1:
				System.out.println("");
				System.out.println("*CONTABILIZA PUNTO GANADOR*");
				System.out.println("");
				System.out.println("Introduzca Nombre del JUGADOR");
				in1.nextLine();
				String nombre = in1.nextLine();
				System.out.println(partido1.aniadePuntoGanador(nombre));
				break;
			case 2:
				System.out.println("");
				System.out.println("CONTABILIZA ERROR NO FORZADO");
				System.out.println("");
				System.out.println("Introduzca Nombre del JUGADOR");
				in1.nextLine();
				nombre = in1.nextLine();
				System.out.println(partido1.aniadeErroresNoForzados(nombre));
				break;
			case 3:
				System.out.println("");
				System.out.println("CONTABILIZA SAQUE DIRECTO");
				System.out.println("");
				System.out.println("Introduzca Nombre del JUGADOR");
				in1.nextLine();
				nombre = in1.nextLine();
				System.out.println(partido1.aumentarSaquesDirectos(nombre));
				break;
			case 4:
				System.out.println("");
				System.out.println("MUESTRA ESTADISTICAS DE JUGADOR");
				System.out.println("");
				System.out.println("Introduzca el Nombre del JUGADOR: ");
				in1.nextLine();
				nombre = in1.nextLine();
				System.out.println(partido1.buscaJugador(nombre));
				break;
			case 5:
				System.out.println("");
				System.out.println("MUESTRA ESTADISTICAS DE EQUIPO");
				System.out.println("");
				System.out.println("Introduzca el Nombre del EQUIPO");
				in1.nextLine();
				String equipo = in1.nextLine();
				System.out.println(partido1.buscaEquipo(equipo));
				break;
			}
		}
		in1.close();
	}

}
