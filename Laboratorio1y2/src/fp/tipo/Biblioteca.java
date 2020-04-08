package fp.tipo;

import java.util.Set;

public class Biblioteca {
	private Set<Libro> conjuntoLibros;

	public Set<Libro> getConjuntoLibros() {
		return conjuntoLibros;
	}
	

	public Biblioteca(Set<Libro> conjuntoLibros) {
		super();
		this.conjuntoLibros = conjuntoLibros;
	}


	public Integer contarNumeroLibros() {
		return getConjuntoLibros().size();
	}
	public Long contarNumeroLibrosGenero(EnumeradoLibro el) {
		return getConjuntoLibros().stream().filter(l -> l.getGenero().equals(el)).count();
	}

	public void setConjuntoLibros(Set<Libro> conjuntoLibros) {
		this.conjuntoLibros = conjuntoLibros;
	}
	public void registrarLibro(Libro l) {
		Set<Libro> libros = this.getConjuntoLibros();
		libros.add(l);
	}
	
	

}
