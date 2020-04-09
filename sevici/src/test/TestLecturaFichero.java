package test;

import java.util.List;

import utiles.Ficheros;

public class TestLecturaFichero {

	public static void main(String[] args) {
		List<String> lineas = Ficheros.leeLineas("data/estaciones.csv", true);
		System.out.println(lineas);
	}

}
