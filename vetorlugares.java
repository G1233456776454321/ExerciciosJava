import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
      String[] lugares = new String[20];
      Scanner leitor = new Scanner(System.in);
      int numero = 0;
      String nome;
      do {
          System.out.printf("\n Informe a poltrona a reservar: ");
          numero = leitor.nextInt();
          if (lugares[numero] != null) {
              System.out.printf("\n Lugar ja ocupado\n");
          } else {
              System.out.printf("\nInforme seu nome para ser registrado: ");
              nome = leitor.next();
              lugares[numero] = nome;
          }
      }while (true);
   }
}
