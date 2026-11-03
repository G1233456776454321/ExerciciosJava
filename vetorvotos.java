import java.util.Scanner;
public class votos {
   public static void main(String[] args) {
       int[] votos = new int[4];
       Scanner leitor = new Scanner(System.in);
       int voto = 0;
       int soma = 1;
       String confirma;
       int contador =0;
       do {
           System.out.printf("\n1 - FLAMINGO FULEIRO\n" +
                   "\n2 - JACARÉ JUVENAL\n" +
                   "\n3 - MORCEGO MARCELO\n");
           System.out.printf("\nInforme em quem vai votar(1,2,3):");
           voto = leitor.nextInt();
           System.out.printf("\nCerteza que vai votar?");
           confirma = leitor.next();
           if (confirma.equalsIgnoreCase("s")) {
               if (voto != 0) {
                   votos[voto] += soma;
                   contador +=1;
               } else {
                   System.out.printf("Voto nulo");
                   votos[0] += soma;
                   contador +=1;
               }
           }
           else {
               System.out.printf("\nVoto cancelado");
           }


       }while (contador==105);
       System.out.printf("\nResultado:");
       if (votos[1] > votos[2] && votos[2] > votos[3]) {
           // 1º: Candidato 1 | 2º: Candidato 2 | 3º: Candidato 3
          
       }
       else if (votos[1] > votos[3] && votos[3] > votos[2]) {
           // 1º: Candidato 1 | 2º: Candidato 3 | 3º: Candidato 2
           System.out.printf("\n1 - FLAMINGO FULEIRO\n" +
                   "\n2 - JACARÉ JUVENAL\n" +
                   "\n3 - MORCEGO MARCELO\n");
       }
       else if (votos[2] > votos[1] && votos[1] > votos[3]) {
           // 1º: Candidato 2 | 2º: Candidato 1 | 3º: Candidato 3
           System.out.printf("\n2 - FLAMINGO FULEIRO\n" +
                   "\n1 - JACARÉ JUVENAL\n" +
                   "\n3 - MORCEGO MARCELO\n");
       }
       else if (votos[2] > votos[3] && votos[3] > votos[1]) {
           // 1º: Candidato 2 | 2º: Candidato 3 | 3º: Candidato 1
           System.out.printf("\n3 - FLAMINGO FULEIRO\n" +
                   "\n1 - JACARÉ JUVENAL\n" +
                   "\n2 - MORCEGO MARCELO\n");
       }
       else if (votos[3] > votos[1] && votos[1] > votos[2]) {
           // 1º: Candidato 3 | 2º: Candidato 1 | 3º: Candidato 2
           System.out.printf("\n2 - FLAMINGO FULEIRO\n" +
                   "\n3 - JACARÉ JUVENAL\n" +
                   "\n1 - MORCEGO MARCELO\n");
       }
       else {
           // 1º: Candidato 3 | 2º: Candidato 2 | 3º: Candidato 1
           System.out.printf("\n3 - FLAMINGO FULEIRO\n" +
                   "\n2 - JACARÉ JUVENAL\n" +
                   "\n1 - MORCEGO MARCELO\n");
       }
   }
}
