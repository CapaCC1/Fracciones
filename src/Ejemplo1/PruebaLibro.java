package Ejemplo1;

public class PruebaLibro {

	public static void main(String[] args) {
		
		// A continuación creamos varios objetos de esta clase libro.
				LibroV1 lib = new LibroV1();
				System.out.println ("Se ha creado el 1er libro " + lib);

				LibroV1 miLibrito = new LibroV1();
				System.out.println ("Se ha creado el 2º libro " + miLibrito);

				LibroV1 quijote = new LibroV1();
				System.out.println ("Se ha creado el 3er libro " + quijote);

				// Cuando tratamos de imprimir los objetos, observamos algo raro que nos sale por pantalla.
				System.out.println ("Como podemos ver al intentar imprimir los objetos, son enlaces a direcciones de memoria");
	}
}
