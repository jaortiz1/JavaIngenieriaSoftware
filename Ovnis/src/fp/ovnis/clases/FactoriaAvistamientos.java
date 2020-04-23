package fp.ovnis.clases;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import fp.ovnis.utiles.Ficheros;

public class FactoriaAvistamientos {
	/*
	 * public Avistamiento(String lugar, Integer duracion, Forma forma, Coordenadas ubicacion) {
		this(LocalDate.now(), lugar, ubicacion, duracion, forma);
	}
	 */
	public static List<Avistamiento> leeAvistamientos(String ruta){
		List<String> lineas = Ficheros.leeLineas(ruta, true);
		List<Avistamiento> result = new ArrayList<Avistamiento>();
		for(String s:lineas) {
			result.add(new Avistamiento(s));
		}
		
		return result;
	}
}
