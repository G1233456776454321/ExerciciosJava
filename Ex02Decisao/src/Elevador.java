import java.util.Scanner;
public class Elevador{
	public static void main(String[] args){
	int MAX_PESSOAS = 5;
	double MAX_PESO = 300;
	int pessoas=0;
	double peso=0.0;
	double pesototal=0.0;
	Scanner leitor = new Scanner(System.in);
	do{
		pessoa++;
		if(pessoa <= MAX_PESSOAS) {
			System.out.println("Informe o peso");
			peso = leitor.nextDouble();
			if(pesototal + peso <=MAX_PESO){
				pesototal = pesototal + peso;
				}
			else{System.out.println("peso maximo atingido");
				}
		else{
			System.out.println("capacidade maxima atingida");
			pessoa--;
			}
		}while(true);
	}
}
