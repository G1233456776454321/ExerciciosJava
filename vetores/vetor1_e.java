import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      int[] vendas = new int[3];
      int quantidade = 0;
      int produto = 0;
      boolean trigger = false;
      Scanner leitor = new Scanner(System.in);
      do {
          try {
              System.out.println("Digite o produto(1 a 3) ou 0 para mostrar o resultado: ");
              produto = leitor.nextInt();


              if (produto == 1) {
                  System.out.println("digite o produto 1: ");
                  quantidade = leitor.nextInt();
                  vendas[0] += quantidade;
              } else if (produto == 2) {
                  System.out.println("digite o produto 2: ");
                  quantidade = leitor.nextInt();
                  vendas[1] += quantidade;
              } else if (produto == 3) {
                  System.out.println("digite o produto 3: ");
                  quantidade = leitor.nextInt();
                  vendas[2] += quantidade;
                  } else {
                      trigger = true;}

              System.out.println(vendas[0] + " venda 1");
              System.out.println(vendas[1] + " venda 2");
              System.out.println(vendas[2] + " venda 3");
          } catch (Exception e){
              System.out.println("Erro por conta de: "+e.getLocalizedMessage());
          }

      } while (true) ;
    }
}
