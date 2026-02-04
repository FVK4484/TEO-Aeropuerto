package fp.tipos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class VuelosB2 extends Vuelos{

	public VuelosB2(String nombre, List<Vuelo> vuelos) {
		super(nombre, vuelos);
	}
	
	public static Integer getNumPasajerosDestino(List <Vuelo> vuelos, String destino) {
		Integer res = 0;
		for (Vuelo v : vuelos) {
			if (v.getDestino().equals(destino)) {
				res += v.getNumPasajeros();
			}
		}
		return res;
	}
	
	public static Integer getNumPasajerosDestinoPrefijo(List <Vuelo> vuelos, String s) {
		Integer res = 0;
		for (Vuelo v : vuelos) {
			if (v.getDestino().startsWith(s)) {
				res += v.getNumPasajeros();
			}
		}
		return res;
	}
	
	public static Double getRecaudacionDestino(List <Vuelo> vuelos, String destino) {
		Double res = 0.0;
		for (Vuelo v : vuelos) {
			if (v.getDestino().equals(destino)) {
				res += v.getPrecio() * v.getNumPasajeros();
			}
		}
		return res;	
	}
	
	public static Vuelo getPrimerVueloDestino(List<Vuelo> vuelos, String destino) {
		List<Vuelo> res = new ArrayList<>();
		for (Vuelo v : vuelos) {
			if (v.getDestino().equals(destino)) {
				res.add(v);
			}
		}
		Collections.sort(vuelos, Comparator.comparing(Vuelo::getFecha));
		return res.getFirst();
	}
	
}
