package co.com.bancolombia.certification.google.questions;

import co.com.bancolombia.certification.google.ui.GoogleTranslatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ElResultado implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		
		return Text.of(GoogleTranslatePage.AREA_TRADUCIDA).viewedBy(actor).asString();
		
	}

	public static ElResultado is() {
		return new ElResultado();
	}

}
