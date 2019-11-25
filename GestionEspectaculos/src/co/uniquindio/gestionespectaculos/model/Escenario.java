package co.uniquindio.gestionespectaculos.model;

import java.util.ArrayList;

public class Escenario {

	private ArrayList<Seccion> secciones;
	private Evento evento;

	public Escenario(ArrayList<Seccion> secciones, Evento evento) {
		super();
		this.secciones = new ArrayList<>();
		this.evento = evento;

		secciones.add(new Seccion(TipoSeccion.CLUB_FANS));
		secciones.add(new Seccion(TipoSeccion.PLATEA_1));
		secciones.add(new Seccion(TipoSeccion.PLATEA_2));
		secciones.add(new Seccion(TipoSeccion.SEGUNDO_PISO_1));
		secciones.add(new Seccion(TipoSeccion.SEGUNDO_PISO_2));

	}

	public ArrayList<Seccion> getSecciones() {
		return secciones;
	}

	public void setSecciones(ArrayList<Seccion> secciones) {
		this.secciones = secciones;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

}
