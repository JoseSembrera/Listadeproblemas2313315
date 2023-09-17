import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la hora (0-23): ");
        int horas = scanner.nextInt();
        System.out.print("Ingrese los minutos (0-59): ");
        int minutos = scanner.nextInt();
        if (horas < 0 || horas > 23 || minutos < 0 || minutos > 59) {
            System.out.println("Hora o minutos ingresados no válidos.");
        } 
        else {
        int segundosHastaMedianoche = ((23 - horas) * 3600) + ((59 - minutos) * 60);

        System.out.println("Segundos hasta la medianoche: " + segundosHastaMedianoche + " segundos");
        }
    }
}
