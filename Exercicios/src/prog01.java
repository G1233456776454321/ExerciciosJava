import java.util.Scanner;
public class prog01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String palavra;
        int contador = 1;
        boolean v = true;
        boolean verificadorcontagem = false;

        do {


            do {
                verificadorcontagem = false;
                System.out.printf("Tentativa %d \n", contador);
                System.out.println("Digite a palavra-chave: ");
                palavra = leitor.next();
                contador = contador + 1;
                if(contador==7){
                    verificadorcontagem = true;
                    break;
                }
            } while (!palavra.equalsIgnoreCase("banana"));
            if (verificadorcontagem==false){
                System.out.printf("Você conseguiu em %d tentativa \n", contador);
            }
            else {
                System.out.println("Você não conseguiu");
                System.out.printf("A palavra era: %s", palavra);
            }
        }while (v==true);
    }
}
