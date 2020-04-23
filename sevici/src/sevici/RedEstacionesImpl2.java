package sevici;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RedEstacionesImpl2 extends RedEstacionesImpl1 {

	public RedEstacionesImpl2() {
		super();
	}
	public RedEstacionesImpl2(Stream<Estacion> stream) {
		super(stream);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	public void anyadirEstaciones(Estacion e) {
		// TODO Auto-generated method stub
		super.anyadirEstaciones(e);
	}
	@Override
	public List<Estacion> getEstaciones() {
		return super.getEstaciones();
	}
	@Override
	public Integer getNumeroEstaciones() {
		return super.getNumeroEstaciones();
	}
	
	
	@Override
	public Set<Coordenadas> getUbicacionEstaciones() {
		// TODO Auto-generated method stub
		return super.getUbicacionEstaciones();
	}
	
	
	

	
	@Override
	public Estacion getEstacionMasBicisDisponibles() {
		return getEstaciones().stream()
		.max(Comparator.comparing(Estacion::getBicisDisponibles))
		.orElse(null);
		
	}
	
	@Override
	public SortedSet<Estacion> getEstacionesCercanas(Coordenadas cs, double d) {
		Set<Estacion> result = getEstaciones()
		.stream()
		.filter(e->e.getUbicacion().getDistancia(cs)<=d)
		.collect(Collectors.toSet());
		return new TreeSet<Estacion>(result);
	}
	@Override
	public List<Estacion> getEstacionesBicisDisponibles(int k) {
		
		return getEstaciones()
				.stream()
				.filter(e->e.getBicisDisponibles()<=k)
				.collect(Collectors.toList());
	}
	
}
