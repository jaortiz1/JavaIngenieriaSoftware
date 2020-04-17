package fp.nobel.clases;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface PremioInterfaz {

	void anyadirPremio(Premio p);
	Set<Premio> obtenerPremiosDeGenero(Genero g);
	long calcularNumeroPremiadosMasJovenesDe(Integer n);
	Map<String, Double> calcularMediaEdadPorCategoria();
	Map<String, List<Integer>> calcularEdadesPorCategoria(); 
	
}
