package fp.trenes.Test;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import fp.trenes.TipoTren;
import fp.trenes.TrayectoTren;
public class TestTrayecto {
	public static void CheckTrayectoTren() {
		List<String> estaciones = new ArrayList<String>();
		estaciones.add("Córdoba");
		estaciones.add("VILLANUEVA DE CÓRDOBA-LOS PEDROCHES");
		estaciones.add("PUERTOLLANO");
		estaciones.add("CIUDAD REAL");
		estaciones.add("PUERTA DE ATOCHA");
		List<LocalTime> horasLlegadas = new ArrayList<LocalTime>();
		horasLlegadas.add(LocalTime.of(7, 45));
		horasLlegadas.add(LocalTime.of(8, 13));
		horasLlegadas.add(LocalTime.of(8, 40));
		horasLlegadas.add(LocalTime.of(8, 57));
		horasLlegadas.add(LocalTime.of(10, 02));
		List<LocalTime> horasSalidas = new ArrayList<LocalTime>();
		horasSalidas.add(LocalTime.of(7, 50));
		horasSalidas.add(LocalTime.of(8, 14));
		horasSalidas.add(LocalTime.of(8, 41));
		horasSalidas.add(LocalTime.of(8, 58));
		String codigo = "02471";
		String nombre = "Sevilla-Madrid";
		TrayectoTren trayecto1 = new TrayectoTren(codigo, nombre, estaciones, TipoTren.INTERCITY,
				LocalTime.of(8, 58),LocalTime.of(7, 45), horasLlegadas, horasSalidas );
		System.out.println(trayecto1);
		
		
	}
	
}
