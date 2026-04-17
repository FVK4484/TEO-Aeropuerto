package fp.tipos;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

public class VuelosB6 extends Vuelos {

	public VuelosB6(String nombre, List<Vuelo> vuelos) {
		super(nombre, vuelos);
	}
	
	// 1. Método que devuelve un Map tal que a cada destino 
	// le hace corresponder un Optional con el vuelo más barato 
	// a ese destino.
	public Map<String, Optional<Vuelo>> getVueloMasBaratoPorDestino1() {
		return getVuelos().stream()
				.collect(Collectors.groupingBy(Vuelo::getDestino, 
						Collectors.maxBy(Comparator.comparing(Vuelo::getPrecio))));
	}
	
	// 2. Método que devuelve un Map tal que a cada destino le hace 
	// corresponder el vuelo más barato a ese destino.
	public Map<String, Vuelo> getVueloMasBaratoPorDestino2() {
		return getVuelos().stream()
				.collect(Collectors.groupingBy(Vuelo::getDestino, 
						Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Vuelo::getPrecio)), 
								opt -> opt.get())));
	}
	
	// 3. Método que devuelve un Map tal que a cada destino le hace
	// corresponder el código del Vuelo con el vuelo más barato a ese destino.
	public Map<String, String> getCodigoVueloMasBaratoPorDestino() {
		return getVuelos().stream()
				.collect(Collectors.groupingBy(Vuelo::getDestino, 
						Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Vuelo::getPrecio)), 
								opt -> opt.get().getCodigo())));
	}
	
	// 4. Método que devuelve el destino con más vuelos. Si no se puede 
	// calcular eleva NoSuchElementException.
	public String getDestinoMasVuelos() {
		return getVuelos().stream()
				.collect(Collectors.groupingBy(Vuelo::getDestino, 
						Collectors.counting()))
				.entrySet().stream()
				.max(Map.Entry.comparingByValue())
				.map(Map.Entry::getKey)
				.orElseThrow(NoSuchElementException::new);
	}

}
