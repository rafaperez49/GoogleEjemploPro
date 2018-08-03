package co.com.bancolombia.certification.google.stepdefinitions;

import static co.com.bancolombia.certification.google.ui.Webpage.GOOGLE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import org.openqa.selenium.WebDriver;

import co.com.bancolombia.certification.google.model.Traduzca;
import co.com.bancolombia.certification.google.questions.ElResultado;
import co.com.bancolombia.certification.google.tasks.AbrirElNavegador;
import co.com.bancolombia.certification.google.tasks.IrA;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class GoogleTranslateStepDefinitions {
	
	@Managed(driver="chrome")
	private WebDriver suNavegador;
	private Actor rafa = Actor.named("Rafa");
	
	
	
	@Before
	public void preparacionDeLaPrueba()
	{
		rafa.can(BrowseTheWeb.with(suNavegador));
	}
	
	@Given("^Que Rafa quiere usar el traductor de google$")
	public void queRafaQuiereUsarElTraductorDeGoogle() {
		rafa.wasAbleTo(AbrirElNavegador.en(GOOGLE.page()), 
					   IrA.laAplicacion());
	}

	@When("^el traduce la palabra (.*) del (.*) al (.*)$")
	public void elTraduceLaPalabraTableDelInglesAlEspanol(String palabra, String lenguajeOrigen, String lenguajeDestino) {
		//rafa.attemptsTo(Traducir.LaExpresionConformadaPor(idioma1, idioma2, palabra));
		rafa.attemptsTo(Traduzca.LaExpresionConstruidaPor().la(palabra).del(lenguajeOrigen).al(lenguajeDestino));
	}

	@Then("^el deberia ver la palabra (.*) en la pantalla$")
	public void elDeberiaVerLaPalabraMesaEnLaPantalla(String palabraEsperada){
		
		rafa.should(seeThat(ElResultado.is(), equalTo(palabraEsperada)));
	}

}