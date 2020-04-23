package fp.ovnis.utiles;

import java.util.Collection;

public class Utiles {
	//metodo generico para cualquier coleccion
	public static <T> void muestraObjetos(Collection<T> objetosGenericos) {
		for(T linea : objetosGenericos) {
			System.out.println(linea);
		}
	}
}
