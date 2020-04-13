package fp.ovnis.clases;

import fp.ovnis.utiles.Checkers;

public class Coordenadas implements Comparable<Coordenadas>{

	private Double latitud, longitud;
	private Hemisferio hemisferio;
	public Coordenadas(String dato) {
		String[] splits = dato.replace("(", "").split("");
		Double latitud = Double.valueOf(splits[0]);
		Double longitud = Double.valueOf(splits[1]);
		this.latitud = latitud;
		this.longitud = longitud;
		
	}
	public Coordenadas(Double latitud, Double longitud, Hemisferio hemisferio) {
		super();
		Checkers.checkNoNull(latitud, longitud);
		Checkers.check("", latitud>=-90 && latitud <=90);
		Checkers.check("", longitud>=-180 && longitud<=180);
		this.latitud = latitud;
		this.longitud = longitud;
		this.hemisferio = hemisferio;
	}
	public Coordenadas(Double latitud, Double longitud) {
		super();
		Checkers.checkNoNull(latitud, longitud);
		Checkers.check("", latitud>=-90 && latitud <=90);
		Checkers.check("", longitud>=-180 && longitud<=180);
		this.latitud = latitud;
		this.longitud = longitud;
	}
	public Coordenadas() {
		super();
		this.latitud = 0.0;
		this.longitud = 0.0;
		
	}
	public Coordenadas(String latitud, String longitud, String hemisferio) {
		Double lat, lon;
		Hemisferio h;
		lat = (Double.parseDouble(latitud));
		lon = Double.parseDouble(longitud);
		if(hemisferio.toUpperCase()=="NORTE") {
			h = Hemisferio.Norte;
		}else if(hemisferio.toUpperCase()=="SUR") {
			h = Hemisferio.Sur;
		}else {
			throw new IllegalArgumentException();
		}
		Checkers.checkNoNull(lat, lon);
		Checkers.check("", lat>=-90 && lat <=90);
		Checkers.check("", lon>=-180 && lon<=180);
		this.latitud = lat;
		this.longitud = lon;
		this.hemisferio = h;
	}
	public Double getLatitud() {
		return latitud;
	}
	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}
	public Double getLongitud() {
		return longitud;
	}
	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}
	public Hemisferio getHemisferio() {
		return hemisferio;
	}
	public void setHemisferio(Hemisferio hemisferio) {
		this.hemisferio = hemisferio;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hemisferio == null) ? 0 : hemisferio.hashCode());
		result = prime * result + ((latitud == null) ? 0 : latitud.hashCode());
		result = prime * result + ((longitud == null) ? 0 : longitud.hashCode());
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
		Coordenadas other = (Coordenadas) obj;
		if (hemisferio != other.hemisferio)
			return false;
		if (latitud == null) {
			if (other.latitud != null)
				return false;
		} else if (!latitud.equals(other.latitud))
			return false;
		if (longitud == null) {
			if (other.longitud != null)
				return false;
		} else if (!longitud.equals(other.longitud))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Coordenadas [latitud=" + latitud + ", longitud=" + longitud + ", hemisferio=" + hemisferio + "]";
	}
	@Override
	public int compareTo(Coordenadas c) {
		return this.compareTo(c);
	}
	public Double getDistancia(Coordenadas c) {
		Double distancia = Math.sqrt(Math.pow(this.getLatitud()-c.getLatitud(), 2)+Math.pow(this.getLongitud()-c.getLongitud(), 2));
		return distancia;
	}
	
	
}
