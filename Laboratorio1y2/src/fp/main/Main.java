package fp.main;

import java.time.LocalDate;

import fp.tipo.Biblioteca;
import fp.tipo.EnumeradoLibro;
import fp.tipo.Libro;
import fp.tipo.test.LibroTest;
import fp.tipo.test.TestBiblioteca;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro l = new Libro("El valle de los lobos", "Laura Gallego", 250, LocalDate.now(), EnumeradoLibro.FICCION);
		LibroTest.getGenero(l);
		LibroTest.getTitulo(l);
		LibroTest.setGenero(l, EnumeradoLibro.NOVELA);
		LibroTest.setTitulo(l, "IT");
		LibroTest.getAnyoAdquisicion(l);
		LibroTest.checkLibro();
		TestBiblioteca.testGetLibros();
	}

}
