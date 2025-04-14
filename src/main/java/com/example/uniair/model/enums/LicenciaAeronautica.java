package com.example.uniair.model.enums;

public enum LicenciaAeronautica {
    PILOTO_PRIVADO("Piloto Privado"),
    PILOTO_COMERCIAL("Piloto Comercial"),
    PILOTO_INSTRUMENTAL("Piloto Instrumental"),
    PILOTO_DE_TRANSPORTE_DE_LINEA_AEREA("Piloto de Transporte de Línea Aérea");

    private final String licencia;

    LicenciaAeronautica(String licencia) {
        this.licencia = licencia;
    }

    public String getLicencia() {
        return licencia;
    }

}
