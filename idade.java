

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {

   public static void main(String[] args) {

       int idade = 20;

       Scanner leitor = new Scanner(System.in);

       System.out.printf("informe sua idade ");

       idade = leitor.nextInt();

       int anoNasc = 2026 - idade;

       System.out.printf("você nasceu em %d\n", anoNasc);

      



       }



}



