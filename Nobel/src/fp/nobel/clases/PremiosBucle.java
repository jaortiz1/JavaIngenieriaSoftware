package fp.nobel.clases;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PremiosBucle implements Premios {

	Set<Premio> premios;

	public PremiosBucle() {
		super();
	}
	
	public PremiosBucle(String [] premios) {
		super();
		Integer anyo, anyoNacimiento;
		String nombre, apellidos;
		Genero categoria;
		String[] linea;
		
		for(String p: premios) {
			linea = p.split(",");
			anyo = Integer.parseInt(linea[0]);
			nombre = linea[3];
			apellidos = linea[4];
			anyoNacimiento = Integer.parseInt(linea[5]);
			if(linea[2].toString().toLowerCase()=="male") {
				categoria = Genero.MALE;
			}else {
				categoria = Genero.FEMALE;
			}
			this.premios.add(new Premio(anyo, categoria, nombre, apellidos, anyoNacimiento));
		}
	}

	public PremiosBucle(Set<Premio> premios) {
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
		PremiosBucle other = (PremiosBucle) obj;
		if (premios == null) {
			if (other.premios != null)
				return false;
		} else if (!premios.equals(other.premios))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PremiosBucle [premios=" + premios + "]";
	}

	@Override
	public void anyadirPremio(Premio p) {
		// TODO Auto-generated method stub
		premios.add(p);
		
	}

	
	public Set<Premio> obtenerPremiosDeGenero(Genero g) {
		Set<Premio> premios = new HashSet<Premio>();
		for(Premio p: getPremios()) {
			if (p.getCategoria().equals(g)) {
				premios.add(p);
			}
		}
		return premios;
	}

	@Override
	public Integer calcularNumeroPremiadosMasJovenes(Integer n) {
		Integer result = 0;
		result =(int) (getPremios().stream().filter(x->x.getAnyoNacimiento()==n).count());
		return result;
	}

	@Override
	public Map<String, Double> calcularMediaEdadPorCategoria() {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override
	public Map<String, Double> calcularMediaEdadPorCategoria() {
		Double anyo = 0.0;
		Map<String, Double> result = new HashMap<String, Double>();
		for(Premio p: getPremios()) {
			anyo+=p.getAnyoNacimiento().doubleValue();
			result.put(p.getCategoria().toString(), p.getAnyoNacimiento());
		}
		return result;
	}*/
	
	
}
