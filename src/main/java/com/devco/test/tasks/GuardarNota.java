package com.devco.test.tasks;

import com.devco.test.userinterfaces.SelectXpathUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GuardarNota implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SelectXpathUserInterface.GUARDAR_BTN)
        );
    }
    public static GuardarNota guardar(){
        return instrumented(GuardarNota.class);
    }
}
