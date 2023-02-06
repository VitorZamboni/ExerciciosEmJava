import java.util.ArrayList;
import java.util.Random;

public class CalculaDivisores {
	public static void main(String[] args) {
		System.out.println("------- Programa que calcula os divisores de um numero qualquer --------");
		int numero = new Random().nextInt(0, 999999);
		ArrayList<Integer> divisores = new ArrayList<>();
		for (int i = 1; i <= numero; i++) {
			if(numero%i==0) {
				divisores.add(i);
			}
		}
		
		System.out.println("Os divisores de "+numero+" são:");
		divisores.forEach(System.out::println);
	}

}
