/*-------------------------------------------------------------------
  Ex 2.5: Tipos de triangulo
  - informar o comprimento de três retas (double) 
  - descobrir se eles formam um triangulo
  - descobrir o tipo do triangulo

  TAREFA:
  - peça para o usuário informar três medidas do tipo double
  - verifique se as três medidas podem representar os lados de um
    triângulo
  - se não formarem um triângulo, imprima uma mensagem informando isso
  - se formarem um triângulo, diga se ele é equilátero, isósceles ou
    escaleno

  DICA:
  - A operação lógica "E" em java é &&
  - A operação lógica "OU" em java é ||
  - A operação lógica "NÃO" em java é !

  FORMULA:
  - três lados formam um triângulo quando cada lado é menor que a soma
    dos outros dois
  - portanto, verifique as três condições:
    lado1 < lado2 + lado3
    lado2 < lado1 + lado3
    lado3 < lado1 + lado2
  - as medidas também precisam ser maiores que zero

  CLASSIFICACAO:
  - equilátero: os três lados são iguais
  - isósceles: apenas dois lados são iguais
  - escaleno: os três lados são diferentes
-------------------------------------------------------------------*/
import java.util.Scanner;
public class Ex02_5 {
    public static void main(String[] args) {
        double l1;
        double l2;
        double l3;
        Scanner leitor = new Scanner(System.in);
        System.out.print("digite seu l1: ");
        l1 = leitor.nextDouble();
        System.out.print("digite seu l2: ");
        l2 = leitor.nextDouble();
        System.out.print("digite seu l3: ");
        l3 = leitor.nextDouble();

        if (l1 !=0 && l2 !=0 && l3 !=0){
            if (l1 + l2> l3){
                System.out.print("è um triangulo");
            }
            else if (l2 + l3> l1){
                System.out.print("è um triangulo");
            }
            else if (l1 + l3> l2){
                System.out.print("è um triangulo");
            }
            else{
                System.out.print("è um triangulo");
            }
        }
        else{
            System.out.print("Digite numeros válidos");
        }
    }
}
