import java.util.Scanner;

public class AnoBissexto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("------- Programa que verifica se um ano é bissexto --------");
		System.out.print("Ano: ");
		int ano = scanner.nextInt();
		
		boolean anoEhBissexto = (ano%400 == 0)||(ano%4==0 && ano%100!=0);
		
		if(anoEhBissexto) {
			System.out.println(ano+" é bissexto");
		} else {
			System.out.println(ano+" não é bissexto");
		}
	}
}
