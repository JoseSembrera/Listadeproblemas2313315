import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el día de la semana (1 para lunes, 2 para martes, 3 para miercoles, 4 para jueves, 5 para viernes): ");
        int diaSemana = scanner.nextInt();
        System.out.print("Introduce la hora (0-23): ");
        int hora = scanner.nextInt();
        System.out.print("Introduce los minutos (0-59): ");
        int minutos = scanner.nextInt();
        int minutosHastaFinDeSemana = 0;
        if (diaSemana == 5 && hora >= 15) {
        System.out.println("¡Ya es fin de semana!");
        } else {
        minutosHastaFinDeSemana += (24 - hora - 1) * 60 + (60 - minutos);
        for (int i = diaSemana + 1; i <= 4; i++) {
        minutosHastaFinDeSemana +=24 * 60;
        }
        minutosHastaFinDeSemana += (15 - hora) * 60;
        }
        System.out.println("Minutos hasta el fin de semana: " + minutosHastaFinDeSemana);
    }
}
