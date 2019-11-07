package co.uniquindio.gestionespectaculo.vista;

import javax.swing.JOptionPane;

import co.uniquindio.gestionespectaculo.Principal;
import co.uniquindio.gestionespectaculos.model.Usuario;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ControladorUsuarioPpal {
	
	private Principal ventanaPrincipal;
	@FXML
	private TextField txtid;
	@FXML
	private PasswordField password;
	
	@FXML
	public void mostrarVentanaPrincipal () {
		ventanaPrincipal.mostrarVistaPrincipal();
	}
	
	@FXML
	public void mostrarVentanaCrearNuevoAdmin () {
		ventanaPrincipal.mostrarVistaCrearNuevoAdmin();
	}
	
	//OPCIONES ADMIN COMPLETAR
	@FXML
	public void mostrarOpcionesAdmin () {
		for (Usuario admin : ventanaPrincipal.getMiEvento().getMisUsuarios()) {
			if (admin.getId().equals(txtid.getText())) {
				if (admin.getContraseña().equals(password.getText())) {
					JOptionPane.showMessageDialog(null, "ERES UN ADMIN!");
				}
			}
		}
	}
	
	public Principal getVentanaPrincipal() {
		return ventanaPrincipal;
	}

	public void setVentanaPrincipal(Principal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
	}

	public TextField getTxtid() {
		return txtid;
	}

	public void setTxtid(TextField txtid) {
		this.txtid = txtid;
	}

	public PasswordField getPassword() {
		return password;
	}

	public void setPassword(PasswordField password) {
		this.password = password;
	}
}
