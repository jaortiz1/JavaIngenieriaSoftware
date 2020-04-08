package fp.vinos.test;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class VinosImpl implements Vinos {
	
	private Set<Vino> vinos;
	
	private VinosImpl() {
		this.vinos = new HashSet<Vino>();
	}
	//devolvemos una copia para que el usuario no pueda modificar los vinos ya que es un objeto inmutable
	public Set<Vino> getVinos() {
		return new HashSet<Vino>();
	}

	public void setVinos(Set<Vino> vinos) {
		this.vinos = vinos;
	}
	
	@Override
	public void addWine(Vino v) {
		this.vinos.add(v);
	}
	public String toString() {
		return vinos.toString();
	}
	public boolean equals(Object o) {
		boolean result = false;
		if(o instanceof Vinos) {
			Vinos v = (Vinos) o;
			result = getVinos().equals(o);
		}
		return result;
	}
	public int hashCode() {
		return getVinos().hashCode();
	}
	
	@Override
	public Vino obtenerVinoMejorPuntuado(Set<Vino> vinos) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Set<String> calcularUvasPorRegion(String region) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Map<String, List<Vinos>> obtenerVinosRangoPuntos(Integer r1, Integer r2) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Map<String, Set<String>> calcularUvasPorPais() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Map<String, Long> calcularCalidadPrecioPorRegionMayorDe(Double calidadPrecio) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Map<String, List<Vino>> calcularVinosPorPais() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Vino obtenerVinoMejorPuntuado() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Integer calcularNumeroVinoPais(String pais) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Integer calcularNumeroVinosPais(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
