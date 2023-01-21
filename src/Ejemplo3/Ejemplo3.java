package Ejemplo3;

	class Auto {
	    //Atributos de la clase
	    private String marca;
	    private String modelo;
	    private int año;
	    private double precio;
	 
	    //Constructor
	    public Auto(String marca, String modelo, int año, double precio) {
	        this.marca = marca;
	        this.modelo = modelo;
	        this.año = año;
	        this.precio = precio;
	    }
	 
	    //Métodos de la clase
	    public void encender() {
	        System.out.println("El auto está encendiendo.");
	    }
	 
	    public void apagar() {
	        System.out.println("El auto está apagando.");
	    }
	 
	    public void acelerar() {
	        System.out.println("El auto está acelerando.");
	    }
	 
	    public void frenar() {
	        System.out.println("El auto está frenando.");
	    }
	 
	    public void imprimirDetalles() {
	        System.out.println("Marca: " + marca);
	        System.out.println("Modelo: " + modelo);
	        System.out.println("Año: " + año);
	        System.out.println("Precio: " + precio);
	    }
	}
