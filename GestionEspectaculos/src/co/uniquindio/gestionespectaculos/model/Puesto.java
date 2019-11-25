package co.uniquindio.gestionespectaculos.model;

public class Puesto {

	private EstadoPuesto estadoPuesto;
	private char letra;
	private int numero;
	private Seccion seccion;

	public Puesto(EstadoPuesto estadoPuesto, char letra, int numero, Seccion seccion) {
		super();
		this.estadoPuesto = estadoPuesto;
		this.letra = letra;
		this.numero = numero;
		this.seccion = seccion;
	}

	public EstadoPuesto getEstadoPuesto() {
		return estadoPuesto;
	}

	public void setEstadoPuesto(EstadoPuesto estadoPuesto) {
		this.estadoPuesto = estadoPuesto;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Seccion getSeccion() {
		return seccion;
	}

	public void setSeccion(Seccion seccion) {
		this.seccion = seccion;
	}

}
