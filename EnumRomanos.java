
public enum EnumRomanos {
    CERO(""),
    UNO("I"),
    DOS("II"),
    TRES("III"),
    CUATRO("IV"),
    CINCO("V"),
    SEIS("VI"),
    SIETE("VII"),
    OCHO("VIII"),
    NUEVE("IX");

    private final String valor;

    EnumRomanos(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}