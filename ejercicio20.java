import java.util.Scanner;
    public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero (long): ");
        long numero = scanner.nextLong();
        System.out.print("Dígitos pares: ");
        long sumaDigitosPares = 0;
        String numeroStr = Long.toString(numero);
        for (int i = 0; i < numeroStr.length(); i++) {
            char digitoChar = numeroStr.charAt(i);
            int digito = Character.getNumericValue(digitoChar);
            if (digito % 2 == 0) {
            System.out.print(digito + " ");
                sumaDigitosPares += digito;
            }
        }
        if (sumaDigitosPares == 0) {
            System.out.println("No hay dígitos pares en el número.");
        } else {
            System.out.println("\nSuma de dígitos pares: " + sumaDigitosPares);
        }
    }
}
