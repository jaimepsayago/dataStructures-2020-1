package unidad5;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		// tabla hash o tabla dispersion o tabla fragmentada
		
		//crear hashmap
		HashMap<String, String>  ciudades = new HashMap<String, String> ();
		ciudades.put("england", "london");
		ciudades.put("germany", "Berlin");
		ciudades.put("norway", "oslo");
		ciudades.put("usa", "washington");
		
		System.out.println(ciudades.get("norway"));
		//System.out.println(ciudades.remove("norway"));
		for (String i: ciudades.values()) {
			System.out.println(i);
		}

	}

}
