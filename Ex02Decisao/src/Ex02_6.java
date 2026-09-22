/*-------------------------------------------------------------------
  Ex 2.6: Ordem dos numeros
  - informar tres numeros
  - descobrir qual e o maior, o do meio e o menor

  TAREFA:
  - peça para o usuário informar três números do tipo double
  - descubra qual dos três números é o maior
  - descubra qual dos três números fica no meio
  - descubra qual dos três números é o menor
  - imprima os três valores nesta ordem: maior, do meio e menor

  DICA:
  - use decisões para comparar os três números
  - os números podem ser informados em qualquer ordem
-------------------------------------------------------------------*/
import java.util.Scanner;
public class Ex02_6 {
    public static void main(String[] args) {
        double n1;
        double n2;
        double n3;
        Scanner leitor = new Scanner(System.in);
        System.out.print("digite seu n1: ");
        n1 = leitor.nextDouble();
        System.out.print("digite seu n2: ");
        n2 = leitor.nextDouble();
        System.out.print("digite seu n3: ");
        n3 = leitor.nextDouble();
        if (n1 > n2 && n2 > n3){
            System.out.printf("O %d é maior que %d, e %d maior que %d", n1,n2,n2,n3);
        }
        else if (n2 > n1 && n1 > n3 ){
            System.out.printf("O %d é maior que %d, e %d maior que %d", n2,n1,n1,n3);
        }
        else if (n3 > n1 && n1 > n2 ){
            System.out.printf("O %d é maior que %d, e %d maior que %d", n3,n1,n1,n2);
        }
        else if (n2 > n1 && n1 > n3 ){
            System.out.printf("O %d é maior que %d, e %d maior que %d", n2,n1,n1,n3);
        }



    }
}
