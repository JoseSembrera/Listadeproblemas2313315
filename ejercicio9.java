import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de horas trabajadas esta semana: ");
        int horasTrabajadas = scanner.nextInt();
        double tarifaHoraNormal = 12.0;
        double tarifaHoraExtra = 16.0;
        int horasNormales = 40;
        double salario = 0.0;
        if (horasTrabajadas <= horasNormales) {
        salario = horasTrabajadas * tarifaHoraNormal;
        }
        else {
        salario = (horasNormales * tarifaHoraNormal) + ((horasTrabajadas - horasNormales) * tarifaHoraExtra);
       }
        System.out.println("El salario semanal es: " + salario + " soles");
    }
}
