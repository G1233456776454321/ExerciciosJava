import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   public static void main(String[] args){
       String[] cores = {"vermelho","laranja", "amarelo","verde","azul","anil","violeta"};
       Scanner leitor = new Scanner(System.in);
       String nome;
       System.out.println("Digite a cor do arco iris: ");
       nome = leitor.next();
       boolean trigger = false;
       for (int i=0;i< cores.length;i++){
           if (nome==cores[i]){
               trigger = true;
           }
       }
       if (trigger==true){
           System.out.println("Essa cor existe");
       }
       else {
           System.out.println("Essa cor não existe");
       }
    

   }
}
