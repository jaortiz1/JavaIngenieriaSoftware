package puntos.circulo;

import java.awt.List;
import java.util.ArrayList;

import puntos.punto.PuntoDistanciaEuclidea;
public class Circulo {
	private Double radio;
	private PuntoDistanciaEuclidea centro;
	
	//constructor
	public Circulo() {
		radio = 0.0;
		centro = new PuntoDistanciaEuclidea();
	}
	
	public Circulo(PuntoDistanciaEuclidea centro, Double radio) {
		this.centro=centro;
		this.radio=radio;
	}
	
	//no se hacen getters ni setters de propiedades que se calculan con otras
	public double getRadio() {
		return this.radio;
	}
	
	public PuntoDistanciaEuclidea getCentro() {
		return this.centro;
	}
	
	public void setRadio(Double radio) {
		this.radio=radio;
	}
	
	public void setCentro(PuntoDistanciaEuclidea centro) {
		this.centro=centro;
	}
	
	
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", centro=" + centro + "]";
	}

	public Double calcularArea() {
		return Math.PI * Math.pow(getRadio(), 2);
	}
	
	public Double calcularDistancia(Circulo c) {
		PuntoDistanciaEuclidea centro2 = c.getCentro();
		PuntoDistanciaEuclidea miCentro = getCentro();
		return miCentro.calculaDistancia(centro2);
	}
	
	
}
