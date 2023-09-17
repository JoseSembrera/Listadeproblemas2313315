import java.util.Scanner;

    public class Main 
    {
    
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de Megabytes (MB): ");
        double megabytes = scanner.nextDouble();

        double kilobytes = megabytes * 1024;

        System.out.println(megabytes + " MB equivale a " + kilobytes + " KB");

    }
}
