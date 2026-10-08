import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite o numerador (inteiro): ");
            int numerador = scanner.nextInt();

            System.out.print("Digite o divisor (inteiro): ");
            int divisor = scanner.nextInt();

            int resultado = numerador / divisor;
            System.out.println("Resultado da divisão: " + resultado);
        }
        catch (ArithmeticException e){
            System.out.println("tu digitou o bagulho erradon não pode dividir por 0");
        }
        catch (InputMismatchException e){
            System.out.println("tu digitou o bagulho erradon não pode dividir por 0");
        }
        scanner.close();
    }
}
