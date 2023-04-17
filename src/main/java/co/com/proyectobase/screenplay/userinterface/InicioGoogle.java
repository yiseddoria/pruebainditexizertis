package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com")
public class InicioGoogle extends PageObject {
    public static Target BOTON_ACEPTAR = Target.the("Boton aceptar cookies").locatedBy("//*[@id='L2AGLb']/div");
}
