import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenadorDeVetor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("---------- Classe que ordena um vetor em ordem crescente  ---------");
		System.out.print("Digite o tamanho do vetor: ");
		int tamanho = scanner.nextInt();
		
		ArrayList<Integer> vetor = new ArrayList<>();
		for(int i = 1; i <= tamanho; i++) {
			System.out.print("Digite o "+i+"° elemento: ");
			vetor.add(scanner.nextInt()); 
		}
		Collections.sort(vetor);
		System.out.println("\n Vetor ordenado:");
		vetor.forEach(System.out::println);
	}
}
