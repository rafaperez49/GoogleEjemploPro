package co.com.bancolombia.certification.google.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certification.google.ui.GoogleHomePage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirElNavegador implements Task{

	private GoogleHomePage googleHomePage;
	protected PageObject page;
	
	public AbrirElNavegador(PageObject pages) {
		page=pages;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		
		actor.attemptsTo(Open.browserOn(googleHomePage));
		
	}

	public static AbrirElNavegador en(PageObject page) {
		return instrumented(AbrirElNavegador.class, page);
	}

}
