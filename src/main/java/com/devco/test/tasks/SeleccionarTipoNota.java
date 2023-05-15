package com.devco.test.tasks;

import com.devco.test.models.NotasModelo;
import com.devco.test.userinterfaces.SelectXpathUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarTipoNota implements Task {

    private String tipoNota;

    public SeleccionarTipoNota(NotasModelo notasModelo) {
        this.tipoNota = notasModelo.getTipoNota();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SelectXpathUserInterface.NOTAS_BTN.of(tipoNota)
        ));
    }

    public static SeleccionarTipoNota conTexto(NotasModelo notasModelo) {
        return Tasks.instrumented(SeleccionarTipoNota.class, notasModelo);
    }
}
