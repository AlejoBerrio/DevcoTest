package com.devco.test.models;

public class NotasModelo {

    private String tipoNota;
    private String nota;

    public NotasModelo(String tipoNota, String nota) {
        this.tipoNota = tipoNota;
        this.nota = nota;
    }

    public String getTipoNota() {
        return tipoNota;
    }

    public String getNota() {
        return nota;
    }
}
