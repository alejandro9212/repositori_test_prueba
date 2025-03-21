package www.com.automatizacion.stepdefinitions;

import io.cucumber.java.en.*;


import www.com.automatizacion.task.Login;
import www.com.automatizacion.utils.ReadExcel;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static www.com.automatizacion.utils.Constants.ACTOR;


public class iniciosesion {
    private List<List<String>> excelData;
    private ReadExcel readDataLogin;
    String filePath = "src/test/resources/data/data.xlsx";


    public iniciosesion () {
        this.readDataLogin = new ReadExcel();
    }


    @Given("tengo usuario password validas")
    public void tengoUsuarioPasswordValidas() {

        //creo un variable tipo list donde le envió el filePath al metodo creado en la clase readexcel
       excelData = readDataLogin.cargarDatos(filePath);
        String usuario = excelData.get(1).get(0);
        String pass = excelData.get(1).get(1);
        theActorCalled(ACTOR).attemptsTo(
                Login.autenticLogin(usuario, pass)
        );



    }
    @When("selecciona aleatoriamente alguna de las subfunciones")
    public void seleccionaAleatoriamenteAlgunaDeLasSubfunciones() {
        // Ejemplo: Usar la primera fila y primera columna como ejemplo


    }
    @Then("visualizara en la cabecera el nombre de la opción elegida")
    public void visualizaraEnLaCabeceraElNombreDeLaOpciónElegida() {

    }

}
