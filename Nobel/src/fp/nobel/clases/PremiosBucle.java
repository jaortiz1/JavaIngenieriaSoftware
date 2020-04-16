package fp.nobel.clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PremiosBucle implements PremioInterfaz {

	private Set<Premio> premios;

	public PremiosBucle() {
		super();
		this.premios = new HashSet<Premio>();
	}

	public PremiosBucle(Stream<Premio> premios) {
		this.premios = premios.collect(Collectors.toSet());

	}

	public PremiosBucle(String[] premios) {
		super();
		Integer anyo, anyoNacimiento;
		String nombre, apellidos;
		Genero genero;
		String categoria;
		String[] linea;

		for (String p : premios) {
			linea = p.split(",");
			anyo = Integer.parseInt(linea[0]);
			categoria = linea[1];
			nombre = linea[3];
			apellidos = linea[4];
			anyoNacimiento = Integer.parseInt(linea[5]);
			if (linea[2].toString().toLowerCase() == "male") {
				genero = Genero.MALE;
			} else {
				genero = Genero.FEMALE;
			}
			this.premios.add(new Premio(anyo, categoria, nombre, apellidos, genero, anyoNacimiento));
		}
	}

	public PremiosBucle(Set<Premio> premios) {
		super();
		this.premios = premios;
	}

	public Set<Premio> getPremios() {
		return new HashSet<Premio>(getPremios());
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
		boolean result = false;
		if(obj instanceof PremioInterfaz) {
			PremioInterfaz p = (PremioInterfaz) obj;
			result = premios.equals(p);
		}
		return result;
	}

	@Override
	public String toString() {
		return "PremiosBucle [premios=" + premios + "]";
	}

	
	@Override
	public void anyadirPremio(Premio p) {
		premios.add(p);
	}

	public Set<Premio> obtenerPremiosDeGenero(Genero g) {
		Set<Premio> premios = new HashSet<Premio>();
		for (Premio p : getPremios()) {
			if (p.getCategoria().equals(g)) {
				premios.add(p);
			}
		}
		return premios;
	}
	
	public Integer calcularNumeroPremiadosMasJovenes(Integer n) {
		Integer result = 0;
		Set<Premio> premiosOrdenados = new TreeSet<Premio>(getPremios());
		return result;
	}

	@Override
	public Map<String, Double> calcularMediaEdadPorCategoria(String categoria) {
		Map<String, Double> result = new HashMap<String, Double>();
		List<Integer> auxiliar = calcularEdadesPorCategoria();
		

		for(String clave:auxiliar.keySet()) {
			
		}
		return result;
	}

	/*
	 * @Override public Map<String, Double> calcularMediaEdadPorCategoria() { Double
	 * anyo = 0.0; Map<String, Double> result = new HashMap<String, Double>();
	 * for(Premio p: getPremios()) { anyo+=p.getAnyoNacimiento().doubleValue();
	 * result.put(p.getCategoria().toString(), p.getAnyoNacimiento()); } return
	 * result; }
	 */

}
