package com.devco.test.tasks;

import com.devco.test.userinterfaces.SelectXpathUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClicNegrilla implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SelectXpathUserInterface.NEGRILLA_BTN)
        );
    }
    public static ClicNegrilla negrilla(){
        return instrumented(ClicNegrilla.class);
    }
}
