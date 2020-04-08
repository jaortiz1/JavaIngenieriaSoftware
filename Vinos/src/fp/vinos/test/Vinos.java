package fp.vinos.test;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface Vinos {


//	· Vinos::calcularUvasPorPais: calcula un diccionario cuyas claves son los paises y los valores
//	el conjunto de uvas usadas en los vinos de cada país
//	· Vinos::calcularCalidadPrecioPorRegionMayorDe: calcula un diccionario cuyas claves son
//	las regiones y los valores son el número de vinos cuya relación calidad/precio supera un
//	umbral dado
	void addWine(Vino v);
	Integer calcularNumeroVinosPais(String string);
	Vino obtenerVinoMejorPuntuado(Set<Vino> vinos);
	Set<String> calcularUvasPorRegion(String region);
	Map<String, List<Vinos>> obtenerVinosRangoPuntos(Integer r1, Integer r2);
	Map<String, Set<String>> calcularUvasPorPais();
	Map<String, Long>calcularCalidadPrecioPorRegionMayorDe(Double calidadPrecio);
	Map<String,List<Vino>> calcularVinosPorPais();
	Vino obtenerVinoMejorPuntuado();
	Integer calcularNumeroVinoPais(String pais);
	Set<Vino> getVinos();
}
