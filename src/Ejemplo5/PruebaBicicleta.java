package Ejemplo5;
import java.util.InputMismatchException;
import java.util.Scanner;
public class PruebaBicicleta {

	public static void main(String[] args) {
		System.out.println("--SIMULADOR BICICLETA--");
		System.out.println();
		Scanner in1 = new Scanner (System.in);
		
		Bicicleta bici1 = new Bicicleta("MOUSTACHE SAMEDI 29", "Verde", 7, 6, 7);
		
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
				System.err.println(bici1);
				break;
			case 2:
				System.err.println(bici1.bajarVelocidad());
				System.err.println(bici1);
				break;
			case 3: 
				System.err.println(bici1.subirMarchaPlato());
				System.err.println(bici1);
				break;
			case 4:
				System.err.println(bici1.bajarMarchaPlato());
				System.err.println(bici1);
				break;
			case 5:
				System.err.println(bici1.subirMarchaPinion());
				System.err.println(bici1);
				break;
			case 6:
				System.err.println(bici1.bajarMarchaPinion());
				System.err.println(bici1);
				break;
			case 7:
				descanso = true;
				System.err.println("Volviendo a Casa...");
				break;
				
			default: 
				System.err.println("OPCION NO VALIDA!!");
				break;	
			}
		}
	}
}	
	}catch (InputMismatchException e){
		System.err.println("POSICION INCORRECTA");
	}	
}
}
