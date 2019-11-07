package co.uniquindio.gestionespectaculo.vista;

import javax.swing.JOptionPane;

import co.uniquindio.gestionespectaculo.Principal;
import co.uniquindio.gestionespectaculos.model.Usuario;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ControladorAdminNuevo {
	private Principal ventanaPrincipal;
	@FXML
	private TextField id;
	@FXML
	private PasswordField password;
	@FXML
	private PasswordField conPassword;
	
	@FXML
	public void crearNuevoAdmin () {
		Usuario nuevo = new Usuario();
		nuevo.setId(id.getText());
		if (password.getText().equals(conPassword.getText())) {
			nuevo.setContraseña(password.getText());
		}
		ventanaPrincipal.getMiEvento().agregarUsuario(nuevo);
		JOptionPane.showMessageDialog(null, "Admin agregado", "Informacion", JOptionPane.INFORMATION_MESSAGE);
	}
	
	@FXML
	public void mostrarVentanaUsuario () {
		ventanaPrincipal.mostrarVistaAdmin();
	}

	public Principal getVentanaPrincipal() {
		return ventanaPrincipal;
	}

	public void setVentanaPrincipal(Principal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
	}
}
