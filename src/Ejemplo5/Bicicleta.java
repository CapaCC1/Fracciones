package Ejemplo5;

public class Bicicleta {

	String modelo, color;
	int marchas, numeroDePlatos, numeroDePiniones, pinionActual, platoActual, velocidadActual;
	
	Bicicleta(String modelo, String color, int marchas, int numeroDePlatos,int numeroDePiniones){
		this.modelo = modelo;
		this.color = color;
		this.marchas = marchas;
		this.numeroDePlatos = numeroDePlatos;
		this.numeroDePiniones = numeroDePiniones;
		this.platoActual = 1;
        this.pinionActual = 1;
        this.velocidadActual = 0;
	}
	
	
	 public String subirMarchaPlato() {
		 String resultado = "";
	        if (platoActual < numeroDePlatos) {
	            platoActual++;
	        }else {
	        	resultado = "YA ESTAS EN LA MARCHA MAXIMA";
	        }
	        return resultado;
	    }

	    public String bajarMarchaPlato() {
	    	String resultado = "";
	        if (platoActual > 1) {
	            platoActual--;
	        }else {
	        	resultado = "YA ESTAS EN LA MARCHA MINIMA";
	        }
	        return resultado;
	    }

	    public int getMarchaActualPlato() {
	        return platoActual;
	    }
	    
	    public String subirMarchaPinion() {
	    	String resultado = "";
	        if (pinionActual < numeroDePiniones) {
	            pinionActual++;
	        }else {
	        	resultado = "YA ESTAS EN LA MARCHA MAXIMA";
	        }
	        return resultado;
	    }

	    public String bajarMarchaPinion() {
	    	String resultado = "";
	        if (pinionActual > 1) {
	            pinionActual--;
	        }else {
	        	resultado = "YA ESTAS EN LA MARCHA MINIMA";
	        }
	        return resultado;
	    }

	    public int getMarchaActualPinion() {
	        return pinionActual;
	    }
	    public int getVelocidadActual() {
	    	return velocidadActual;
	    }
	    
	    public String subirVelocidad() {
	    	String resultado = "";
	    	if (velocidadActual < 100) {
	    	velocidadActual += 5;
	    	}else {

	    		resultado = "VAS MUU RAPIDO";
	    	}
	    	return resultado;
	    }
	    public String bajarVelocidad() {
	    	String resultado = "";
	    	if(velocidadActual != 0) {
	    		velocidadActual -= 5;
	    		
	    	}else {
	    		resultado = "ESTAS PARAO!!";
	    	}
	    	return resultado;
	    }
	    
	    public String toString() {
	    	  return "Numero de Platos " + numeroDePlatos + "\n" + "Numero de Piniones: " + numeroDePiniones + "\n" + "Plato actual: " + platoActual + "\n" +"Pinion actual: " + pinionActual + "\n" + "Velocidad actual: " + velocidadActual + "KMH";
	    	}
	    
	
}
