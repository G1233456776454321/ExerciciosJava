import java.util.Random;
import java.util.Scanner;


/*-------------------------------------------------------------------
  Ex 2.3: Adivinhe o numero
  - gerar um numero aleatorio entre 1 e 3
  - pedir para a pessoa tentar adivinhar
  - informar se acertou ou errou

  TAREFA:
  - use o numero aleatorio que ja foi gerado no inicio da main
  - peça para a pessoa digitar um chute
  - compare o chute com o numero gerado
  - diga se a pessoa acertou ou errou
  - não é necessário repetir a tentativa: é só para exercitar um IF

  DESAFIO:
  - adicione uma decisão para reclamar se a pessoa digitar um numero
    que não esteja entre 1 e 3
-------------------------------------------------------------------*/
public class Ex02_3 {
    public static void main(String[] args) {
        // gera um numero aleatorio entre 1 e 3
        Random random = new Random();
        int numeroSorteado = random.nextInt(3) + 1;
        Scanner leitor = new Scanner(System.in);
        System.out.printf("Digite o seu chute de 1 a 3");
        int chute = leitor.nextInt();
        if (numeroSorteado==chute){
            System.out.printf("Acertou");
        }
        else {
            System.out.printf("errou");
        }

        // comece seu código aqui
    }

    /*-------------------------------------------------------------------
          Ex 2.2: Confirmacao de senha
          - informar uma senha
          - confirmar a senha
          - reclamar quando as senhas forem diferentes

          TAREFA:
          - peça para o usuário informar uma senha
          - peça para o usuário confirmar a senha
          - compare as duas senhas
          - se as senhas não conferirem, imprima uma mensagem reclamando
          - se as senhas conferirem, imprima uma mensagem confirmando o cadastro
          - não é necessário repetir a digitação: é só pra exercitar um IF

          ATENÇÃO:
          - para verificar se duas Strings são iguais, use o método .equals()
          - exemplo: senha.equals(confirmacao)
          - não use o operador == para comparar duas strings
          -------------------------------------------------------------------*/
    public static class Ex02_2 {
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            System.out.print("Digite sua senha");
            String senha = leitor.next();
            System.out.print("Confirme sua  senha");
            String senhap = leitor.next();
            if (senha.equals(senhap)){
                System.out.print("concluidp");
            }
            else {
                System.out.print("errado");
            }

        }
    }
}
