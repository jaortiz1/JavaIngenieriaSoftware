package sevici;

import java.util.List;

public interface RedEstaciones {

	void anyadirEstaciones(Estacion e);
	List<Estacion> getEstaciones();
	Integer getNumeroEstaciones();
	
}
