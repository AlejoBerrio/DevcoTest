package com.devco.test.userinterfaces;

import com.devco.test.utils.Constant;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl(value = Constant.URL_DEVCO)
public class SelectXpathUserInterface extends PageObject {

    public static Target NOTAS_BTN = Target.the("Notas Button").locatedBy("(//*[@id='richtextnote-tab' and contains (.,enriquecido)])[1]");
    public static Target NEGRILLA_BTN = Target.the("Negrita Button").located(By.xpath("(//*[@class='ck ck-button ck-off'])[1]"));
    public static Target NOTA_INPUT = Target.the("Nota Input").located(By.id("editor"));
    public static Target GUARDAR_BTN = Target.the("Guardar Button").locatedBy("//div[contains(text(),'{0}')]/following-sibling::div/button[@title='Guardar']");
    public static Target DESCARGAR_BTN = Target.the("Descargar Button").locatedBy("//div[contains(text(),'{0}')]/following-sibling::div/a[contains(text(),'Descargar')]");
}
