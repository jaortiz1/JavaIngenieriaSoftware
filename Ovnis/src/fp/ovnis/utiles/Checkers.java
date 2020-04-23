package fp.ovnis.utiles;

public  class Checkers {

	public static void checkNoNull(Double lat, Double lon) {
		if(lat==null || lon==null) {
			throw new IllegalArgumentException();
		}
	}
	public static void check(String msg, Boolean noError) {
		if(!noError) {
			throw new IllegalArgumentException(msg);
		}
	}
	
	public static void CheckPuestos(Integer puestos) {
		if(puestos<0) {
			throw new IllegalArgumentException();
		}
	}
	 public static void checkBicisDisponibles(Integer bicis, Integer puestos) {
		 if(bicis <0 || bicis>puestos) {
			 throw new IllegalArgumentException();
		 }
		 
	 }
	 
}
