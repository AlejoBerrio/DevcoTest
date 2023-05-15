package com.devco.test.models;

public class NotasModelo {

    private String tipoNota;
    private String texto;

    public NotasModelo(String tipoNota, String texto) {
        this.tipoNota = tipoNota;
        this.texto = texto;
    }

    public String getTipoNota() {
        return tipoNota;
    }

    public String getTexto() {
        return texto;
    }
}
