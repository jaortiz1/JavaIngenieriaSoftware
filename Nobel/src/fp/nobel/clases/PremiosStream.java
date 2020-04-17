package fp.nobel.clases;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PremiosStream implements PremioInterfaz {
	Set<Premio> premios;

	public PremiosStream() {
		super();
		this.premios = new HashSet<Premio>();
	}

	public PremiosStream(Set<Premio> premios) {
		super();
		this.premios = premios;
	}

	public Set<Premio> getPremios() {
		return premios;
	}

	public void setPremios(Set<Premio> premios) {
		this.premios = premios;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((premios == null) ? 0 : premios.hashCode());
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
		PremiosStream other = (PremiosStream) obj;
		if (premios == null) {
			if (other.premios != null)
				return false;
		} else if (!premios.equals(other.premios))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PremiosStream [premios=" + premios + "]";
	}

	/*
	 * Crear la clase PremiosStream que implemente la interfaz Premios, con los
	 * siguientes atributos y métodos. En esta clase, aquellos métodos que requieran
	 * tratamientos secuenciales se implementarán con streams. • premios: atributo
	 * con un conjunto de objetos Premio • Premios: constructor vacío de la clase
	 * Premios • Premios: constructor de la clase Premios a partir de un stream de
	 * Premio • Premios::toString: mostrando todos los atributos • Premios::equals:
	 * usando el atributo premios para determinar la igualdad • Premios::hashCode:
	 * usando la misma selección de atributos que el método equals • Todos los
	 * métodos de la interfaz Premios
	 * 
	 */
	@Override
	public void anyadirPremio(Premio p) {
		// TODO Auto-generated method stub

	}

	@Override
	public Set<Premio> obtenerPremiosDeGenero(Genero g) {
		// TODO Auto-generated method stub
		return null;
	}


	

	



	@Override
	public Map<String, Double> calcularMediaEdadPorCategoria() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, List<Integer>> calcularEdadesPorCategoria() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long calcularNumeroPremiadosMasJovenesDe(Integer n) {
		// TODO Auto-generated method stub
		return 0;
	}

}
