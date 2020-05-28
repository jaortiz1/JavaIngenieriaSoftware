package fp.ovnis.test;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

import fp.ovnis.clases.Avistamiento;
import fp.ovnis.clases.AvistamientoImpl1;
import fp.ovnis.clases.AvistamientoImpl2;
import fp.ovnis.clases.Avistamientos;
import fp.ovnis.clases.FactoriaAvistamientos;

public class TestAvistamientos {

	public static void main(String[] args) {
		List<Avistamiento> avistamientos = FactoriaAvistamientos
				.leeAvistamientos("data/ovnis.csv");
		System.out.println(avistamientos);
		//AvistamientoImpl1 av = new AvistamientoImpl1(avistamientos);
		//System.out.println(av.getAvistamientosPorFecha());;
		//Set<Avistamiento> ordenado = new TreeSet<Avistamiento>(new Comparador());
		//Lo creamos generico como interfaz
		Avistamientos av = new AvistamientoImpl1(avistamientos.stream());
		System.out.println(av.existeAvistamientoLugarAnyo("noexiste", LocalDate.now().getYear()));
		Avistamiento av1 = avistamientos.get(0);
		Avistamiento av2 = avistamientos.get(1);
		Stream<Avistamiento> s1 = Stream.of(av1,av2);
		Avistamientos avs2  = new AvistamientoImpl2(s1);
		System.out.println(avs2.getTestigosAvistamientos());
	}

}
