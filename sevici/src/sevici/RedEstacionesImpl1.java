package sevici;

import java.util.ArrayList;
import java.util.List;

public class RedEstacionesImpl1 implements RedEstaciones{

	List<Estacion> estaciones;

	
	public RedEstacionesImpl1() {
		super();
	}

	public RedEstacionesImpl1(List<Estacion> estaciones) {
		super();
		this.estaciones = estaciones;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estaciones == null) ? 0 : estaciones.hashCode());
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
		RedEstacionesImpl1 other = (RedEstacionesImpl1) obj;
		if (estaciones == null) {
			if (other.estaciones != null)
				return false;
		} else if (!estaciones.equals(other.estaciones))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RedEstacionesImpl1 [estaciones=" + estaciones + "]";
	}

	@Override
	public void anyadirEstaciones(Estacion e) {
		this.getEstaciones().add(e);
	}

	@Override
	public List<Estacion> getEstaciones() {
		return new ArrayList<Estacion>(this.estaciones);
	}

	@Override
	public Integer getNumeroEstaciones() {
		// TODO Auto-generated method stub
		return this.getEstaciones().size();
	}
	
	

	

}
