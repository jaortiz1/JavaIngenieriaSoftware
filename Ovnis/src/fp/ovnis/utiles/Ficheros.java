package fp.ovnis.utiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Ficheros {
	
	public static List<String> leeLineas(String rutaFichero, boolean tieneCabecera){
		List<String> result = new ArrayList<String>();

		Path path = Paths.get(rutaFichero);
		try {
			result.addAll(Files.readAllLines(path));
			if(tieneCabecera) {
				result.remove(0);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return result;
		
	}
}

	
