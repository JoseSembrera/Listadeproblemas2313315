import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Ingresa la cantidad en euros a convertir: ");
        double cantidadEuros = Scanner.nextDouble();
        double valorEuroEnPesetas = 166.386;
        double cantidadPesetas = cantidadEuros * valorEuroEnPesetas;
        System.out.println(cantidadEuros + " euros son equivalentes a " + cantidadPesetas + " pesetas.");
    }
}

