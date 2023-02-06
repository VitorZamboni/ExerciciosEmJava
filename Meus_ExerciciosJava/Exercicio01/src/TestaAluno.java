import java.io.IOException;
import java.util.Scanner;

public class TestaAluno {
	
	public static void main(String[] args) throws IOException {
		Aluno aluno = new Aluno();
		Scanner scanner = new Scanner(System.in);
		System.out.println("---------- PROGRAMA QUE VERIFICA APROVAÇÃO DO ALUNO ---------");
		System.out.println("-------------------------------------------------------------");
		
		while(aluno.notas.size()<=2) {
			System.out.print("Digite a nota: ");
			aluno.setNota(scanner.nextDouble()); 
			System.out.println("");
		}
		
		System.out.print("Digite quantidade de Faltas: ");
		aluno.setFaltas(scanner.nextInt()); 
		
		System.out.println(aluno.getSituacao());
		
		
	}
}
