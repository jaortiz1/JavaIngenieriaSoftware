package fp.ovnis.clases;

import java.time.LocalDate;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//con extends heredo todos los metodos para solo modificar los que me interesan
public class AvistamientoImpl2 extends AvistamientoImpl1 implements Avistamientos{

	public AvistamientoImpl2() {
		super();
	}
	public AvistamientoImpl2(Stream<Avistamiento> stream) {
		super(stream);
	}
	//0. analizar fuente datos para extraer informacion
	//1. analizar que esquema soluciona el problema.
	//2. llevar esos esquemas a métodos de stream
	//3 completar con objetos de interfaces funcionales mediante expresiones lambdas
	public Integer getNumeroAvistamientosFecha(LocalDate fecha) {
		Long result = 0l;
		result = getAvistamientos()
				.stream()
				.filter(a->a.getFecha().equals(fecha))
				.count();
		return result.intValue();
	}
	public Set<Persona> getTestigosAvistamientos(){
		//tengo un listado de avistamientos y cada avistamiento una lista de personas
		
		return getAvistamientos().stream().flatMap(av->av.getTestigos().stream()).collect(Collectors.toSet());
	}
	

	
}
