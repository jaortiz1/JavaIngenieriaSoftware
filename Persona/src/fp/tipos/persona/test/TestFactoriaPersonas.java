package fp.tipos.persona.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import fp.tipos.persona.FactoriaPersonas;
import fp.tipos.persona.Persona;
import fp.tipos.persona.funcionales.ComparadorPersonaPorEdad;

public class TestFactoriaPersonas {

	public static void main(String[] args) {
		Persona p1 = FactoriaPersonas.create("1234x, garcia, gutierrez, jorge, 12/12/2012");
		Persona p2 = FactoriaPersonas.create("1234a, lel, lel, lel, 10/10/2010");
		List<Persona> personas = new ArrayList<Persona>();
		personas.add(p1);
		personas.add(p2);
		//Ordena por defecto con el orden natural de persona, osea compareTo
		Persona max = Collections.max(personas);
		//usa el comparador para ordenar por la edad
		Comparator<Persona> cmp = new ComparadorPersonaPorEdad();
		Persona maxComparator = Collections.max(personas, cmp);

		//SE USA FUNCIONES LAMBDAS PARA NO TENER MUCHAS CLASES COMPARATOR
		//Comparator<Persona> cmpConLambda = Comparator.comparing();
		System.out.println(personas.stream().map(x->x.getDni()).collect(Collectors.toList()));
		System.out.println(mapToNombre(personas));
		//imita el orden del compareTo
		Comparator<Persona> comp1 = Comparator.naturalOrder();
		//aqui no vale x->x.getEdad() ya que no sabe el tipo, puede fallar, getFecha sin ()
		Comparator<Persona> comp2 = Comparator.comparing(Persona::getFechaNacimiento)
				.thenComparing(Comparator.naturalOrder());

	}

	private static List<String> mapToNombre(List<Persona> personas) {
		List<String> result = new ArrayList<String>();
		for(Persona p : personas) {
			result.add(p.getNombre());
		}
		return result;
	}

}
