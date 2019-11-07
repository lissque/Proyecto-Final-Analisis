package co.uniquindio.gestionespectaculo.vista;

import co.uniquindio.gestionespectaculo.Principal;
import co.uniquindio.gestionespectaculos.model.Cliente;
import co.uniquindio.gestionespectaculos.model.Date;
import co.uniquindio.gestionespectaculos.model.EstadoCivil;
import co.uniquindio.gestionespectaculos.model.Genero;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class ControladorCliente {
	private Principal ventanaPrincipal;
	@FXML
	private TextField txtId, txtNombre, txtApellido, txtDirecion, txtEmail, txtEstrato, txtTarjeta;
	@FXML
	private DatePicker fechaNacimiento;
	@FXML
	private ComboBox<EstadoCivil> estadoCivil;
	@FXML
	private ComboBox<Genero> genero;
	
	@FXML
	public void agregarCliente () {
		Cliente miCliente = new Cliente();
		miCliente.setId(txtId.getText());
		miCliente.setNombre(txtNombre.getText());
		miCliente.setApellido(txtApellido.getText());
		miCliente.setDireccion(txtDirecion.getText());
		miCliente.setEmail(txtEmail.getText());
		miCliente.setEstrato(Integer.parseInt(txtEstrato.getText()));
		miCliente.setEstadoCivil(estadoCivil.getSelectionModel().getSelectedItem());
		miCliente.setGenero(genero.getSelectionModel().getSelectedItem());
		Date fecha = new Date();
		fecha.setAño(fechaNacimiento.getValue().getYear());
		fecha.setMes(fechaNacimiento.getValue().getMonthValue());
		fecha.setDia(fechaNacimiento.getValue().getDayOfMonth());
		miCliente.setFechaNacimiento(fecha);
		ventanaPrincipal.getMiEvento().agregarCliente(miCliente);		
	}

	public Principal getVentanaPrincipal() {
		return ventanaPrincipal;
	}

	public void setVentanaPrincipal(Principal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
	}
}
