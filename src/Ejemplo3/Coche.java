package Ejemplo3;

public class Coche {

    public static void main(String[] args) {	
    	
        Auto miAuto = new Auto("Nissan", "350Z", 2001, 30000);
 
        miAuto.encender();
        miAuto.acelerar();
        miAuto.frenar();
        miAuto.apagar();
        miAuto.imprimirDetalles();
    }
}
