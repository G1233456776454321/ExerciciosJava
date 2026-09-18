/*-------------------------------------------------------------------
  Ex 1.5: Troca de dinheiro
  - informar um valor inteiro em reais, sem os centavos
  - calcular quantas notas e moedas podem ser obtidas na troca

  TAREFA:
  - peça para o usuário informar um valor inteiro em reais, sem os centavos
  - calcule e imprima quantas notas de 50, 10, 5 e 2 reais
    e quantas moedas de 1 real é preciso para fazer esse valor
  - não é necessário usar if em nenhum lugar: use apenas divisão inteira (/)
    e resto da divisão (%)

  DESAFIO:
  - depois de terminar, altere o programa para aceitar um valor double,
    incluindo os centavos
  - calcule e imprima também quantas moedas de 50, 25, 10, 5 e 1 centavo
    podem ser obtidas
-------------------------------------------------------------------*/import java.util.Scanner;

import java.util.Scanner;

public class Ex01_5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o valor do troco: ");
        int trocar = leitor.nextInt();

        int cinquenta = trocar / 50;
        int resto50 = trocar % 50;

        int dez = resto50 / 10;
        int resto10 = resto50 % 10;

        int cinco = resto10 / 5;
        int um = resto10 % 5;

        int total = cinquenta + dez + cinco + um;

        System.out.printf("O total de cédulas/moedas deu %d\n", total);
    }
}
