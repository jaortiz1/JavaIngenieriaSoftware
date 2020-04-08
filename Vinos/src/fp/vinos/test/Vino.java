package fp.vinos.test;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Vino{
	private String pais;
	private String region;
	private Integer puntos;
	private Double precio;
	private String uva;
	
	public Vino() {
		super();
	}
	public Vino(String pais, String region, Integer puntos, Double precio, String uva) {
		super();
		checkPrecio(precio);
		checkPuntos(puntos);
		this.pais = pais;
		this.region = region;
		this.puntos = puntos;
		this.precio = precio;
		this.uva = uva;
	}
	public String getPais() {
		return pais;
	}
	
	public String getRegion() {
		return region;
	}
	
	public Integer getPuntos() {
		return puntos;
	}
	
	public Double getPrecio() {
		return precio;
	}
	
	public String getUva() {
		return uva;
	}
	
	@Override
	public String toString() {
		return "Vino [pais=" + pais + ", region=" + region + ", puntos=" + puntos + ", precio=" + precio + ", uva="
				+ uva + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pais == null) ? 0 : pais.hashCode());
		result = prime * result + ((precio == null) ? 0 : precio.hashCode());
		result = prime * result + ((puntos == null) ? 0 : puntos.hashCode());
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		result = prime * result + ((uva == null) ? 0 : uva.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object o) {
		boolean result = false;
		if(o instanceof Vino) {
			Vino v = (Vino)o;
			if(getPais().equals(v.getPais())) {
				result = true;
			};
		};
		return result;
	};
	public int compareTo(Vino o) {
		int result = getPais().compareTo(o.getPais());
		if(result==0) {
			result = getPuntos().compareTo(o.getPuntos());
		}
		return result;
	}
	public Double getCalidadPrecio() {
		return getPuntos()/getPrecio();
	}
	//checkers in private
	private void checkPuntos(Integer puntos) {
		if(puntos<0 || puntos>100) {
			throw new IllegalArgumentException();
		}
	}
	private void checkPrecio(Double precio) {
		if(precio<=0) {
			throw new IllegalArgumentException();
		}
	}
	
}
