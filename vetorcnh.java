import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
   public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       int number = 0;
       String letra;
       String[] description = {"nada",
               "ACC (Autorização para Conduzir Ciclomotor). O que permite dirigir: Veículos de 2 ou 3 rodas com motor de até 50 cm³ e velocidade máxima de até 50 km/h. Requisitos: Idade mínima de 18 anos e aprovação nos exames teóricos e práticos específicos.",
               "Categoria A. O que permite dirigir: Veículos motorizados de duas ou três rodas, com ou sem carro lateral (motocicletas, motonetas, triciclos) com mais de 50 cilindradas. Requisitos: Idade mínima de 18 anos.",
               "Categoria B. O que permite dirigir: Carros de passeio, caminhonetes, furgões e utilitários com Peso Bruto Total (PBT) de até 3.500 kg e lotação de até 8 passageiros (sem contar o motorista), além de quadriciclos e motor-casas que se enquadrem nesses limites. Requisitos: Idade mínima de 18 anos",
               "Categoria C. O que permite dirigir: Veículos motorizados utilizados para transporte de carga com PBT superior a 3.500 kg (como caminhões, tratores e máquinas de construção). Inclui todos os veículos da categoria B. Requisitos: Ter no mínimo 1 ano de CNH na categoria B e não ter cometido nenhuma infração grave ou gravíssima (ou ser reincidente em médias) nos últimos 12 meses.",
               "Categoria D. O que permite dirigir: Veículos para transporte de passageiros com mais de 8 lugares (ônibus, micro-ônibus e vans), abrangendo também as categorias B e C. Requisitos:  Idade mínima de 21 anos, possuir CNH B há pelo menos 2 anos (ou C há pelo menos 1 ano) e cumprir os critérios de bom histórico de infrações",
               "Categoria E. O que permite dirigir: Combinações de veículos em que a unidade tracionada pertence às categorias B, C ou D e cuja unidade acoplada (reboque, semirreboque ou articulação) pesa 6.000 kg ou mais, ou transporta mais de 8 passageiros (como carretas e bitrens). Requisitos:  Mínimo de 21 anos de idade, estar habilitado na categoria C ou D há pelo menos 1 ano e não ter infrações graves ou gravíssimas recentes."};
       do {
           System.out.println("Digite sua letra de de categoria da CNH, apenas uma por vez: ");
           letra = leitor.next();
           if (letra.equalsIgnoreCase("Acc")) {
               number = 1;
           } else if (letra.equalsIgnoreCase("a")) {
               number = 2;
           } else if (letra.equalsIgnoreCase("b")) {
               number = 3;
           } else if (letra.equalsIgnoreCase("c")) {
               number = 4;
           } else if (letra.equalsIgnoreCase("d")) {
               number = 5;
           } else if (letra.equalsIgnoreCase("e")) {
               number = 6;
           } else {
               System.out.printf("letra não encontrada");
           }
           System.out.print(description[number]);
       }while (true);
   }
}
