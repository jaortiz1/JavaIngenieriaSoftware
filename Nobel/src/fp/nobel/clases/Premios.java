package fp.nobel.clases;

import java.util.Map;
import java.util.Set;

public interface Premios {

	void anyadirPremio(Premio p);
	Set<Premio> obtenerPremiosDeGenero(Genero g);
	Integer calcularNumeroPremiadosMasJovenes(Integer n);
	Map<String, Double> calcularMediaEdadPorCategoria(); 
	
}
