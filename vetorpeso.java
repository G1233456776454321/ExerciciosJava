import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
      double[] categorias = {0, 55, 65, 75, 85, 100};
      String[] categorias_nomes = {"pena", "leve", "médio", "meio-pesado", "pesado", "super-pesado"};
      Scanner leitor = new Scanner(System.in);
      double numero = 0;
      do {
          System.out.println("Digite seu peso:");
           numero = leitor.nextDouble();
           for (int i = 0; i < categorias.length; i++){
               if (numero < categorias[i]){
                   System.out.println("Sua categoria de peso é: "+categorias_nomes[i-1]);
                   break;
               }
           }
       }while (true);
   }
}
