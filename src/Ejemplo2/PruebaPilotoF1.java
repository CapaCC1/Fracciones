package Ejemplo2;

public class PruebaPilotoF1 {

	public static void main(String[] args) {
		
		PilotoF1 piloto1 = new PilotoF1();
		PilotoF1 piloto2 = new PilotoF1();
		PilotoF1 piloto3 = new PilotoF1();
		
		piloto1.nombre = "Fernando";
		piloto1.apellido = "Alonso";
		piloto1.nacionalidad = "España";
		piloto1.setDorsal(14);
		piloto1.setVictorias(32);
		piloto1.edad = 41; 
		
		piloto2.nombre = "Carlos";
		piloto2.apellido = "Sainz JR";
		piloto2.nacionalidad = "España";
		piloto2.setDorsal(54);;
		piloto1.setVictorias(32);
		piloto2.edad = 25; 
		
		piloto3.nombre = "Lewis";
		piloto3.apellido = "Hamilton";
		piloto3.nacionalidad = "Inglaterra";
		piloto2.setDorsal(54);;
		piloto1.setVictorias(32);
		piloto3.edad = 30; 
		
		System.out.println(piloto1.getNombre() +  " " + piloto1.getApellido() + " con dorsal: " + piloto1.dorsal + " Con un numero total de victorias: " + piloto1.numeroVictorias);
		System.out.println(piloto2.getNombre() +  " " + piloto2.getApellido() + " con dorsal: " + piloto2.dorsal + " Con un numero total de victorias: " + piloto2.numeroVictorias);
		System.out.println(piloto3.getNombre() +  " " + piloto3.getApellido() + " con dorsal: " + piloto3.dorsal + " Con un numero total de victorias: " + piloto3.numeroVictorias);
	}
}
