package GestionColegio;
import java.util.Scanner;
public class PruebaGestion {
	
	public static void main(String[] args) {
		
		Scanner in1 = new Scanner (System.in);
		boolean salir = false;
		
		Curso curso1 = new Curso("Matematicas");
		
		Alumno alumno1 = new Alumno("Paco", "Rodriguez","Y8182831L","Direccion",5,"Aprobado");
		Alumno alumno2 = new Alumno("Jesus", "Rodriguez","Y8182831L","Direccion",7,"Notable");
		Alumno alumno3 = new Alumno("Jose", "Dominguez","Y7423423L","Direccion",6,"Apronado");
		Alumno alumno4 = new Alumno("Luiz", "Gonzalez","Y6425345345","Direccion",9,"Sobresaliente");
		while(!salir) {
			
		System.out.println("--GESTION COLEGIO--\n");
		System.out.println("1- Añadir Nuevo Alumnno ");
		System.out.println("2- Borrar Alumno ya Existente ");
		System.out.println("3- Modificar Datos de Alumno");
		System.out.println("4- Mostrar Datos de Alumno");
		System.out.println("5- Cambiar Nota");
		System.out.println("6- Estadisticas ");
		System.out.print("Introduce una opcion: ");
		int seleccion = in1.nextInt();
		switch (seleccion) {
		case 1: 
			System.out.println("OPCION 1");
			
			System.out.println("Introduzca el NOMBRE del alumno");
			String nombre = in1.next();
			System.out.println("Introduzca el APELLIDO del alumno");
			String apellido = in1.next();
			System.out.println("Introduzca el DNI del alumno");
			String dni = in1.next();
			System.out.println("Introduzca la DIRECCION del alumno");
			in1.nextLine();
			String direccion = in1.nextLine();
			
			Alumno alumno5 = new Alumno(nombre,apellido,dni,direccion);
			
				System.out.println(curso1.agregarAlumno(alumno5));
			}
		}
	}
	}

