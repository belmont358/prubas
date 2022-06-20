package co.com.sofka.util;

public enum ValidationMesages {
    ERROR_CONTACTO("Indica el asunto."),
    SUCCES_CONTACTO("Gracias por contactarnos"),
    ERROR_LOGIN_ONE_FIELD("Indica usuario y clave."),
    ERROR_LOGIN_ALL_FIELDS("Datos incorrectos o cuenta de usuario no activada."),
    ERROR_NO_POLITICS_SELECTED("Para continuar debes marcar \"He leído y acepto las políticas\"."),
    SUCCES_REGISTER("");
    private final String value;
    public String getValue() {
        return value;
    }

    ValidationMesages(String value) {
        this.value = value;
    }
}
