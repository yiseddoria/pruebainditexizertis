package co.com.proyectobase.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;

import static co.com.proyectobase.screenplay.userinterface.RealizarBusqueda.*;

public class Realizar implements Task {

    private final String palabra;

    public Realizar(String palabra) {
        this.palabra = palabra;
    }

    public static Realizar busqueda(String palabra) {
        return Tasks.instrumented(Realizar.class, palabra);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(palabra).into(INPUT_BUSCADOR_GOOGLE).thenHit(Keys.ENTER));
        actor.attemptsTo(Click.on(LINK_RESULTADO_BUSQUEDA));
        actor.attemptsTo(Scroll.to(TITULO));
    }
}
