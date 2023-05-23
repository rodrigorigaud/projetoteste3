package Collections;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		Set<String> lista = new TreeSet<>();
//		Set<String> lista = new HashSet<>();
		
		lista.add("Ana");
		lista.add("Carlos");
		lista.add("Luca");
		lista.add("Pedro");
		
		for (String string : lista) {
			System.out.println(string);
		}
	
		
		
	
	}
	
}
