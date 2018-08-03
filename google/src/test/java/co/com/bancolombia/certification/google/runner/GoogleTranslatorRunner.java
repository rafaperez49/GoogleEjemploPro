package co.com.bancolombia.certification.google.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/googleTranslate.feature",
				 glue = "co.com.bancolombia.certification.google.stepdefinitions",
				 snippets=SnippetType.CAMELCASE, tags="@traducir2"
		)
public class GoogleTranslatorRunner {

}