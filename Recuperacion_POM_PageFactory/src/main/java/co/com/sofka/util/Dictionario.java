package co.com.sofka.util;

public enum Dictionario {
    ACEITE("Aceite"),
    PAGINA_NO_ENCONTRADA("La página no ha sido encontrada"),
    MEDELLIN("Medellín"),
    ENVIGADO("Exito Envigado");

    private final String value;

    Dictionario(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
