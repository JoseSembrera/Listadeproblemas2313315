import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero de hasta 5 dígitos: ");
        int numero = scanner.nextInt();
        int numeroAbsoluto = Math.abs(numero);
        String numeroStr = Integer.toString(numeroAbsoluto);
        if (numeroStr.length() > 5) {
        System.out.println("El número ingresado tiene más de 5 dígitos.");
        } else 
        {
        int cantidadDigitos = numeroStr.length();
        if (numero < 0) {
            cantidadDigitos--; 
            }
        System.out.println("El número " + numero + " tiene " + cantidadDigitos + " dígitos.");
        }
    }
}
