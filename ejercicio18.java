import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese un número límite: ");
    int numeroLimite = sc.nextInt();
    System.out.print("Ingrese otro número para verificar divisibilidad: ");
    int numeroDivisor = sc.nextInt();
    System.out.println("Números enteros positivos menores a " + numeroLimite + " que no son divisibles por " + numeroDivisor + ":");

    for (int i = 1; i < numeroLimite; i++) {
        if (i % numeroDivisor != 0) {
        System.out.println(i);
            }
        }
    }
}
