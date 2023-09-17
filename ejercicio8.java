import java.util.Scanner;
    public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
    System.out.print("Introduce la hora (solo las horas, sin minutos): ");
    int hora = scanner.nextInt();
    if (hora >= 6 && hora <= 12) {
    System.out.println("Buenos días");
    } 
    else if (hora >= 13 && hora <= 20) {
    System.out.println("Buenas tardes");
    } 
    else if ((hora >= 21 && hora <= 24) || (hora >= 0 && hora <= 5)) {
    System.out.println("Buenas noches");
    } 
}
    }
