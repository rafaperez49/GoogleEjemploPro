package co.com.bancolombia.certification.google.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleAppsComponent {
	
	public static final Target BOTON_APPS = Target.the("Botón de aplicaciones de google").located(By.id("gbwa"));
	public static final Target BOTON_GOOGLE_TRANSLATE = Target.the("Botón de app traductor").located(By.id("gb51"));

}
