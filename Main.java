import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumerosRomanos numerosRomanos = new NumerosRomanos();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero: ");
        numerosRomanos.setNumeroIngresado(scanner.nextInt());
        scanner.close();

        int enteroIngresado = numerosRomanos.getNumeroIngresado();

        if (enteroIngresado < 0 || enteroIngresado >= 100) {
            System.out.println("Error, el número ingresado tiene 3 o más dígitos, o es negativo.");
        } else {
            if (enteroIngresado >= 10) {
                int valor1 = numerosRomanos.decenasDosDigitos();
                int valor2 = numerosRomanos.unidadesDosDigitos();

                if (valor1 >= 0 && valor1 <= 9) {
                    String resultado = numerosRomanos.decenasUnDigito(valor1);
                    String resultado2 = numerosRomanos.unidadesUnDigito(valor2);
                    System.out.println("El numero romano es: " + resultado + resultado2);
                }
            } else if (enteroIngresado >= 0 && enteroIngresado <= 9){
                System.out.println("El numero romano es: " + numerosRomanos.unidadesUnDigito(enteroIngresado));
            }
        }
    }
}