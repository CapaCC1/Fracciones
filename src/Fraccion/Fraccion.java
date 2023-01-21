package Fraccion;

public class Fraccion {
	
	private int numerador, denominador;
	
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
    
	@Override
	
	public String toString() {
		return numerador  + "/" + denominador;
	}
}
