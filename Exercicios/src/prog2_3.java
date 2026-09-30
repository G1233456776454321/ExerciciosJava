import java.util.Scanner;
public class prog1 {
    public static void main(String[] args){
        double altura;
        int contador=0;
        double soma=0;
        double soma2=0;
        int contador2=0;
        boolean triggersafe;
        Scanner leitor = new Scanner(System.in);
        do {
            System.out.println("\nDigite true ou false: ");
            triggersafe = leitor.nextBoolean();
            if (triggersafe==true){
                System.out.println("Digite a altura: ");
                altura = leitor.nextDouble();
                if (altura>1.80){
                    soma2 += altura;
                    contador2++;
                }
                else {
                    soma += altura;
                    contador++;
                }
            }
            else {
                double media = soma/contador;
                double media2 = soma2+contador2;
                System.out.println("\n=============\n");
                System.out.println("\n=============\n");
                System.out.println("A média é");
                System.out.printf("%.2f",media);
                System.out.println("A média de pessoas com >1.80");
                System.out.println(media2);
                System.out.println("\n=============\n");
                System.out.println("\n=============\n");
            }
        }while (true);

    }
}
