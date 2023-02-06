import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println("------- Programa que exibe a Sequencia Fibonacci --------");
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o tamanho da que queres a sequencia: ");
		int tamanho = scan.nextInt();
		
		int primeiroTermo = 0;
		int segundoTermo = 1;
		System.out.println(primeiroTermo);
		System.out.println(segundoTermo);
		for(int i = 1; i <= tamanho-2; i++) {
			int temp = segundoTermo;
			segundoTermo += primeiroTermo;
			primeiroTermo = temp;
			System.out.println(segundoTermo);
			
		}
	}
}
