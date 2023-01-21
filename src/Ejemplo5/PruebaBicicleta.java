package Ejemplo5;
import java.util.InputMismatchException;
import java.util.Scanner;
public class PruebaBicicleta {

	public static void main(String[] args) {
		Scanner in1 = new Scanner (System.in);
		
		Bicicleta bici1 = new Bicicleta("MOUSTACHE SAMEDI 29", "Verde", 7, 5, 5);
		
		boolean descansar = false;
		boolean descanso = false;
		
			
		try {
		while (!descansar) {
		
		System.out.println("MENU BICICLETA");
		System.out.println();
		System.out.println("1-Montar MI Bicicleta");
		System.out.println("2-Montar Bicicleta Prestada");
		System.out.println("3-Descansar");
		int seleccion = in1.nextInt();
		while(!descanso) {
			
		switch (seleccion) {
		case 1: 
			System.out.println();
			System.out.println("MI BICICLETA");
			System.out.println();
			System.out.println("1-Accelerar");
			System.out.println("2-Frenar");
			System.out.println("3-Subir Marcha PLATO");
			System.out.println("4-Bajar Marcha PLATO");
			System.out.println("5-Subir Marcha PINION");
			System.out.println("6-Bajar Marcha PINION");
			System.out.println("7-Volver a Casa");
			System.out.println();
			System.out.println("Introduce la opcion deseada: ");
			int seleccion1 = in1.nextInt();
		
			
			switch(seleccion1) {
			case 1:
				System.err.println(bici1.subirVelocidad());
				System.out.println("VELOCIDAD ACTUAL: " + bici1.getVelocidadActual() + "KMH");
				break;
			case 2:
				System.out.println(bici1.bajarVelocidad());
				System.out.println("VELOCIDAD ACTUAL: " + bici1.getVelocidadActual() + "KMH");
				break;
			case 3: 
				System.err.println(bici1.subirMarchaPlato());
				System.out.println("MARCHA ACTUAL PLATO: " + bici1.getMarchaActualPlato());
				break;
			case 4:
				System.err.println(bici1.bajarMarchaPlato());
				System.out.println("MARCHA ACTUAL PLATO: " + bici1.getMarchaActualPlato());
				break;
			case 5:
				System.err.println(bici1.subirMarchaPinion());
				System.out.println("MARCHA ACTUAL PINION: " + bici1.getMarchaActualPinion());
				break;
			case 6:
				System.err.println(bici1.bajarMarchaPinion());
				System.out.println("MARCHA ACTUAL PINION: " + bici1.getMarchaActualPinion());
				break;
			case 7:
				descanso = true;
				System.out.println("Volviendo a Casa...");
				break;
			}
		
		
		}
		}
		}	
	}catch (InputMismatchException e){
		System.out.println("POSICION INCORRECTA");
	}	
}
}



