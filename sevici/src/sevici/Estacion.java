package sevici;

import utiles.Checkers;

public class Estacion implements Comparable<Estacion>{

	/**
	 * Propiedades:
� nombre, de tipo String. Consultable. Nombre de la estaci�n.
� puestos, de tipo Integer. Consultable. N�mero de puestos de los que dispone la
estaci�n.
� bicis disponibles, de tipo Integer. Consultable y modificable. N�mero de bicicletas
disponibles para alquiler en la estaci�n.
� ubicaci�n, de tipo Coordenadas. Consultable. Coordenadas geogr�ficas de la estaci�n.
� puestos vac�os, de tipo Integer. Consultable. N�mero de puestos vac�os de la estaci�n,
que se calcula como la diferencia entre el n�mero de puestos y el n�mero de bicicletas
disponibles.
� tiene bicis disponibles, de tipo Boolean. Consultable. Toma valor true si la estaci�n
tiene al menos una bicicleta disponible, y false si no hay ninguna.
	 */
	private String nombre, nombreEstacion;
	private Integer puestos;
	private Integer bicisDisponibles;
	private Coordenadas ubicacion;
	private boolean tieneBicisDisponibles;
	public Estacion(String nombre, String nombreEstacion, Integer puestos, Integer bicisDisponibles,
			Coordenadas ubicacion, boolean tieneBicisDisponibles) {
		super();
		Checkers.checkBicisDisponibles(bicisDisponibles, puestos);
		this.nombre = nombre;
		this.nombreEstacion = nombreEstacion;
		this.puestos = puestos;
		this.bicisDisponibles = bicisDisponibles;
		this.ubicacion = ubicacion;
		this.tieneBicisDisponibles = tieneBicisDisponibles;
	}
	public Estacion(String nombre, String nombreEstacion, String puestos, String bicisDisponibles,
			String lat, String lon , String  tieneBicisDisponibles) {
		super();
		this.nombre = nombre;
		this.nombreEstacion = nombreEstacion;
		this.puestos = Integer.parseInt(puestos);
		this.bicisDisponibles = Integer.parseInt(bicisDisponibles);
		this.ubicacion = new Coordenadas(lat, lon, null);
		this.tieneBicisDisponibles = (tieneBicisDisponibles.toLowerCase()=="true")?true:false;
		
		
	}
	public Estacion() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombreEstacion() {
		return nombreEstacion;
	}
	public void setNombreEstacion(String nombreEstacion) {
		this.nombreEstacion = nombreEstacion;
	}
	public Integer getPuestosDisponibles() {
		return puestos;
	}
	public void setPuestos(Integer puestos) {
		this.puestos = puestos;
	}
	public Integer getBicisDisponibles() {
		return bicisDisponibles;
	}
	public void setBicisDisponibles(Integer bicisDisponibles) {
		this.bicisDisponibles = bicisDisponibles;
	}
	public Coordenadas getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(Coordenadas ubicacion) {
		this.ubicacion = ubicacion;
	}
	public boolean tieneBicisDisponibles() {
		return tieneBicisDisponibles;
	}
	public void setTieneBicisDisponibles(boolean tieneBicisDisponibles) {
		this.tieneBicisDisponibles = tieneBicisDisponibles;
	}
	@Override
	public String toString() {
		return "Estacion [nombre=" + nombre + ", nombreEstacion=" + nombreEstacion + ", puestos=" + puestos
				+ ", bicisDisponibles=" + bicisDisponibles + ", ubicacion=" + ubicacion + ", tieneBicisDisponibles="
				+ tieneBicisDisponibles + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bicisDisponibles == null) ? 0 : bicisDisponibles.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((nombreEstacion == null) ? 0 : nombreEstacion.hashCode());
		result = prime * result + ((puestos == null) ? 0 : puestos.hashCode());
		result = prime * result + (tieneBicisDisponibles ? 1231 : 1237);
		result = prime * result + ((ubicacion == null) ? 0 : ubicacion.hashCode());
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
		Estacion other = (Estacion) obj;
		if (bicisDisponibles == null) {
			if (other.bicisDisponibles != null)
				return false;
		} else if (!bicisDisponibles.equals(other.bicisDisponibles))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (nombreEstacion == null) {
			if (other.nombreEstacion != null)
				return false;
		} else if (!nombreEstacion.equals(other.nombreEstacion))
			return false;
		if (puestos == null) {
			if (other.puestos != null)
				return false;
		} else if (!puestos.equals(other.puestos))
			return false;
		if (tieneBicisDisponibles != other.tieneBicisDisponibles)
			return false;
		if (ubicacion == null) {
			if (other.ubicacion != null)
				return false;
		} else if (!ubicacion.equals(other.ubicacion))
			return false;
		return true;
	}
	@Override
	public int compareTo(Estacion o) {
		// TODO Auto-generated method stub
		return this.getNombre().compareTo(o.getNombre());
	}
	
	
	
}
