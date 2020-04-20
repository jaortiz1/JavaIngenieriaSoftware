package fp.tipos.persona;

public class FactoriaPersonas {

	public static Persona create(String  parametros) {
		return new Persona(parametros);
	}
}
