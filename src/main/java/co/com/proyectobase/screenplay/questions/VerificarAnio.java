package co.com.proyectobase.screenplay.questions;

import co.com.proyectobase.screenplay.exceptions.ExceptionMensajes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.proyectobase.screenplay.userinterface.RealizarBusqueda.TXT_MENSAJE;

public class VerificarAnio implements Question<String> {

    private final String anioEsperado;

    public VerificarAnio(String anioEsperado) {
        this.anioEsperado = anioEsperado;
    }

    public static VerificarAnio delPrimerProcesoAutomatico(String anioEsperado) {
        return new VerificarAnio(anioEsperado);
    }

    @Override
    public String answeredBy(Actor actor) {
        String contenidoAnio = Text.of(TXT_MENSAJE).viewedBy(actor).asString();
        String anio = contenidoAnio.substring(85, 94);
        if (!anio.equals(anioEsperado)) {
            throw new ExceptionMensajes("El anio del front " + anio + " no es igual al anio esperado " + anioEsperado);
        }
        return anio;
    }
}
