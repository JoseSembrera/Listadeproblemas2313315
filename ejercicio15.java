import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int combinacionCorrecta = 4578; 
        int intentos = 4;
        while (intentos > 0) {
        System.out.print("Introduce la combinación de 4 cifras: ");
        int intento = scanner.nextInt();
        if (intento == combinacionCorrecta) {
        System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
        break;
        } 
        else {
        System.out.println("Lo siento, esa no es la combinación.");
        intentos--;}
        if (intentos > 0) {
        System.out.println("Te quedan " + intentos + " intentos.");
        } 
        else {
        System.out.println("Te has quedado sin intentos. La caja fuerte está bloqueada.");
        }
    }           
        }
}
