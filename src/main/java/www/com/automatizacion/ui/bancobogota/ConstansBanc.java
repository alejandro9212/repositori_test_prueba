package www.com.automatizacion.ui.bancobogota;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.shadow.ByShadow;
import org.openqa.selenium.By;

public class ConstansBanc {
    public static final Target SHADOW_HOST = Target.the("Host del Shadow Dom")
            .located(ByShadow.cssSelector(".minicard", ".hydrated"));

    public static final  Target BTNcLICK = Target.the("btn productos")
            .located(By.xpath("//button[@id='mainmenu-button-11115559']/span"));

    public static final  Target DIVTEXT = Target.the("div text")
            .located(By.xpath("//div[@class='l-container l-p-y-7 l-p-y-tablet-9 bg-sherpa-white']"));

  public  static final  Target LI_CLICK = Target.the("div nuestro")
            .located(By.xpath("//div[@class='l-container l-p-y-7 l-p-y-tablet-9 bg-sherpa-white']//ul//li[4]"));


    //This Element is inside single shadow DOM.
    /*String cssSelectorForHost1 = "#expand-card";
Thread.sleep(1000);
    SearchContext shadow = driver.findElement(By.cssSelector("#expand-card")).getShadowRoot();
Thread.sleep(1000);
shadow.findElement(By.cssSelector(".minicard-image-white"));*/


}
