
public class NumerosRomanos {
    private int numeroIngresado;

    public void setNumeroIngresado(int numeroIngresado) {
        this.numeroIngresado = numeroIngresado;
    }

    public int getNumeroIngresado() {
        return numeroIngresado;
    }

    public int decenasDosDigitos() {
        return(getNumeroIngresado() / 10) % 10;
        //la cifra de las decenas de ese número.
    }

    public int unidadesDosDigitos() {
        return getNumeroIngresado() % 10;
        // la cifra de las unidades de ese número.
    }

    public String unidadesUnDigito(int enteroIngresado){
        return EnumRomanos.values()[enteroIngresado].getValor(); //unidades traidas desde Enum
    }

    public String decenasUnDigito(int enteroIngresado){
        return EnumDecenas.values()[enteroIngresado].getValor(); //decenas traidas desde Enum
    }

}