import java.util.Random;
import java.util.Scanner;

public class AdivinheONumero {
	public static void main(String[] args) {
		System.out.println("---------- Classe que gera um número aleatorio e voce precisa adivinhar qual é ! ---------");
		int numeroASerAdivinhado = new Random().nextInt(100);
		Scanner scanner = new Scanner(System.in);
		int numeroDigitado = 0;
		int tentativas = 0;
		
		while(numeroDigitado!=numeroASerAdivinhado) {
			System.out.println("Digite um numero");
			numeroDigitado = scanner.nextInt();
			
			if(numeroDigitado < numeroASerAdivinhado) {
				System.out.println("MAIOR");
			}
			if(numeroDigitado > numeroASerAdivinhado) {
				System.out.println("MENOR");
				tentativas++;
			}
		}
		
		System.out.println("ACERTOU!!!! numero de Tentadivas: "+tentativas);
		System.out.println();

	}
}
