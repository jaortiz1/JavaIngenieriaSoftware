package fp.nobel.clases;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import fp.utiles.Checkers;
import fp.utiles.Ficheros;

public class FactoriaNobel {
	
	//clase que lee premios y los parsea convirtiendolos en un objeto premios bucle
	public static Premio parsearPremio(String linea) {
		String [] splits = linea.split(",");
		Checkers.check("Linea con tamaño erróneo", splits.length==6);
		//el parse int no funciona con espacios
		Integer year = Integer.valueOf(splits[0].trim());
		String category = splits[1].trim();
		String name = splits[2].trim();
		String surname = splits[3].trim();
		Genero gender = Genero.valueOf(splits[4].trim().toUpperCase());
		Integer birthDate = Integer.valueOf(splits[5].trim());
		return new Premio(year, category, name, surname, gender, birthDate);
	}
	public static PremiosBucle leerPremios(String ruta) {
		Set<Premio> result = new HashSet<Premio>();
		List<String> lineas = Ficheros.leeFicheros(ruta, true);
		for(String linea : lineas) {
			result.add(parsearPremio(linea));
		}
		return new PremiosBucle(result);
	}
}
