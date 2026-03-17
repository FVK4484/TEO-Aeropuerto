package fp.tipos.test;

import java.util.List;

import fp.tipos.FactoriaVuelos;
import fp.tipos.Vuelo;
import fp.tipos.VuelosB2;

public class TestVuelosB2 {

	public static void main(String[] args) {
		List<Vuelo> listaVuelos = FactoriaVuelos.leeVuelos("./data/aeropuerto.csv");
		
		testGetNumPasajerosDestino("Madrid");
		testGetNumPasajerosDestinoPrefijo("Barcelona");
		testGetRecaudacionDestino("Barcelona");
		testGetPrimerVueloDestino("Paris");
		testGetPrimerVueloDestinoMenorPrecio("Madrid");
		
	}
	
	private static void testGetNumPasajerosDestino(String destino) {
		
		System.out.println("===testGetNumPasajerosDestino ===");
		System.out.println("Pasajeros con destino " + destino + ": " + VuelosB2.getNumPasajerosDestino(destino));
		
	}
	
	private static void testGetNumPasajerosDestinoPrefijo(String s) {
		
		System.out.println("===testGetNumPasajerosDestinoPrefijo ===");
		System.out.println("Pasajeros con destino que empieza por " + s + ": " + VuelosB2.getNumPasajerosDestinoPrefijo(s));
		
	}
	
	private static void testGetRecaudacionDestino(String destino) {
		
		System.out.println("===testGetRecaudacionDestino ===");
		System.out.println("Recaudación de los vuelos a " + destino + ": " + VuelosB2.getRecaudacionDestino(destino));
		
	}
	
	private static void testGetPrimerVueloDestino(String destino) {
		
		System.out.println("===testGetPrimerVueloDestino ===");
		System.out.println("Primer vuelo a " + destino + ": " + VuelosB2.getPrimerVueloDestino(destino));
		
	}
	
	private static void testGetPrimerVueloDestinoMenorPrecio(String destino) {
		
		System.out.println("===testGetPrimerVueloDestinoMenorPrecio ===");
		System.out.println("Primer vuelo a " + destino + " con menor precio: " + VuelosB2.getPrimerVueloDestinoMenorPrecio(destino));
		
	}

}
