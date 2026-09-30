import java.util.Scanner;
public class prog1 {
    public static void main(String[] args){
        double altura;
        int contador=0;
        double soma=0;
        boolean triggersafe;
        Scanner leitor = new Scanner(System.in);
        do {
            System.out.println("\nDigite true ou false: ");
            triggersafe = leitor.nextBoolean();
            if (triggersafe==true){
                System.out.println("Digite a altura: ");
                altura = leitor.nextDouble();
                soma += altura;
                contador++;
            }
            else {
                double media = soma/contador;
                System.out.println("A média é");
                System.out.printf("%.2f",media);
            }
        }while (true);

    }
}
