package co.uniquindio.gestionespectaculos.model;

import java.util.ArrayList;

public class Reserva {

	private Cliente cliente;
	private ArrayList<Tiquete> tiquete;
	private int valorReserva;
	private String id;

	public Reserva(Cliente cliente, ArrayList<Tiquete> tiquete, int valorReserva, String id) {
		super();
		this.cliente = cliente;
		this.tiquete = tiquete;
		this.valorReserva = valorReserva;
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Tiquete> getTiquete() {
		return tiquete;
	}

	public void setTiquete(ArrayList<Tiquete> tiquete) {
		this.tiquete = tiquete;
	}

	public int getValorReserva() {
		return valorReserva;
	}

	public void setValorReserva(int valorReserva) {
		this.valorReserva = valorReserva;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
