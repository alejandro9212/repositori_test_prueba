package www.com.automatizacion.task;

import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.actions.Enter;


import static www.com.automatizacion.ui.orangehrm.OrangehrmConstants.*;

@Slf4j
public class Login implements Task {

    private final String usuario;
    private final String pass;




    public Login (String usuario, String pass) {

        this.usuario = usuario;
        this.pass = pass;


    }




    @Override
    @Step("{0} se autentica y acepta la alert del mensaje")
    public <T extends Actor> void performAs (T actor) {
        actor.attemptsTo(
                //WaitUntil.the(SHADOW_HOST,isVisible()).forNoMoreThan(TIME_SHORT).seconds(),
                Enter.theValue(usuario).into(TARGET_USUARIO),
                Enter.theValue(pass).into(TARGET_PASWORD ),
                Click.on(TARGET_CLICK)

        );




    }


    public static Login autenticLogin(String usuario, String pass){

        return Tasks.instrumented(Login.class, usuario, pass);
    }





}
