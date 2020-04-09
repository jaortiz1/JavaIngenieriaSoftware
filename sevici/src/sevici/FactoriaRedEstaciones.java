package sevici;

public class FactoriaRedEstaciones {

	public static Coordenadas parseaCoordenadas(String s) {
		String  [] splits = s.replace(")","").replace("(", "").split(",");
		if(splits.length!=2) {
			throw new IllegalArgumentException();
		}
		Double latitud = Double.parseDouble(splits[0]);
		Double longitud = Double.parseDouble(splits[1]);
		return new Coordenadas(latitud, longitud);
	}

}
