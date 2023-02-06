import java.util.Scanner;

public class VerificadorDeNumeros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("---------- PROGRAMA QUE COMPARA 3 NUMEROS ---------");
		System.out.println("---------------------------------------------------");
		
		System.out.println("Digite o primeiro numero");
		double primeiroNumero = (scanner.nextDouble());
		
		System.out.println("Digite o segundo numero");
		double segundoNumero = (scanner.nextDouble());
		
		System.out.println("Digite o terceiro numero");
		double terceiroNumero = (scanner.nextDouble());
		
		if(primeiroNumero > segundoNumero + terceiroNumero) {
			System.out.println(primeiroNumero+" é maior que "+segundoNumero+" + "+terceiroNumero);
		} else {
			System.out.println(primeiroNumero+" é menor que "+segundoNumero+" + "+terceiroNumero);
		}
	}

}
