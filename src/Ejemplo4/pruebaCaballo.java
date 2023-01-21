package Ejemplo4;

public class pruebaCaballo {

	public static void main(String[] args) {
		
		/*Creamos nuestro caballo*/
		Caballo fury = new Caballo("Fury" , "marron", "andaluz", "macho", 80, 60.5);
		
		Caballo sombragris = new Caballo("Sombragris", "negro", "purasangre", "macho", 85, 55.3);
		
		Caballo luna = new Caballo ("Luna" , "blanco", "arabe", "hembra", 75, 61.2);
		
		System.out.println("Nicolas Acaricia a Fury");
		fury.relincha();
	
		System.out.println("Nicolas da de comer a Sombragris: ");
		sombragris.caballoCome("zanahoria");
		System.out.println();
		
		System.out.println("Nicolas da de comer a luna");
		luna.caballoCome("brocoli");
		
		System.out.println();
		fury.carreraCaballos(sombragris);
		System.out.println("");
		sombragris.carreraCaballos(luna);
		
	}

}
