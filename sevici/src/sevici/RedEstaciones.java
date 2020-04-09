package sevici;

import java.util.List;

public interface RedEstaciones {

	void anyadirEstaciones(Estacion e);
	List<Estacion> getEstaciones();
	Integer getNumeroEstaciones();
	/**
	 * • List<Estacion> getEstacionesBicisDisponibles(): obtiene una lista con las estaciones que
tienen alguna bicicleta disponible.
• List<Estacion> getEstacionesBicisDisponibles(int k): obtiene una lista con las estaciones
que tienen un número mínimo de bicicletas disponibles.
• SortedSet<Estacion> getEstacionesCercanas(Coordenadas cs, double d): obtiene un
conjunto ordenado con las estaciones que tienen alguna bicicleta disponible y que
están cerca de una ubicación dada.
• Set<Coordenadas> getUbicacionEstaciones(): obtiene un conjunto con la ubicación de
todas las estaciones.
• Set<Coordenadas> getUbicacionEstacionesDisponibles(int k): obtiene un conjunto con
la ubicación de las estaciones que tienen un número mínimo de bicicletas disponibles.
• Estacion getEstacionMasBicisDisponibles(): obtiene la estación que tiene más bicicletas
disponibles.
	 */
}
