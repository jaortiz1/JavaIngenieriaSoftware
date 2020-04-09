package sevici;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class RedEstacionesImpl1 implements RedEstaciones{

	List<Estacion> estaciones;

	
	public RedEstacionesImpl1() {
		super();
	}

	public RedEstacionesImpl1(List<Estacion> estaciones) {
		super();
		this.estaciones = estaciones;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estaciones == null) ? 0 : estaciones.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RedEstacionesImpl1 other = (RedEstacionesImpl1) obj;
		if (estaciones == null) {
			if (other.estaciones != null)
				return false;
		} else if (!estaciones.equals(other.estaciones))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RedEstacionesImpl1 [estaciones=" + estaciones + "]";
	}

	@Override
	public void anyadirEstaciones(Estacion e) {
		this.getEstaciones().add(e);
	}

	@Override
	public List<Estacion> getEstaciones() {
		return new ArrayList<Estacion>(this.estaciones);
	}

	@Override
	public Integer getNumeroEstaciones() {
		// TODO Auto-generated method stub
		return this.getEstaciones().size();
	}
	public List<Estacion> getEstacionesBicisDisponibles(int k){
		List<Estacion> result = new ArrayList<Estacion>();
		return getEstaciones().stream().filter(estacion->estacion.getBicisDisponibles()>=k).collect(Collectors.toList());
	}
	
	public SortedSet<Estacion> getEstacionesCercanas(Coordenadas cs, double d){
		SortedSet<Estacion> result = new TreeSet<Estacion>();
		for (Estacion estacion : getEstaciones()) {
			if(estacion.getUbicacion().getDistancia(cs)<=d) {
				result.add(estacion);
			}
		}
		return result;
	}
	/**
	 * Set<Coordenadas> getUbicacionEstaciones(): obtiene un conjunto con la ubicación de
todas las estaciones.
• Set<Coordenadas> getUbicacionEstacionesDisponibles(int k): obtiene un conjunto con
la ubicación de las estaciones que tienen un número mínimo de bicicletas disponibles.
• Estacion getEstacionMasBicisDisponibles(): obtiene la estación que tiene más bicicletas
disponibles.
	 */
	public Set<Coordenadas> getUbicacionEstaciones(){
		Set<Coordenadas> result = new HashSet<Coordenadas>();
		for(Estacion e: getEstacionesBicisDisponibles(1)) {
			result.add(e.getUbicacion());
		}
		return result;
	}
	public Estacion getEstacionMasBicisDisponibles() {
		Estacion estacionGanadora = null;
		for(Estacion e:getEstaciones()) {
			if(estacionGanadora == null || e.getBicisDisponibles()>estacionGanadora.getBicisDisponibles()) {
				estacionGanadora = e;
			}
		}
		return estacionGanadora;
	}

	

}
