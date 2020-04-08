package puntos.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class main {

	public static void main(String[] args) {
		Set<Integer> conjunto = new HashSet<>();
		ArrayList<Integer> numeros = new ArrayList<>();
		Map<String, Integer> mapa = new HashMap<>();
		mapa.put("Jorge", 20);
		System.out.println(mapa);
		numeros.add(1);
		numeros.add(2);
		//se ejecutan en cascada, una detras de la otra
		System.out.println(numeros
				.stream()
				.filter(x->x%2==0)
				.count());
		
	}

}
