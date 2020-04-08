package utiles;

public  class Checkers {

	public static void checkNoNull(Double lat, Double lon) {
		if(lat==null || lon==null) {
			throw new IllegalArgumentException();
		}
	}
	public static void check(String msg, Boolean noError) {
		if(noError==false) {
			throw new IllegalArgumentException(msg);
		}
	}
}
