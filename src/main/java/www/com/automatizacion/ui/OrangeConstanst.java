package www.com.automatizacion.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OrangeConstanst {
    public OrangeConstanst () {
    }
    public static final Target LIST_PRIM = Target.the("Host del Shadow Dom")
            .located(By.xpath("//input[@name=\"username\"]"));
}
