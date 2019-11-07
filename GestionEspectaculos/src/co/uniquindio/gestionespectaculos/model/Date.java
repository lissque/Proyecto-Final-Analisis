package co.uniquindio.gestionespectaculos.model;

public class Date {
	private int año, mes, dia;
	
	public Date () {}
	
	public Date(int año, int mes, int dia) {
		super();
		this.año = año;
		this.mes = mes;
		this.dia = dia;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}
	
}
