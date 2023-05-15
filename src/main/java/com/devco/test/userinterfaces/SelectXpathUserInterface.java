package com.devco.test.userinterfaces;

import com.devco.test.utils.Constant;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl(value = Constant.URL_DEVCO)
public class SelectXpathUserInterface extends PageObject {

    public static Target NOTAS_BTN = Target.the("Notas Button").locatedBy("(//*[@id='richtextnote-tab' and contains (.,{0})])[1]");
    public static Target NEGRILLA_BTN = Target.the("Negrita Button").located(By.xpath("(//*[@class='ck ck-button ck-off'])[1]"));
    public static Target NOTA_INPUT = Target.the("Nota Input").located(By.id("editor"));
    public static Target GUARDAR_BTN = Target.the("Guardar Button").located(By.id("dropdownMenuLink2"));
}
