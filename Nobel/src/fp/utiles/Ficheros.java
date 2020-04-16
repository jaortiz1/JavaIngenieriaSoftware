package fp.utiles;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Ficheros {
	//Objeto que sirve para codificar en utf-8
	private static Charset ENCODING = StandardCharsets.UTF_8;
			//método que lee y devuelve las lineas del fichero codificadas en el formato que queramos
	public static List<String> leeFicheros(String ruta, boolean tieneCabeceras){
		List<String> res = new ArrayList<String>();
		Path path = Paths.get(ruta);
		try {
			//res = Files.readAllLines(path, ENCODING);
			//o también
			res.addAll(Files.readAllLines(path, ENCODING));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (tieneCabeceras) {
			res.remove(0);
		}
		return res;
	}

}
