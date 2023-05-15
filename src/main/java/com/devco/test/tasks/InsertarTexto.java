package com.devco.test.tasks;

import com.devco.test.models.NotasModelo;
import com.devco.test.userinterfaces.SelectXpathUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class InsertarTexto implements Task {

    private String nota;

    public InsertarTexto(NotasModelo notasModelo) {
        this.nota = notasModelo.getNota();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nota).into(SelectXpathUserInterface.NOTA_INPUT)
        );
    }

    public static InsertarTexto conTexto(NotasModelo notasModelo) {
        return Tasks.instrumented(InsertarTexto.class, notasModelo);
    }
}
