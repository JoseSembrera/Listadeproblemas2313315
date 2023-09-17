import java.util.Scanner;
public class Main {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de horas trabajadas a la semana: ");        
        double horasTrabajadas = scanner.nextDouble();
        double tarifaPorHora = 12.0;
        double salarioSemanal = horasTrabajadas * tarifaPorHora;      
        System.out.println("El salario semanal del empleado es: " + salarioSemanal + " euros");
    }
}
