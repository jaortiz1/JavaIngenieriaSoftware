package puntos.test;

import puntos.circulo.Circulo;
import puntos.punto.PuntoDistanciaEuclidea;

public class TestCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PuntoDistanciaEuclidea centro = new PuntoDistanciaEuclidea(2.0, 0.0);
		PuntoDistanciaEuclidea centro2 = new PuntoDistanciaEuclidea(3.0, 1.0);

		Circulo c = new Circulo(centro, 3.0);
		Circulo c2 = new Circulo(centro, 2.0);
		System.out.println("Distancia: " + c.calcularDistancia(c2));
		System.out.println("Area: " + c2.calcularArea());
	}

}
