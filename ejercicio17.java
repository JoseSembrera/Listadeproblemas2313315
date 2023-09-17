import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int sumaImpares = 0;
        int mayorPar = Integer.MIN_VALUE;
        System.out.println("Introduce números (introduce un número negativo para finalizar):");
        while (true) {
        int numero = sc.nextInt();
        if (numero < 0) {
        break;
        }
        contador++;
        if (numero % 2 != 0) {
        sumaImpares += numero;
        } 
        else 
        if (numero > mayorPar) {
        mayorPar = numero;
        }
        }
        if (contador > 0) {
        double mediaImpares = (double) sumaImpares / contador;
        System.out.println("Cantidad de números introducidos: " + contador);
        System.out.println("Media de los impares: " + mediaImpares);
        if (mayorPar != Integer.MIN_VALUE) {
        System.out.println("Mayor de los pares: " + mayorPar);
        }
        else {
        System.out.println("No se introdujeron números pares.");
        }
        } 
        else {
        System.out.println("No se introdujeron números.");
        }
    }
}
