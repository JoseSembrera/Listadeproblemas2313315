import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNumeros = 10;
        int numerosPositivos = 0;
        int numerosNegativos = 0;
        System.out.println("Ingrese diez números:");
        for (int i = 0; i < totalNumeros; i++) {
        System.out.print("Número " + (i + 1) + ": ");
        int numero = sc.nextInt();
        if (numero > 0) {
            numerosPositivos++;
        } 
        else 
        if (numero < 0) {
            numerosNegativos++;
            }
        }
        System.out.println("Cantidad de números positivos: " + numerosPositivos);
        System.out.println("Cantidad de números negativos: " + numerosNegativos);
    }
}
