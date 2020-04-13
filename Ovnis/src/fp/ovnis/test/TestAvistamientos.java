package fp.ovnis.test;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

import fp.ovnis.clases.Avistamiento;
import fp.ovnis.clases.AvistamientoImpl1;
import fp.ovnis.clases.Avistamientos;
import fp.ovnis.clases.FactoriaAvistamientos;
import fp.ovnis.utiles.Utiles;

public class TestAvistamientos {

	public static void main(String[] args) {
		List<Avistamiento> avistamientos = FactoriaAvistamientos
				.leeAvistamientos("data/ovnis.csv");
		

	}

}
