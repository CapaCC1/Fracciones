package Agendav2;

import java.util.Scanner;
import Agendav2.Agendav2;
import Agendav2.Contactov2;


public class pruebaAgendav2 {

	public static void main(String[] args) {
		Scanner in1 = new Scanner (System.in);
		boolean salir = false;
		Agendav2 iphone1 = new Agendav2();
		Contactov2 contacto1 = new Contactov2 ("Jose",642254345,"jose@gmail.com");
		Contactov2 contacto2 = new Contactov2("Agustin",652284345,"agustin@gmail.com");
		Contactov2 contacto3 = new Contactov2("Juan",678267745,"juan@gmail.com");
		Contactov2 contacto4 = new Contactov2("Pedro",612264345,"pedro@gmail.com");
		Contactov2 contacto5 = new Contactov2("Marcos",602256345,"marcos@gmail.com");
		
		iphone1.agregarContacto(contacto1);
		iphone1.agregarContacto(contacto2);
		iphone1.agregarContacto(contacto3);
		iphone1.agregarContacto(contacto4);
		iphone1.agregarContacto(contacto5);
		
		while(!salir) {

			System.out.println("");
			System.out.println("--AGENDA DE CONTACTOS--");
			System.out.println("");
			System.out.println("1- Añadir Contacto");
			System.out.println("2- Eliminar Contacto");
			System.out.println("3- Buscar Contacto");
			System.out.println("4- Ver Todos los Nombres");
			System.out.println("5- Modifica Contacto");
			int seleccion = in1.nextInt();
			
			switch(seleccion) {
			case 1:
				System.out.println("");
				System.out.println("OPCION 1");
				System.out.println("Añadir Contacto");
				System.out.println("");
				System.out.println("Introduzca el NOMBRE del CONTACTO");
				String nombre = in1.next();
				System.out.println("Introduzca un NUMERO de TELEFONO");
				int telefono = in1.nextInt();
				System.out.println("Introduzca el CORREO electronico");
				String correo = in1.next();
				
				Contactov2 contacto6 = new Contactov2(nombre,telefono,correo);
				System.out.println(iphone1.agregarContacto(contacto6));
				break;
			case 2:
				System.out.println("");
				System.out.println("OPCION 2");
				System.out.println("");
				System.out.println("Eliminar Contacto");
				System.out.println("");
				System.out.println("Introduzca el NOMBRE del CONTACTO que quieres ELIMINAR");
				nombre = in1.next();
				
				System.out.println(iphone1.borrarContacto(nombre));
				break;
			
			case 3:
				System.out.println("");
				System.out.println("OPCION 3");
				System.out.println("");
				System.out.println("Buscar CONTACTO");
				System.out.println("");
				System.out.println("Introduzca el NOMBRE del CONTACTO que quieres BUSCAR");
				nombre = in1.next();
				
				System.out.println(iphone1.buscarContacto(nombre));
				break;
			case 4:
				System.out.println("");
				System.out.println("OPCION 4");
				System.out.println("");
				System.out.println("Ver Todos los Nombres");
				System.out.println("");
				System.out.println(iphone1.toString());
				break;
			case 5:
				System.out.println("");
				System.out.println("OPCION 5");
				System.out.println("");
				System.out.println("Elige el Parametro a MODIFICAR");
				System.out.println("1- Nombre");
				System.out.println("2- Telefono");
				System.out.println("3- Correo");
				seleccion = in1.nextInt();
				switch(seleccion) {
				case 1:
					System.out.println("");
					System.out.println("OPCION 1");
					System.out.println("");
					System.out.println("Cambiar NOMBRE");
					System.out.println("Introduzca el NOMBRE del contacto que quieras cambiar el NOMBRE");
					nombre = in1.next();
					System.out.println("Introduce el nuevo NOMBRE");
					String nombre1 = in1.next();
					
					System.out.println(iphone1.modificarContactoNombre(nombre, nombre1));
				case 2:
					System.out.println("");
					System.out.println("OPCION 2");
					System.out.println("");
					System.out.println("Cambiar Telefono");
					System.out.println("Introduzca el NOMBRE del contacto que quieras cambiar el TELEFONO");
					nombre = in1.next();
					System.out.println("Introduce el nuevo TELEFONO");
					telefono = in1.nextInt();
					
					System.out.println(iphone1.modificarContactoTelefono(nombre,telefono));
					break;
				
				case 3:
					System.out.println("");
					System.out.println("OPCION 3");
					System.out.println("");
					System.out.println("Cambiar Correo");
					System.out.println("Introduzca el NOMBRE del contacto que quieras cambiar el CORREO");
					nombre = in1.next();
					System.out.println("Introduzca el nuevo CORREO");
					correo = in1.next();
					
					System.out.println(iphone1.modificarContactoCorreo(nombre, correo));
					break;
			}
		}
	}
}
}