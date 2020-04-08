package fp.tipo.test;

import java.time.LocalDate;
import java.time.Month;

import fp.tipo.EnumeradoLibro;
import fp.tipo.Libro;

public class LibroTest {

	public static void getTitulo(Libro l) {
		System.out.println(l.getTitulo());
	}
	public static void setTitulo(Libro l, String titulo) {
		l.setTitulo(titulo);
		System.out.println(l.getTitulo());
	}
	public static void getGenero(Libro l) {
		System.out.println(l.getGenero());
	}
	public static void setGenero(Libro l, EnumeradoLibro genero) {
		l.setGenero(genero);
		System.out.println(l.getGenero());
	}
	public static void getAnyoAdquisicion(Libro l) {
		System.out.println(l.getAnyoAdquisicion());
	}
	
	public static void checkLibro() {
		Libro l = new Libro("Memorias de Idhum II", "Laura Gallego", 4, LocalDate.of(2000, Month.DECEMBER, 31), EnumeradoLibro.FICCION);
		System.out.println(l);
		try {
			l = new Libro("Memorias de Idhum II", "Laura Gallego", 4, LocalDate.of(1000, Month.DECEMBER, 31), EnumeradoLibro.FICCION);
			System.out.println(l);
		} catch (IllegalArgumentException e) {
			System.out.println("Fecha menor a 1990 - error.");
			System.out.println(l);
		}
		try {
			l = new Libro("Memorias de Idhum II", "Laura Gallego", 0, LocalDate.of(2020, Month.DECEMBER, 31), EnumeradoLibro.FICCION);
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.out.println("Numero paginas menor o igual a 0 - error.");
			System.out.println(l);
		}
		
	}
}
