package fp.tipos.persona.funcionales;

import java.util.Comparator;

import fp.tipos.persona.Persona;

public class ComparadorPersonaPorEdad implements Comparator<Persona>{

	@Override
	public int compare(Persona p1, Persona p2) {
		int result = p1.getFechaNacimiento().compareTo(p2.getFechaNacimiento());
		if(result==0) {
			result = p1.compareTo(p2);
		}
		return result;
	}

}
