package puntos.punto;

public class PuntoDistanciaEuclidea implements  Punto {
	private Double x;
	private Double y;
	
	public PuntoDistanciaEuclidea() {
		super();
	}

	public PuntoDistanciaEuclidea(Double x, Double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public Double getY() {
		return y;
	}

	public void setY(Double y) {
		this.y = y;
	}
	
	

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

	

	@Override
	public Double calculaDistancia(Punto p) {
		// TODO Auto-generated method stub
		return Math.sqrt(Math.pow(p.getX()-getX(), 2)+Math.pow(p.getY()-getY(),2));
	}
}
