package puntos.punto;

public interface Punto {

	Double getX();
	Double getY();
	void setX(Double x);
	void setY(Double y);
	Double calculaDistancia(Punto p);
}
