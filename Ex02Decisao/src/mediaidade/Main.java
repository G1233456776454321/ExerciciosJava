import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        do {
            Scanner leitor = new Scanner(System.in);
            int idade1 = 0;
            int idade2 = 0;
            double quantidade1 = 0;
            double quantidade2 = 0;
            double soma1 = 0;
            double soma2 = 0;
            double media1 = soma1 / quantidade1;
            double media2 = soma2 / quantidade2;
            boolean trigger2 = false;
            do {
                int opcao = 0;
                System.out.println("\nEscreva 1 para adiconar pessoas ou 2 para mostar a media");
                opcao = leitor.nextInt();

                switch (opcao) {
                    case 1: {
                        System.out.println("e estudante?");
                        boolean trigger = leitor.nextBoolean();
                        if (trigger == true) {
                            System.out.println("informe a idade");
                            idade1 = leitor.nextInt();
                            soma1 = soma1 + idade1;
                            quantidade1++;
                            break;
                        } else {
                            System.out.println("informe a idade");
                            idade2 = leitor.nextInt();
                            soma2 = soma2 + idade2;
                            quantidade2 = quantidade2 + 1;
                            break;
                        }
                    }
                    case 2: {
                       trigger2 = true;
                        break;
                    }
                }
            } while (trigger2==false);
            media1 = soma1 / (double)quantidade1;
            media2 = soma2 / (double)quantidade2;
            System.out.print("\n a media de estudantes é "+media1+" e de não estudantes é "+media2);
        }while (true);
    }
}
