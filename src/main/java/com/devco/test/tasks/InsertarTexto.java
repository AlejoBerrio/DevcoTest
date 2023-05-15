package com.devco.test.tasks;

import com.devco.test.models.NotasModelo;
import com.devco.test.userinterfaces.SelectXpathUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class InsertarTexto implements Task {

    private String texto;

    public InsertarTexto(NotasModelo notasModelo) {
        this.texto = notasModelo.getTexto();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SelectXpathUserInterface.NOTA_INPUT.of(texto)
                ));
    }

    public static InsertarTexto conTexto(NotasModelo notasModelo) {
        return Tasks.instrumented(InsertarTexto.class, notasModelo);
    }
}
