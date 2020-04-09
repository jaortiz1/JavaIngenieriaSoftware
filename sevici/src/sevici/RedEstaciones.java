package sevici;

import java.util.List;

public interface RedEstaciones {

	void anyadirEstaciones(Estacion e);
	List<Estacion> getEstaciones();
	Integer getNumeroEstaciones();
	/**
	 * � List<Estacion> getEstacionesBicisDisponibles(): obtiene una lista con las estaciones que
tienen alguna bicicleta disponible.
� List<Estacion> getEstacionesBicisDisponibles(int k): obtiene una lista con las estaciones
que tienen un n�mero m�nimo de bicicletas disponibles.
� SortedSet<Estacion> getEstacionesCercanas(Coordenadas cs, double d): obtiene un
conjunto ordenado con las estaciones que tienen alguna bicicleta disponible y que
est�n cerca de una ubicaci�n dada.
� Set<Coordenadas> getUbicacionEstaciones(): obtiene un conjunto con la ubicaci�n de
todas las estaciones.
� Set<Coordenadas> getUbicacionEstacionesDisponibles(int k): obtiene un conjunto con
la ubicaci�n de las estaciones que tienen un n�mero m�nimo de bicicletas disponibles.
� Estacion getEstacionMasBicisDisponibles(): obtiene la estaci�n que tiene m�s bicicletas
disponibles.
	 */
}
