package fp.nobel.clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//clase que se encarga de realizar operaciones con premios, es como una estanteria donde se almacenan
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
		return new HashSet<Premio>(premios);
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
		if (obj instanceof PremioInterfaz) {
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
		this.premios.add(p);
	}

	public Set<Premio> obtenerPremiosDeGenero(Genero g) {
		Set<Premio> premios = new HashSet<Premio>();
		for (Premio p : getPremios()) {
			if (p.getGenero().equals(g)) {
				premios.add(p);
			}
		}
		
		return premios;
	}


	@Override
	public Map<String, List<Integer>> calcularEdadesPorCategoria() {
		
		Map<String, List<Integer>> result = new HashMap<String, List<Integer>>();
		for (Premio p : getPremios()) {
			String key = p.getCategoria().toLowerCase();
			Integer value = p.getEdadPremiado();
			if(!result.containsKey(key)) {
				result.put(key, new ArrayList<>(value));
			}else {
				result.get(key).add(value);
			}
		}
		System.out.println(result);
		return result;
	}
	

	@Override
	public long calcularNumeroPremiadosMasJovenesDe(Integer n) {
		long result = 0l;
		for (Premio p:getPremios()) {
			if(p.getEdadPremiado()<n) {
				result+=1;
			}
		}
		return result;
	}

	@Override
	public Map<String, Double> calcularMediaEdadPorCategoria() {
		Map<String, Double> result = new HashMap<String, Double>();
		Set<String> keys = calcularEdadesPorCategoria().keySet();
		System.out.println("claves"+keys);
		Map<String, List<Integer>> edadesCategorias = calcularEdadesPorCategoria();
		for(String key : edadesCategorias.keySet()) {
			Double edadMedia = calcularMedia(edadesCategorias.get(key));
			//aqui no hay colisiones porque no hay ninguna lista en el mapa
			result.put(key, edadMedia);
			
			
		}
		System.out.println("LOL");
		System.out.println(result);
		return result;
	}
	public Double calcularMedia(List<Integer> numbers) {
		Double result = 0.0;
		for(Integer n : numbers) {
			result+=n;
		}
		return result/(numbers.size());
	}

	

	
	

}
