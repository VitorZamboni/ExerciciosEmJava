package br.com.meuExercicio.escola;

public class Aluno {
	private String nome;
	private int serie;
	private double primeiraNota;
	private double segundaNota;
	private double media;
	
	public Aluno(String nome, int serie){
		this.nome = nome;
		this.serie = serie;
	}
	
	public double getPrimeiraNota() {
		return primeiraNota;
	}
	public void setPrimeiraNota(double primeiraNota) {
		this.primeiraNota = primeiraNota;
	}
	public double getSegundaNota() {
		return segundaNota;
	}
	public void setSegundaNota(double segundaNota) {
		this.segundaNota = segundaNota;
	}
	public String getNome() {
		return nome;
	}
	public int getSerie() {
		return serie;
	}
	public double getMedia() {
		return media;
	}
	
	public void setMedia(double n1, double n2) {
		this.media = (n1+n2)/2;
	}
	
	@Override
	public String toString() {
		return "O aluno "+nome+" da serie "+serie+" tem media "+media;
	}
}
