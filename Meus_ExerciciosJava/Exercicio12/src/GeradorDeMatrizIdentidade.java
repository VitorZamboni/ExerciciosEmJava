import java.util.Scanner;

public class GeradorDeMatrizIdentidade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("---------- Classe que gera uma matriz identidade ---------");
		System.out.print("Digite a ordem da matriz: ");
		int ordem = scanner.nextInt();
		
		for(int linha = 1 ; linha <= ordem; linha++) {
			for(int coluna = 1 ; coluna <= ordem; coluna++) {
				if(coluna==linha) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}
}
