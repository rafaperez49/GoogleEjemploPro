package co.com.bancolombia.certification.google.tasks;

import co.com.bancolombia.certification.google.ui.GoogleHomePage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.selectactions.SelectByValueFromElement;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromTarget;

public class AbrirElNavegador implements Task{

	private GoogleHomePage googleHomePage;
	private PageObject page;
	
	public AbrirElNavegador(PageObject pages) {
		this.page=page;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		
		actor.attemptsTo(Open.browserOn(googleHomePage));
		
	}

	public static AbrirElNavegador en(PageObject page) {
		return instrumented(AbrirElNavegador.class, page);
	}

}
