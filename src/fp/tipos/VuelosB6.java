package fp.tipos;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class VuelosB6 extends Vuelos {

	public VuelosB6(String nombre, List<Vuelo> vuelos) {
		super(nombre, vuelos);
	}
	
	// 1. Método que devuelve un Map tal que a cada destino 
	// le hace corresponder un Optional con el vuelo más barato 
	// a ese destino.
	public Map<String, Vuelo> getVueloMasBaratoPorDestino1() {
		return getVuelos().stream()
				.collect(Collectors.groupingBy(Vuelo::getDestino, 
						Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Vuelo::getPrecio)), 
								opt -> opt.get())));
	}
	
	

}
