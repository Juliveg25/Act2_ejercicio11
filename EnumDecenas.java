public enum EnumDecenas {
    CERO(""),
    DIEZ("X"),
    VEINTE("XX"),
    TREINTA("XXX"),
    CUARENTA("XL"),
    CINCUENTA("L"),
    SESENTA("LX"),
    SETENTA("LXX"),
    OCHENTA("LXXX"),
    NOVENTA("XC");

    private final String valor;

    EnumDecenas(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}