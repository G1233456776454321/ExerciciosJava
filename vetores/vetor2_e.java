import java.util.Scanner;

public class main2 {
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
                vendas[produto-1] += quantidade;
                if (produto == 0) {
                    trigger = true;
                    for (int i =0;i< vendas.length;i++) {
                        System.out.println("O valor de " + i + vendas[i]);
                    }
                } else if (produto <1 || produto > vendas.length){
                    System.out.println("Erro de endereço");
                }

            } catch (Exception e){
                System.out.println("Erro por conta de: "+e.getLocalizedMessage());
            }

        } while (true) ;


    }
}

