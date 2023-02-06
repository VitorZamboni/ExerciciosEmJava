package br.com.meuExercicio.escola;

public class TestaAluno {

	public static void main(String[] args) {
		Aluno aluno = new Aluno("Vitor", 2);
		aluno.setPrimeiraNota(10);
		aluno.setSegundaNota(9);
		aluno.setMedia(aluno.getPrimeiraNota(), aluno.getSegundaNota());
		
		System.out.println(aluno);

	}

}
