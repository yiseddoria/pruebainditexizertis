package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.questions.VerificarAnio;
import co.com.proyectobase.screenplay.tasks.Abrir;
import co.com.proyectobase.screenplay.tasks.Realizar;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BuscarEnGoogleStepDefinitions {

    @Dado("^que el (.*) accede a la pagina de google$")
    public void queElUsuarioAccedeALaPaginaDeGoogle(String nombreActor) {
        theActorCalled(nombreActor);
        theActorInTheSpotlight().wasAbleTo(Abrir.laPagina());
    }

    @Cuando("^realiza la busqueda de la palabra (.*)$")
    public void realizaLaBusquedaDeLaPalabra(String palabra) {
        theActorInTheSpotlight().attemptsTo(Realizar.busqueda(palabra));
    }


    @Entonces("^valida que el año en que se hizo el primer proceso automatico es (.*)$")
    public void validaQueElAñoEnQueSeHizoElPrimerProcesoAutomaticoEs(String anioEsperado) {
        theActorInTheSpotlight().should(seeThat(VerificarAnio.delPrimerProcesoAutomatico(anioEsperado)));
    }

}
