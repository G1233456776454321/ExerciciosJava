/*-------------------------------------------------------------------
  Ex 1.4: Ovos das galinhas
  - calcular quantas caixas de ovos cheias podem ser levadas ao mercado
  - calcular quantos ovos sobram

  TAREFA:
  - peça para o usuário informar quantos ovos suas galinhas botaram no dia
  - considere que cada caixa comporta 12 ovos
  - calcule e imprima quantas caixas cheias ele poderá levar ao mercado
  - calcule e imprima quantos ovos sobram
  - use a operação de divisão inteira (/) e resto da divisão (%)
-------------------------------------------------------------------*/
import java.util.Scanner;
public class Ex01_4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe a quantidade de ovos do dia: ");
         int ovosdia = leitor.nextInt();
         int caixas = ovosdia/12;
         int resto = ovosdia%12; //ou ovos - (caixas*12)
        System.out.printf("Foram carregadas %d caixas, e sobraram %d ovos", caixas, resto);


    }
}
