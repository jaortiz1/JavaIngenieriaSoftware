package fp.ovnis.clases;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import fp.ovnis.utiles.Checkers;

public class Avistamiento implements Comparable{

	private LocalDate fecha;
	private String lugar;
	private Integer duracion;
	private Forma forma;
	private Coordenadas ubicacion;
	private Integer anyo;
	
	
	public Avistamiento() {
		new Avistamiento();
	}
	
	public Avistamiento(String s) {
		String [] splits = s.split(";");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fecha = LocalDate.parse(splits[0].trim(), formatter);
		String lugar = splits[1].trim();
		Integer duracion = Integer.parseInt(splits[2]);
		Forma forma = Forma.CIRCULAR;
		Coordenadas coordenadas = new Coordenadas(splits[4].trim());
		Checkers.check("", duracion>0);
		Checkers.check("", fecha.compareTo(LocalDate.now())<=1);
		this.fecha = LocalDate.now();
		this.lugar = lugar;
		this.duracion = duracion;
		this.forma = forma;
		this.ubicacion = coordenadas;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public String getLugar() {
		return lugar;
	}


	public Coordenadas getCoordenadas() {
		return ubicacion;
	}


	public Integer getDuracion() {
		return duracion;
	}


	public Forma getForma() {
		return forma;
	}


	public Coordenadas getUbicacion() {
		return ubicacion;
	}


	public Integer getAnyo() {
		return anyo;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public void setLugar(String lugar) {
		this.lugar = lugar;
	}


	public void setCoordenadas(Coordenadas coordenadas) {
		this.ubicacion = coordenadas;
	}


	public void setDuracion(Integer duracion) {
		Checkers.check("", duracion<0);
		this.duracion = duracion;
	}


	public void setForma(Forma forma) {
		this.forma = forma;
	}


	public void setUbicacion(Coordenadas ubicacion) {
		this.ubicacion = ubicacion;
	}


	public void setAnyo(Integer anyo) {
		this.anyo = anyo;
	}
	
	public int compareTo(Avistamiento o) {
		int result = getFecha().compareTo(o.getFecha());
		if(result==0) {
			result = getLugar().compareTo(o.getLugar());
		}
		return result;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + ((lugar == null) ? 0 : lugar.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Avistamiento) {
			Avistamiento av = (Avistamiento) obj;
			result = getFecha().equals(av.getFecha()) && getLugar().equals(av.getLugar());
		}
		return result;
	}

	@Override
	public String toString() {
		return "Avistamiento [fecha=" + fecha + ", lugar=" + lugar + ", duracion=" + duracion + ", forma=" + forma
				+ ", ubicacion=" + ubicacion + ", anyo=" + anyo + "]";
	}
	
	public Double getdistancia(Avistamiento av) {
		return getUbicacion().getDistancia(av.getUbicacion());
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		int result = 0;
		if(o instanceof Avistamiento) {
			Avistamiento p = (Avistamiento)o;
			if(this.getFecha().equals(p.getFecha())) {
				result = 1;
			};
		}
		return result;
		
	}


	
}
