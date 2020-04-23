package fp.ovnis.test;

import java.util.List;

import fp.ovnis.utiles.Ficheros;

public class TestLecturaFicheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean tieneCabeceras = true;
		List<String> lineas = Ficheros.leeLineas("data/ovnis.csv", tieneCabeceras);
		//muestraLineas(lineas);
	}
	public static void muestraLineas(List<String> lineas) {
		for(String linea : lineas) {
			System.out.println(linea);
		}
	}

}
