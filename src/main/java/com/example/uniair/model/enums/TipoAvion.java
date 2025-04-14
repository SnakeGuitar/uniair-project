package com.example.uniair.model.enums;

public enum TipoAvion {
    COMERCIAL("Comercial"),
    PRIVADO("Privado");

    private final String tipo;

    TipoAvion(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
