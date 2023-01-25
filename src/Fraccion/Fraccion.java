package Fraccion;

public class Fraccion {
	
	private int numerador, denominador;
	
	Fraccion(){
		this.numerador = 1;
		this.denominador = 1;
	}
	
	Fraccion (int numerador, int denominador){
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	public Fraccion invierte() {
		return new Fraccion(denominador, numerador);
	}
	
	public Fraccion multiplica(int numero) {
		return new Fraccion(numerador * numero, denominador * 1);
	}
	
	public Fraccion multiplicar(Fraccion otraFraccion) {
		return new Fraccion (numerador * otraFraccion.getNumerador(), denominador * otraFraccion.getDenominador() );
	}
	public Fraccion simplificar() {
		int mcd = mcd(numerador, denominador);
		return new Fraccion(numerador / mcd, denominador / mcd);
		
	}
	private int mcd(int numero1, int numero2) {
        while (numero2 != 0) {
            int temp = numero2;
            numero2 = numero1 % numero2;
            numero1 = temp;
        }
        return numero1;
    }
	
	public Fraccion divide(int numero) {
		return new Fraccion(numerador, denominador * numero);
	}
	public Fraccion dividir(Fraccion otraFraccion) {
		return new Fraccion (numerador * otraFraccion.getDenominador(), denominador * otraFraccion.getNumerador());
	}
	public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }
    public boolean fraccionEquivalente(Fraccion otraFraccion) {
    	
    	return (double)numerador/denominador == (double)otraFraccion.getNumerador()/otraFraccion.getDenominador();
    }
    private int mcm(int a, int b) {
    	return a * b / mcd(a, b);
    }
    public Fraccion suma (Fraccion otraFraccion) {
    	int mcm = mcm(denominador, otraFraccion.getDenominador());	
    	return new Fraccion(numerador * (mcm/denominador) + otraFraccion.getNumerador() * (mcm/otraFraccion.getDenominador()), mcm);
    }
    public Fraccion resta (Fraccion otraFraccion) {
    	int mcm = mcm(denominador, otraFraccion.getDenominador());	
    	return new Fraccion((mcm/denominador) * numerador - (mcm/otraFraccion.getDenominador()) * otraFraccion.getNumerador(), mcm);
    }
    
    public boolean equals(Fraccion otraFraccion) {
    	Fraccion fraccion1 = (Fraccion)otraFraccion;
    	
    	return (fraccion1.getDenominador() == this.denominador && fraccion1.getNumerador() == this.numerador);
    }
    
	@Override
	
	public String toString() {
		return numerador  + "/" + denominador;
	}
}
