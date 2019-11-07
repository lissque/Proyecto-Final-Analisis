package co.uniquindio.gestionespectaculo.vista;

import co.uniquindio.gestionespectaculo.Principal;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ControladorPrincipal {
	private Principal ventanaPrincipal;
	@FXML
	private Button btnIngresar;
	@FXML
	private Button btnCliente;
	
	@FXML
	private void crearVentanaAdmin () {
		ventanaPrincipal.mostrarVistaAdmin();
	}
	
	@FXML
	private void crearVentanaCliente () {
		ventanaPrincipal.mostrarVistaCliente();
	}

	public Principal getVentanaPrincipal() {
		return ventanaPrincipal;
	}

	public void setVentanaPrincipal(Principal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
	}

	public Button getBtnIngresar() {
		return btnIngresar;
	}

	public void setBtnIngresar(Button btnUsuario) {
		this.btnIngresar = btnUsuario;
	}

	public Button getBtnCliente() {
		return btnCliente;
	}

	public void setBtnCliente(Button btnCliente) {
		this.btnCliente = btnCliente;
	}
}
