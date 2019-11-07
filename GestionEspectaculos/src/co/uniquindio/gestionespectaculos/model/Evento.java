package co.uniquindio.gestionespectaculos.model;

import java.util.ArrayList;

public class Evento {
	
	private ArrayList<Cliente> misClientes;
	private ArrayList<Registro> misRegistros;
	private ArrayList<Usuario> misUsuarios;
	
	public Evento() {
		misClientes =  new ArrayList<Cliente>();
		misRegistros = new ArrayList<Registro>();
		misUsuarios = new ArrayList<Usuario>();
	}
	
	public void agregarCliente (Cliente miC) {
		misClientes.add(miC);
	}
	
	public void agregarRegistro (Registro miR) {
		misRegistros.add(miR);
	}
	
	public void agregarUsuario (Usuario miU) {
		misUsuarios.add(miU);
	}

	public ArrayList<Cliente> getMisClientes() {
		return misClientes;
	}

	public void setMisClientes(ArrayList<Cliente> misClientes) {
		this.misClientes = misClientes;
	}

	public ArrayList<Registro> getMisRegistros() {
		return misRegistros;
	}

	public void setMisRegistros(ArrayList<Registro> misRegistros) {
		this.misRegistros = misRegistros;
	}

	public ArrayList<Usuario> getMisUsuarios() {
		return misUsuarios;
	}

	public void setMisUsuarios(ArrayList<Usuario> misUsuarios) {
		this.misUsuarios = misUsuarios;
	}
	
}
