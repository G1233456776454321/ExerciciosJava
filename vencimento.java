import java.util.Scanner;

// peça pra digitar o dia e o mês de vencimento
// se a data for inválida, reclame
// não precisa repetir
public class Main {
   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);

       // esse é um jeito de declarar vetores já preenchidos
       int[] tamanhoMes = {0,31,20,31,30,31,30,31,31,30,31,30,31};

       System.out.print("Digite o dia de vencimento: ");
       int dia = entrada.nextInt();
       System.out.print("Digite o mês de vencimento: ");
       int mes = entrada.nextInt();

       // agora diga se essa data é válida
       if (dia > tamanhoMes[mes] || mes>12 || mes <1 ||dia < 1){
           System.out.println("data inválida");

       }
       else {
           System.out.println("data agendada");
       }
   }
}
