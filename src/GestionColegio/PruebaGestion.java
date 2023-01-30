package GestionColegio;
import java.util.InputMismatchException;
import java.util.Scanner;
public class PruebaGestion {
	
	public static void main(String[] args) {
		
		Scanner in1 = new Scanner (System.in);
		boolean salir = false;
		
		Curso curso1 = new Curso("Matematicas");
		
		Alumno alumno1 = new Alumno("Alejando", "Rodriguez","Y8182831L","Calle San Cristobal 51 1C ",0, "No Presentado");
		Alumno alumno4 = new Alumno("Borja", "Rodriguez","Y817782831L","Direccion 2 ",5, "Aprobado");
		Alumno alumno2 = new Alumno("Carlos", "Dominguez","Y7423423L","Direccion 3 ",6, "Aprobado");
		Alumno alumno3 = new Alumno("David", "Gonzalez","Y6425345345","Direccion 4 ",9, "Sobresaliente");
		
		curso1.agregarAlumno(alumno1);
		curso1.agregarAlumno(alumno2);
		curso1.agregarAlumno(alumno3);
		curso1.agregarAlumno(alumno4);
		curso1.ordenarAlumnosAlfabeticamente();
		
		while(!salir) {
		try {
		System.out.println("--GESTION COLEGIO--\n");
		System.out.println("1- Añadir Nuevo Alumnno ");
		System.out.println("2- Borrar Alumno ya Existente ");
		System.out.println("3- Modificar Datos de Alumno");
		System.out.println("4- Mostrar Datos de Alumnos");
		System.out.println("5- Cambiar Nota");
		System.out.println("6- Estadisticas ");
		System.out.print("Introduce una opcion: ");
		int seleccion = in1.nextInt();
		switch (seleccion) {
		case 1: 
			System.out.println("");
			System.out.println("OPCION 1");
			System.out.println("");
			System.out.println("AÑADIR NUEVO ALUMNO");
			System.out.println("Introduzca el NOMBRE del alumno");
			String nombre = in1.next();
			System.out.println("Introduzca el APELLIDO del alumno");
			String apellido = in1.next();
			System.out.println("Introduzca el DNI del alumno");
			String dni = in1.next();
			System.out.println("Introduzca la DIRECCION del alumno");
			in1.nextLine();
			String direccion = in1.nextLine();	
			System.out.println("Introduzca la NOTA del ALUMNO");
			int notaNumero = in1.nextInt();
			Alumno alumno5 = new Alumno(nombre,apellido,dni,direccion,notaNumero);
			curso1.asignarNota(notaNumero, alumno5);
			System.out.println(curso1.agregarAlumno(alumno5));
			System.out.println("");
			curso1.ordenarAlumnosAlfabeticamente();
			break;
			
		case 2:
			System.out.println("");
			System.out.println("OPCION 2");
			System.out.println("");
			System.out.println("BORRAR ALUMNO");
			System.out.println("");
			System.out.println("Introduzca el DNI del alumno que quiere eliminar de la lista: ");
			dni = in1.next();
			if(curso1.comprobarDNI(dni) == true) {	
			System.out.println(curso1.borrarAlumno(dni));
			System.out.println("");
			}else {
				System.err.println("DNI NO Encontrado");
			}
			break;
			
		case 3:
			System.out.println("");
			System.out.println("OPCION 3");
			System.out.println("");
			System.out.println("Introduca el DNI del alumno que quiere modificar su DIRECCION: ");
			
			dni = in1.next();
			if(curso1.comprobarDNI(dni) == true) {
				System.out.println("Introduzca la nueva DIRECCION");
				in1.nextLine();
				direccion = in1.nextLine();
				System.out.println(curso1.modificarDireccion(dni, direccion));
				break;
			}else {
				System.err.println("DNI NO Encontrado");
			}
			break;
		case 4:
			System.out.println("");
			System.out.println("OPCION 4");
			System.out.println("");
			System.out.println("MOSTRAR Datos de los ALUMNOS");
			System.out.println("");
			System.out.printf(curso1.mostrarAlumnos());
			System.out.println("");
			break;
		case 5:
			System.out.println("");
			System.out.println("OPCION 5");
			System.out.println("");
			System.out.println("Introduzca el DNI del alumno que quiere CAMBIAR la NOTA");
			dni = in1.next();
			if(curso1.comprobarDNI(dni) == true) {
				System.out.println("Introduzca la nueva NOTA");
				notaNumero = in1.nextInt();
				System.out.println(curso1.cambiarNota(dni, notaNumero));
				break;
			}else {
				System.err.println("DNI NO Encontrado");
			}
			break;
		case 6:
			System.out.println("");
			System.out.println("OPCION 6");
			System.out.println("");
			System.out.println("ESTADISTICAS de los ALUMNOS");
			System.out.println(curso1.estadisticasCurso());
			}
		}catch(InputMismatchException e) {
			System.err.println("OPCION INCORRECTA");
			in1.next();
		}
	}
		
	}
}
