package www.com.automatizacion.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty","html:target/cucumber-reports.html","rerun:target/rerun.txt","json:target/destination/cucumber-json"},
        features = "src/test/resources/features",
        glue = "www.com.automatizacion.stepdefinitions",
        tags = "@regression",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class TestRunner {
}
