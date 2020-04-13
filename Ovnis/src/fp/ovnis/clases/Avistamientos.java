package fp.ovnis.clases;

import java.time.LocalDate;
import java.util.Map;
import java.util.Set;

public interface Avistamientos {
	void anyadirAvistamiento(Avistamiento av);
	Set<Avistamiento> getAvistamientos();
	Integer getNumeroAvistamientosFecha(LocalDate f);
	Set<Avistamiento> getAvistamientosCercanosUbicacion(Coordenadas c, Double d);
	Boolean existeAvistamientoLugarAnyo(String l, Integer a);
	Avistamiento getAvistamientoMayorDuracion();
	Map<LocalDate, Set<Avistamiento>> getAvistamientosPorFecha();
	Map<Integer, Long> getNumeroAvistamientosPorAno();
}
