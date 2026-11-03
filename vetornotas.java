import java.util.Scanner;
public class Main {
   public static void main(String[] args){
      int distancia = 99999;
      double[] notas = new double[distancia];
      Scanner leitor = new Scanner(System.in);
      double soma = 0;
      do {
          System.out.println("Informe a quantidade de notas a digitar");
          distancia = leitor.nextInt();
          for (int i =0; i < notas.length;i++){
              System.out.println("Digite a nota "+i+":");
              notas[i] = leitor.nextDouble();
          }
          System.out.println("======NOTAS E MEDIA=======");
          for (int i =0;i < notas.length;i++){
              System.out.println("A nota "+i+" é "+notas[i]);
              soma = soma + notas[i];
          }
          System.out.println("A média é: "+soma);

      }while (true);



   }
}
