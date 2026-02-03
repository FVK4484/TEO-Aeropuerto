package fp.tipos.test;

import java.util.List;

import fp.tipos.FactoriaVuelos;
import fp.tipos.Vuelo;
import fp.tipos.VuelosB2;

public class TestVuelosB2 {

	public static void main(String[] args) {
		List<Vuelo> listaVuelos = FactoriaVuelos.leeVuelos("./data/aeropuerto.csv");
		
		testGetNumPasajerosDestino(listaVuelos, "Madrid");
		testGetNumPasajerosDestinoPrefijo(listaVuelos, "Barcelona");
		testGetRecaudacionDestino(listaVuelos, "Barcelona");
	}
	
	private static void testGetNumPasajerosDestino(List<Vuelo> vuelos, String destino) {
		
		System.out.println("===testGetNumPasajerosDestino ===");
		System.out.println("Pasajeros con destino " + destino + ": " + VuelosB2.getNumPasajerosDestino(vuelos, destino));
		
	}
	
	private static void testGetNumPasajerosDestinoPrefijo(List <Vuelo> vuelos, String s) {
		
		System.out.println("===testGetNumPasajerosDestinoPrefijo ===");
		System.out.println("Pasajeros con destino que empieza por " + s + ": " + VuelosB2.getNumPasajerosDestinoPrefijo(vuelos, s));
		
	}
	
	private static void testGetRecaudacionDestino(List <Vuelo> vuelos, String destino) {
		
		System.out.println("===testGetRecaudacionDestino ===");
		System.out.println("Recaudación de los vuelos a " + destino + ": " + VuelosB2.getRecaudacionDestino(vuelos, destino));
		
	}

}
