package com.example.uniair.model.enums;

public enum ClaseBoleto {
    TURISTA,
    EJECUTIVA,
    PRIMERA_CLASE;

    public static ClaseBoleto fromString(String clase) {
        for (ClaseBoleto c : ClaseBoleto.values()) {
            if (c.name().equalsIgnoreCase(clase)) {
                return c;
            }
        }
        throw new IllegalArgumentException("Clase de boleto no válida: " + clase);
    }
}
