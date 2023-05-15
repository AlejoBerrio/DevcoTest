package com.devco.test.stepdefinitions;

import com.devco.test.models.NotasModelo;
import com.devco.test.tasks.ClicNegrilla;
import com.devco.test.tasks.GuardarNota;
import com.devco.test.tasks.InsertarTexto;
import com.devco.test.tasks.SeleccionarTipoNota;
import com.devco.test.userinterfaces.SelectXpathUserInterface;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class TestDevcoStepDefinition {


    @Managed(driver = "chrome")
    public static WebDriver browser;
    public static Actor actorName = Actor.named("Test");

    static{
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void openBrowser() {
        actorName.can(BrowseTheWeb.with(browser));
        actorName.wasAbleTo(Open.browserOn(new SelectXpathUserInterface()));
    }

    @Given("^que el usuario hace clic en notas$")
    public void queElUsuarioHaceClicEnNotas(List<NotasModelo> notas) {
        actorName.wasAbleTo(SeleccionarTipoNota.conTexto(notas.get(0)));

    }

    @When("^el usuario haga clic el icono de negrilla$")
    public void elUsuarioHagaClicElIconoDeNegrilla() {
        actorName.attemptsTo(ClicNegrilla.negrilla());
    }

    @When("^y el usuario ingresa el texto$")
    public void yElUsuarioIngresaElTexto(List<NotasModelo> notas) {
        actorName.attemptsTo(InsertarTexto.conTexto(notas.get(0)));
    }

    @Then("^el usuario puede guardar y descargar la nota$")
    public void elUsuarioPuedeGuardarYDescargarLaNota() {
        actorName.attemptsTo(GuardarNota.guardar());
    }

}
