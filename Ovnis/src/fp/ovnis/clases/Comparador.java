package fp.ovnis.clases;

import java.util.Comparator;

public class Comparador implements Comparator<Avistamiento> {

	@Override
	public int compare(Avistamiento o1, Avistamiento o2) {
		int result = o1.getUbicacion().compareTo(o2.getUbicacion());
		return result;
	}

}
