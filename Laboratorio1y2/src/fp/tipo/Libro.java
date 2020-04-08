package fp.tipo;

import java.time.LocalDate;

public class Libro {
	private String titulo;
	private String autor;
	private Integer numeroPagimas;
	private LocalDate fechaAdquisicion;
	private EnumeradoLibro genero;
	public Libro() {
		super();
	}
	public Libro(String titulo, String autor, int numeroPagimas, LocalDate fechaAdquisicion, EnumeradoLibro genero) {
		super();
		this.checkAnyoAdquisicion(fechaAdquisicion.getYear());
		this.checkNumeroPaginas(numeroPagimas);
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPagimas = numeroPagimas;
		this.fechaAdquisicion = fechaAdquisicion;
		this.genero = genero;
		
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumeroPagimas() {
		return numeroPagimas;
	}
	public void setNumeroPagimas(int numeroPagimas) {
		this.checkNumeroPaginas(numeroPagimas);
		this.numeroPagimas = numeroPagimas;
	}
	public LocalDate getFechaAdquisicion() {
		return fechaAdquisicion;
	}
	public void setFechaAdquisicion(LocalDate fechaAdquisicion) {
		this.checkAnyoAdquisicion(fechaAdquisicion.getYear());
		this.fechaAdquisicion = fechaAdquisicion;
	}
	public EnumeradoLibro getGenero() {
		return genero;
	}
	public void setGenero(EnumeradoLibro genero) {
		this.genero = genero;
	}
	public Integer getAnyoAdquisicion() {
		return getFechaAdquisicion().getYear();
	}
	//transforma a un entero el objeto gracias a sus atributos, como el toString pero en vez de a string lo pasa a int
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((fechaAdquisicion == null) ? 0 : fechaAdquisicion.hashCode());
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + numeroPagimas;
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		Libro other = (Libro) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (fechaAdquisicion == null) {
			if (other.fechaAdquisicion != null)
				return false;
		} else if (!fechaAdquisicion.equals(other.fechaAdquisicion))
			return false;
		if (genero != other.genero)
			return false;
		if (numeroPagimas != other.numeroPagimas)
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", numeroPagimas=" + numeroPagimas
				+ ", fechaAdquisicion=" + fechaAdquisicion + ", genero=" + genero + "]";
	}
	//devuelve <0, entonces la cadena que llama al método es primero lexicográficamente
	//devuelve == 0 entonces las dos cadenas son lexicográficamente equivalentes
	//devuelve> 0, entonces el parámetro pasado al método compareTo es lexicográficamente el primero.
	public Integer compareTo(Libro l) {
		Integer result = this.getAnyoAdquisicion().compareTo(l.getAnyoAdquisicion());
		if (result==0) {
			result = this.getAutor().compareTo(l.getAutor());
		}
		return result;
	}
	/*
	 * El tipo Libro tiene una propiedad derivada año de tipo Integer que contiene el año de adquisición del libro.
Dos libros son iguales si tienen el mismo título y autor. El número de páginas de un libro debe ser mayor
que 0, y su fecha de adquisición debe ser posterior a 1900. El orden natural de los libros viene dado por el
orden alfabético del título, y en caso de igualdad por el orden alfabético del autor. El tipo Biblioteca
representa una colección de libros y está implementado mediante un conjunto de libros. 
	 */
	
	private void checkNumeroPaginas(Integer paginas) {
		if(paginas<=0) {
			throw new IllegalArgumentException();
		}
	}
	private void checkAnyoAdquisicion(Integer anyo) {
		
		if(anyo<=1900) {
			throw new IllegalArgumentException();
		}
	}
	

}
