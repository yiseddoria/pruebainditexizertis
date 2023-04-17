package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.InicioGoogle;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.proyectobase.screenplay.userinterface.InicioGoogle.BOTON_ACEPTAR;

public class Abrir implements Task {
    InicioGoogle inicioGoogle;

    public static Abrir laPagina() {
        return Tasks.instrumented(Abrir.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(inicioGoogle));
        actor.attemptsTo(Check.whether(BOTON_ACEPTAR.resolveFor(actor).isEnabled()).andIfSo(
                Click.on(BOTON_ACEPTAR)));
    }
}
