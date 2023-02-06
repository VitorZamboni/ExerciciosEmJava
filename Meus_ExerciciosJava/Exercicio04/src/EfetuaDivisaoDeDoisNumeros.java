import java.util.Scanner;

public class EfetuaDivisaoDeDoisNumeros {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("------- Programa que efetua a divisao de 2 números --------");
		System.out.print("Dividendo: ");
		double dividendo = scanner.nextInt();
		
		System.out.print("Divisor: ");
		double divisor = scanner.nextInt();
		
		if(divisor!=0) {
			System.out.println(dividendo+" / "+divisor+" = "+dividendo/divisor);
		} else {
			System.out.println("Divisão Invalida. Não é possível dividir um número por zero");
		}
	}
}
