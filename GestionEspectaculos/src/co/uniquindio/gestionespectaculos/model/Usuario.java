package co.uniquindio.gestionespectaculos.model;

public class Usuario {
	
	private String id;
	private String contraseña;
	
	public Usuario(String id, String contraseña) {
		super();
		this.id = id;
		this.contraseña = contraseña;
	}
	
	public Usuario () {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	
}
