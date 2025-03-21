package www.com.automatizacion.stepdefinitions.hook;

import io.cucumber.java.Before;

import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.hamcrest.Matchers;
import www.com.automatizacion.hook.OpenWeb;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static www.com.automatizacion.utils.Constants.TIME_SHORT;
import static www.com.automatizacion.utils.Constants.TITLE;
import static www.com.automatizacion.utils.Time.waiting;


public class Hooks {

    //ayuda a parametizar las acciones del Actor// inicializa el Actor
    @Before
    public void setTheStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{string} abre el sitio web de pruebas")
    public void abreElSitioWebDePruebas(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(
                OpenWeb.broserURL()
        );
        //espera implicita
        waiting(TIME_SHORT);

        //creamos un metodo para verificar por medio de un string enviado como constante que la página cargue y que sea la correcta
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        TheWebPage.title(),
                        Matchers.containsString(TITLE)
                )
        );
    }









}
