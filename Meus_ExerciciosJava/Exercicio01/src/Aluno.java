import java.util.ArrayList;
import java.util.Scanner;

public class Aluno {
	
	ArrayList<Double> notas = new ArrayList<Double>();
	private int faltas;
	private SituacaoAluno situacao;	

	public double getNota(int indice) {
		if (indice > 0 && indice < 4) {
			return notas.get(indice - 1);
		}
		throw new ArrayIndexOutOfBoundsException("Nota Fora de índice");
	}

	public void setNota(double nota) {
		if ((nota >= 0 && nota <= 10)) {
			this.notas.add(nota);
		} else {
			System.out.println("Nota Invalida");
		}
	}
	
	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		if (faltas >= 0) {
			this.faltas = faltas;
		}
	}

	public double getMedia() {
		double somatoria = 0;
		for (Double nota : notas) {
			somatoria+=nota;
		}
		return somatoria/notas.size();
	}

	public SituacaoAluno getSituacao() {
		boolean mediaEntreSeteETres = getMedia() >= 3 && getMedia() < 7;
		if (getMedia() >= 7 && faltas < 7) {
			return situacao.APROVADO;
		}
		if ((mediaEntreSeteETres) && faltas < 7) {
			return emRecuperacao();
		} else {
			return situacao.REPROVADO;
		}
	}

	private SituacaoAluno emRecuperacao() {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a nota de recuperação: ");
		this.setNota(entrada.nextDouble());
		
		if(getMedia()>=5) {
			return situacao.APROVADO;
		}
		return situacao.REPROVADO;
	}

}
