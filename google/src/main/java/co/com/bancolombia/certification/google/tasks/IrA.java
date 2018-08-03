package co.com.bancolombia.certification.google.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certification.google.ui.GoogleAppsComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;;

public class IrA implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(GoogleAppsComponent.BOTON_APPS),
						Click.on(GoogleAppsComponent.BOTON_GOOGLE_TRANSLATE));
		
	}

	public static IrA laAplicacion() {
		
		return instrumented(IrA.class);
	}

}
