import java.util.Scanner;
public class orig2 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int contador = 0;
        Boolean confirmacao;
        boolean triggergeral = true;
        do {
            System.out.println("Deseja começar a contar S ou N(para sair)");
            confirmacao = leitor.nextBoolean();
            if (confirmacao==true){
                do{
                    contador = contador + 1;
                    System.out.printf("contador: %d ",contador);

                }while (contador!=10);
            }
            else{
                triggergeral = false;
            }

        }while (!triggergeral==false);
    }
}
