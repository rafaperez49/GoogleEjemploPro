package co.com.bancolombia.certification.google.model;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certification.google.tasks.Traducir;

public class TraduzcaBuilder {

	
	private String palabra;
	private String lenguajeOrigen;
	
	public TraduzcaBuilder la(String palabra) {
		this.palabra=palabra;
		return this;
	}
	
	public TraduzcaBuilder del(String lenguajeOrigen)
	{
		this.lenguajeOrigen=lenguajeOrigen;
		return this;
	}
	
	public Traducir al(String lenguajeDestino)
	{
		return instrumented(Traducir.class, lenguajeOrigen, lenguajeDestino, palabra);
		
	}
	
	
	

}
