package Agenda;

public class Agenda {
	
	private Contacto[] lista = new Contacto[100];

	Agenda (Contacto [] list) {
		this.lista = list;
	}

	public Contacto[] getLista() {
		return lista;
	}

	public void setLista(Contacto[] lista) {
		this.lista = lista;
	}
}