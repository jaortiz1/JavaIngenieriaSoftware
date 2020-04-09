package utiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Ficheros {
	public static List<String> leeLineas(String rutaFichero, Boolean eliminaCabeceras){
		List<String> result = new ArrayList<String>();
		try {
			result.addAll(Files.readAllLines(Paths.get(rutaFichero)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(eliminaCabeceras) {
			result.remove(0);	
		}
		
		return result;
	}

}
