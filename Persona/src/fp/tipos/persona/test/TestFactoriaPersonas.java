package fp.tipos.persona.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.SortedSet;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import fp.tipos.persona.FactoriaPersonas;
import fp.tipos.persona.Persona;
import fp.tipos.persona.funcionales.ComparadorPersonaPorEdad;

public class TestFactoriaPersonas {

	public static void main(String[] args) {
		Persona p1 = FactoriaPersonas.create("1234x, jorge, gutierrez, garcia, 12/12/2012");
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
		//System.out.println(personas.stream().map(x->x.getDni()).collect(Collectors.toList()));
		//System.out.println("mapToNombre");
		//System.out.println(mapToNombre(personas));
		//imita el orden del compareTo
		Comparator<Persona> comp1 = Comparator.naturalOrder();
		//aqui no vale x->x.getEdad() ya que no sabe el tipo, puede fallar, getFecha sin ()
		Comparator<Persona> comp2 = Comparator.comparing(Persona::getFechaNacimiento)
				.thenComparing(Comparator.naturalOrder());
		
		/*System.out.println(personas.stream().distinct().count());
		System.out.println(personas.stream()
				.filter(p->p.getNombre().toLowerCase().equals("jorge"))
				.collect(Collectors.toList()));*/
		//nos devuelve optional si no hay elemento con findany, con or else: si no esta te devuelvo
		//algo distinto de persona
		/*System.out.println(personas.stream()
				.filter(p->p.getNombre().toLowerCase().equals("ejemploNoExiste"))
				.findAny().orElse(null));*/
		boolean result = personas.stream().allMatch(p->p.getFechaNacimiento().getYear()>1981);
		/*System.out.println("¿Toda la lista de personas es mayor de 1981? ");
		System.out.println(result);
		System.out.println("Elementos sin repetir "+personas.stream().distinct());*/
		//te da el primero que encuentre
		/*System.out.println(personas.stream().filter(p->p.getNombre().toLowerCase().equals("jorge"))
				.findFirst().orElse(null));
		System.out.println(personas);*/
		Predicate<Persona> predicate = p -> p.getNombre().equals("jorge");
		//le decimos los que no son jorge
		/*System.out.println(personas.stream()
				.filter(predicate.negate())
				.collect(Collectors.toList()));*/
		
		//FOR EACH, hay que pasarle algo que devuelva void, solo modificaciones
		//implementamos un consumer para mostrarlos por pantalla
		personas.stream()
		.filter(predicate.negate())
		.forEach(p->System.out.println(p));
		personas.stream().forEach(p->p.setApellido2("sin apellidos"));
		
		//System.out.println(personas);
		//uso del map
		//stream<t> -> stream<r> paso de un objeto a otro
		//con el map no modifico el objeto original solo los muestro
		/*personas.stream()
		.map(p->new Persona(p.getDni(),"sin nombre",p.getApellido1(),p.getApellido2()
				,p.getFechaNacimiento())).forEach(p->System.out.println(p));*/
		//System.out.println("vemos que tienen nombre");
		//System.out.println(personas);
		//creamos un stream con distintos valores
		Stream<Integer> stream = Stream.of(1,2,5,3,4);
		//System.out.println(stream.collect(Collectors.toList()));
		//da error porque una vez que se trabaja con el no se puede volver a trabajar, mirar 
		//linea de arriba
		//stream.sorted().collect(Collectors.toList());
		List<Integer> lista = stream.collect(Collectors.toList());
		lista =lista.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		//System.out.println(lista);
		
		//Streams con listas
		
		List<Persona> personas2 = new ArrayList<Persona>();
		personas2.add(p1);
		personas2.add(p2);
		Stream<List<Persona>> streamList = Stream.of(personas, personas2);
		//streamList.forEach(p->System.out.println(p));
		streamList = Stream.of(personas, personas2);
		//streamList.flatMap(p->p.stream()).forEach(x->System.out.println(x));;
		Function<Persona, String> mapper = Persona::getNombre;
	
		System.out.println("----------");
		Map<String, List<Persona>> map = personas.stream().collect(Collectors.groupingBy(mapper));
		map.keySet().stream().forEach(k->System.out.println(k+"->"+map.get(k).size()));
		System.out.println(map);
		Function<Persona, String> mapper1 = Persona::getDni;
		Function<Persona,String> valuer = Persona::getNombre;
		Map<String, List<Persona>> map2 = personas.stream().collect(Collectors.groupingBy(mapper1));
		Map<String, Long> map3 = personas.stream().collect(Collectors.groupingBy(mapper, Collectors.counting()));
		System.out.println("map2");
		System.out.println(map2);
		System.out.println("map3");
		System.out.println(map3);
		Comparator<Persona> comparator = Comparator.naturalOrder();
		Map<String, Optional<Persona>> map4 = personas.stream()
				.collect(Collectors.groupingBy(mapper, Collectors.maxBy(comparator)));
		System.out.println("map4");
		System.out.println(map4);
		Map<String, Set<Persona>> map5 = personas.stream().collect(Collectors.groupingBy(mapper, Collectors.toSet()));
		System.out.println("map5");
		System.out.println(map5);
		System.out.println("map6");
		//al to colecttion se le pasa un supllier, de la nada te crea un treeset u otro objeto
		Map<String, SortedSet<Persona>> map6 = personas.stream()
				.collect(Collectors.groupingBy(mapper, Collectors.toCollection(TreeSet::new)));

	}

	private static List<String> mapToNombre(List<Persona> personas) {
		List<String> result = new ArrayList<String>();
		for(Persona p : personas) {
			result.add(p.getNombre());
		}
		return result;
	}

}
