package fp.nobel.test;

import java.util.HashSet;
import java.util.Set;

import fp.nobel.clases.FactoriaNobel;
import fp.nobel.clases.Premio;
import fp.nobel.clases.PremioInterfaz;
public class TestNobel {

	public static void main(String[] args) {
		Set<Premio> premios = new HashSet<Premio>();
		premios = testFactoriaNobel();
		
	}

	private static Set<Premio> testFactoriaNobel() {
		Set<Premio> premios =  FactoriaNobel.leerPremios("data/nobel_prizes.csv").getPremios();
		System.out.println("testFactoriaNobel");
		
		return premios;
	}
	
	private static void testObtenerPremiosDeGenero() {
		System.out.println("------------------------");
		System.out.println("PROBANDO OBTENER PREMIOS");
		System.out.println("------------------------");
		
		
	}
	private static void testCalcularPremiosMasJovenesDe(Integer edad) {
		System.out.println("testCalcularPremiosMasJovenesQue");
		System.out.println();
	}
	

}
