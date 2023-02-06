import java.util.Random;

public class GeradorDeNumeros {
	public static void main(String[] args) {
		System.out.println("------- Classe que gere numeros aleatorios e imprimes aquele que: n mod 11 = 5 --------");
		for (int i = 0; i < 20; i++) {
			int numero = new Random().nextInt(1000, 1999);
			if (numero % 11 == 5) {
				System.out.println(numero);
			}
		}
	}
}
