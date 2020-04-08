package fp.trenes;

import java.time.LocalTime;
import java.util.List;

public interface TrayectoTrenInterfaz {

	//checkers
	boolean horaSalidaAnteriorLlegada(LocalTime horaSalida, LocalTime horaLlegada);
	void checkPosicionEstacion(int posicion);
	void checkCodigo(String codigo);
	void checkHoraSalidaPrimeraEstacion(List<LocalTime> horasSalidas);
	void checkHoraLlegadaUltimaEstacion(List<LocalTime> horasLlegadas);
	void checkHoraSalidaComparaEstaciones(List<LocalTime> horasSalidas, List<LocalTime> horasLlegadas);
	//funcionability
	LocalTime getHoraSalida(String estacion);
	LocalTime getHoraLlegada(String estacion);
	void anadirEstacionIntermedia(int posicion, String estacion, LocalTime horaLlegada, LocalTime
			horaSalida);
	void eliminarEstacionIntermedia(String estacion);
}
