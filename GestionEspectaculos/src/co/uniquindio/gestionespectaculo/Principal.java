package co.uniquindio.gestionespectaculo;

import java.io.IOException;

import co.uniquindio.gestionespectaculo.vista.ControladorAdminNuevo;
import co.uniquindio.gestionespectaculo.vista.ControladorCliente;
import co.uniquindio.gestionespectaculo.vista.ControladorPrincipal;
import co.uniquindio.gestionespectaculo.vista.ControladorUsuarioPpal;
import co.uniquindio.gestionespectaculos.model.Evento;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Principal extends Application {
	private Stage escenarioPrincipal;
	private Evento miEvento;

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage)
	{
		miEvento = new Evento();
		this.escenarioPrincipal = primaryStage;
		this.escenarioPrincipal.setTitle("Gestion de Evento");
		mostrarVistaPrincipal();
	}
	
	public void mostrarVistaCrearNuevoAdmin () {
		try
		{
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Principal.class.getResource("vista/VistaNuevoAdmin.fxml"));
			BorderPane vistaNuevoAdmin = (BorderPane) loader.load();
			Scene scene = new Scene(vistaNuevoAdmin);
			ControladorAdminNuevo miControlador = loader.getController();
			miControlador.setVentanaPrincipal(this);
			escenarioPrincipal.setScene(scene);
			escenarioPrincipal.show();
		}
		catch (IOException e)
		{
			System.err.println(e.getMessage());
		}
	}
	
	public void mostrarVistaPrincipal () {
		try
		{
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Principal.class.getResource("vista/VistaPrincipal.fxml"));
			GridPane vistaPrincipal = (GridPane) loader.load();
			Scene scene = new Scene(vistaPrincipal);
			
			ControladorPrincipal miControlador = loader.getController();
			miControlador.setVentanaPrincipal(this);
			escenarioPrincipal.setScene(scene);
			escenarioPrincipal.show();
		}
		catch (IOException e)
		{
			System.err.println(e.getMessage());
		}
	}
	
	public void mostrarVistaAdmin () {
		try
		{
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Principal.class.getResource("vista/VistaAdmin.fxml"));
			BorderPane vistaAdmin = (BorderPane) loader.load();
			Scene scene = new Scene(vistaAdmin);
			ControladorUsuarioPpal miControlador = loader.getController();
			miControlador.setVentanaPrincipal(this);
			escenarioPrincipal.setScene(scene);
			escenarioPrincipal.show();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	//HOA
	public void mostrarVistaCliente () {
		try
		{
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Principal.class.getResource("vista/VistaCliente.fxml"));
			BorderPane vistaCliente = (BorderPane) loader.load();
			Scene scene = new Scene(vistaCliente);
			ControladorCliente miControlador = loader.load();
			miControlador.setVentanaPrincipal(this);
			escenarioPrincipal.setScene(scene);
			escenarioPrincipal.show();
		}
		catch (IOException e)
		{
			System.err.println(e.getMessage());
		}
	}
	
	public Stage getEscenarioPrincipal() {
		return escenarioPrincipal;
	}
	public void setEscenarioPrincipal(Stage escenarioPrincipal) {
		this.escenarioPrincipal = escenarioPrincipal;
	}
	public Evento getMiEvento() {
		return miEvento;
	}
	public void setMiEvento(Evento miEvento) {
		this.miEvento = miEvento;
	}
}
