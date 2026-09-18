/*-------------------------------------------------------------------
  Ex 1.6: Consumo do carro
  - informar uma quantidade inteira de quilômetros
  - informar uma quantidade inteira de litros
  - calcular o consumo do carro em km/l usando um double

  TAREFA:
  - peça para o usuário informar uma quantidade inteira de quilômetros
  - peça para o usuário informar uma quantidade inteira de litros
  - calcule e imprima o consumo do carro em quilômetros por litro (km/l)
  - guarde o resultado em uma variável do tipo double

  EXEMPLO:
  - um carro que percorreu 100 km usando 6 litros deve apresentar um
    resultado quebrado, aproximadamente 16.666666 km/l

  ATENÇÃO:
  - quando dividimos dois valores int, o resultado é uma divisão inteira
  - para produzir um resultado double, transforme pelo menos um dos valores
    em double antes da divisão
  - exemplos: (double) quilometros / litros 
    ou quilometros / (double) litros
-------------------------------------------------------------------*/
import java.util.Scanner;
public class Ex01_6 {
    public static void main(String[] args) {
        int kms;
        int litros;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe os kms a andar: ");
        kms = leitor.nextInt();
        System.out.print("informe os litros: ");
        litros = leitor.nextInt();
        double calculo =  kms /(double) litros;
        System.out.printf("O resultado de gastos por kms andados é: " + calculo);




    }
}
