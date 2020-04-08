package fp.tipo.test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import fp.tipo.Biblioteca;
import fp.tipo.EnumeradoLibro;
import fp.tipo.Libro;

public class TestBiblioteca {

	public  static void testGetLibros() {
		System.out.println("testGetLibros");
		Set<Libro> libros = new HashSet<Libro>();
		Libro l = new Libro("El valle de los lobos", "Laura Gallego", 250, LocalDate.now(), EnumeradoLibro.FICCION);
		Libro l2 = new Libro("El valle de los lobos 2", "Laura Gallego 2", 250222, LocalDate.now(), EnumeradoLibro.FICCION);
		libros.add(l);
		libros.add(l2);
		Biblioteca b = new Biblioteca(libros);
		System.out.println(b.getConjuntoLibros());
		System.out.println("Tamaño biblioteca --> "+b.getConjuntoLibros().size());
	}
}
