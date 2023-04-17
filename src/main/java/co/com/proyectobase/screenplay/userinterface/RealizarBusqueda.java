package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RealizarBusqueda extends PageObject {
    public static Target INPUT_BUSCADOR_GOOGLE = Target.the("Buscador de google").locatedBy("//*[@id='APjFqb']");
    public static Target LINK_RESULTADO_BUSQUEDA = Target.the("Resultado buscador de google").locatedBy("//h3[contains(text(),'Wikipedia')]");
    public static Target TITULO = Target.the("Titulo obtenido que me permite realizar scroll").locatedBy("//h3/span[contains(text(), 'Historia')]");
    public static Target TXT_MENSAJE = Target.the("Texto mensaje de validación del año del primer proceso automatico").locatedBy("//p[contains(text(), '300')]");
}
