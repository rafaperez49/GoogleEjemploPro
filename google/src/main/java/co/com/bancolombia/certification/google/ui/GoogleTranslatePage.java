package co.com.bancolombia.certification.google.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleTranslatePage {
	
	public static final Target BOTON_LENGUAJE_ORIGEN = Target.the("Botón del idioma origen").located(By.id("gt-sl-gms"));
	public static final Target BOTON_LENGUAJE_DESTINO = Target.the("Botón del idioma destino").located(By.id("gt-tl-gms"));
	public static final Target OPCION_ORIGEN= Target.the("El primer idioma").locatedBy("//div[@id='gt-sl-gms-menu']/table/tbody/tr/td//div[contains(text(), '{0}')]");
	public static final Target OPCION_DESTINO = Target.the("El segundo idioma").locatedBy("//div[@id='gt-tl-gms-menu']/table/tbody/tr/td//div[contains(text(), '{0}')]");
	public static final Target AREA_DE_TRADUCCION =Target.the("El lugar donde se escriben las palabras a traducir").located(By.id("source"));
	public static final Target BOTON_TRADUCIR = Target.the("El botón traducir").located(By.id("gt-lang-submit"));
	public static final Target AREA_TRADUCIDA = Target.the("El área donde ya se tradujo la palabra").located(By.id("gt-res-dir-ctr"));
	
}
