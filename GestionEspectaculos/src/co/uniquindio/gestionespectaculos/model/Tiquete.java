package co.uniquindio.gestionespectaculos.model;

public class Tiquete {
	
	private Cliente miCliente;
	private Seccion seccion;
	private char fila;
	private int asiento;
	private double precio;
	
	public Tiquete(Cliente miCliente, Seccion seccion, char fila, int asiento, double precio) {
		super();
		this.miCliente = miCliente;
		this.seccion = seccion;
		this.fila = fila;
		this.asiento = asiento;
		this.precio = precio;
	}

	public Cliente getMiCliente() {
		return miCliente;
	}

	public void setMiCliente(Cliente miCliente) {
		this.miCliente = miCliente;
	}

	public Seccion getSeccion() {
		return seccion;
	}

	public void setSeccion(Seccion seccion) {
		this.seccion = seccion;
	}

	public char getFila() {
		return fila;
	}

	public void setFila(char fila) {
		this.fila = fila;
	}

	public int getAsiento() {
		return asiento;
	}

	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
