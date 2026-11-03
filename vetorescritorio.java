import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   public static void main(String[] args){
       Scanner leitor = new Scanner(System.in);
      String[] escrtorios = new String[106];
      escrtorios[101] = "Dr. Silva, Dentista";
      escrtorios[102] = "Contabilidade Silva";
      escrtorios[103] = "Dr. Silva, Cardiologista";
      escrtorios[104] = "Silvana Silva, Manicure";
      escrtorios[105] = "Silvana Silva, Manicure";
      int numero = 0;
      do {
          try  {
              System.out.println("Informe o numero da sala: ");
              numero = leitor.nextInt();

              if (escrtorios[numero]!=null && numero>0){
              System.out.println("Quem esta no escritorio "+numero+" é "+escrtorios[numero]);
              } else if (numero>0 && escrtorios[numero]==null) {
                  System.out.println("Escritorio não ocupado");
              }
              else {
                  System.out.println("Possivel erro de digitação");
              }

          }catch (Exception e){
              System.out.println("Erro: "+ e.getLocalizedMessage());
          }

       }while (true);

   }
}
