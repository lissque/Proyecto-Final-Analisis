package co.uniquindio.gestionespectaculos.model;

public class Seccion {

	private Puesto[][] matrizPuestos;
	private TipoSeccion tipoSeccion;

	public Seccion(TipoSeccion tipoSeccion) {
		matrizPuestos = new Puesto[10][10];
		inicializarMatrizPuestos();
		this.tipoSeccion = tipoSeccion;
	}

	public Puesto[][] getMatrizPuestos() {
		return matrizPuestos;
	}

	public void setMatrizPuestos(Puesto[][] matrizPuestos) {
		this.matrizPuestos = matrizPuestos;
	}

	public TipoSeccion getTipoSeccion() {
		return tipoSeccion;
	}

	public void setTipoSeccion(TipoSeccion tipoSeccion) {
		this.tipoSeccion = tipoSeccion;
	}

	public void inicializarMatrizPuestos() {

		char letra = 'A';

		for (int i = 0; i < matrizPuestos.length; i++) {
			for (int j = 0; j < matrizPuestos[0].length; j++) {

				matrizPuestos[i][j] = new Puesto(EstadoPuesto.LIBRE, letra, j, this);

			}
			letra++;
			if (letra > 'Z') {
				letra = 'A';
			}
		}
	}

}
