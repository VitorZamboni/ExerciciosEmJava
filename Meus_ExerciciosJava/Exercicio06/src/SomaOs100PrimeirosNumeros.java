
public class SomaOs100PrimeirosNumeros {
	public static void main(String[] args) {
		System.out.println("------- Programa que os primeiros 100 números naturais --------");
		int soma = 0;
		for(int i = 0; i <= 100; i++) {
			soma += i;
		}
		System.out.println("A soma dos 100 primeiros números naturais é "+soma);
	}
}
