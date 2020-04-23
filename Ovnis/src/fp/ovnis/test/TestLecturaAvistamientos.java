package fp.ovnis.test;

import java.util.List;

import fp.ovnis.clases.Avistamiento;
import fp.ovnis.clases.FactoriaAvistamientos;
import fp.ovnis.utiles.Utiles;

public class TestLecturaAvistamientos {

	public static void main(String[] args) {
		List<Avistamiento> avistamientos = FactoriaAvistamientos.leeAvistamientos("data/ovnis.csv");
		Utiles.muestraObjetos(avistamientos);
	}
	

}
