import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la nota del primer examen (40%): ");
        double notaPrimerExamen = scanner.nextDouble();

        System.out.print("Que nota quieres sacar en el trimestre: ");
        double sacareneltrimestre = scanner.nextDouble();

        double notaSegundoExamen = ((sacareneltrimestre * 100) / 60) - ((notaPrimerExamen * 40) / 60);

        System.out.println("Para tener nota deseada en el trimestre debe sacar " + notaSegundoExamen + " en el segundo examen .");

    }
}
