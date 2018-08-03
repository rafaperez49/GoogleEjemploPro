package co.com.bancolombia.certification.google.tasks;

import co.com.bancolombia.certification.google.ui.GoogleTranslatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Traducir implements Task{

	private String LENGUAJE_ORIGEN;
	private String LENGUAJE_DESTINO;
	private String palabra;
	
	
	public Traducir(String LENGUAJE_ORIGEN, String LENGUAJE_DESTINO, String palabra)
	{
		this.LENGUAJE_ORIGEN=LENGUAJE_ORIGEN;
		this.LENGUAJE_DESTINO=LENGUAJE_DESTINO;
		this.palabra=palabra;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(GoogleTranslatePage.BOTON_LENGUAJE_ORIGEN), 
						 Click.on(GoogleTranslatePage.OPCION_ORIGEN.of(LENGUAJE_ORIGEN)), 
						 Click.on(GoogleTranslatePage.BOTON_LENGUAJE_DESTINO), 
						 Click.on(GoogleTranslatePage.OPCION_DESTINO.of(LENGUAJE_DESTINO)), 
						 Enter.theValue(palabra).into(GoogleTranslatePage.AREA_DE_TRADUCCION), 
						 Click.on(GoogleTranslatePage.BOTON_TRADUCIR));
					
					
		
	}

	public static Traducir LaExpresionConformadaPor(String idioma1, String idioma2, String palabra) {
		
		return Tasks.instrumented(Traducir.class, idioma1,idioma2, palabra );
	}
	
	
	

}
