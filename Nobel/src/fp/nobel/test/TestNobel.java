package fp.nobel.test;

import java.util.Set;

import fp.nobel.clases.FactoriaNobel;
import fp.nobel.clases.Premio;
import fp.nobel.clases.PremioInterfaz;
public class TestNobel {

	public static void main(String[] args) {
		testCalcularPremiosMasJovenesQue(testFactoriaNobel());
	}

	private static Set<Premio> testFactoriaNobel() {
		return FactoriaNobel.leerPremios("data/nobel_prizes.csv");
		
	}
	private static void testObtenerPremiosDeGenero() {
		System.out.println("------------------------");
		System.out.println("PROBANDO OBTENER PREMIOS");
		System.out.println("------------------------");
		
		
	}
	private static void testCalcularPremiosMasJovenesQue(PremioInterfaz premios) {
		System.out.println("testCalcularPremiosMasJovenesQue");
		System.out.println(premios.calcularNumeroPremiadosMasJovenes(25));
	}
	

}
