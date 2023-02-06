import java.util.Scanner;

public class MultaDeVelocidade {
	private static int velocidadeDaVia;
	private static int velocidadeDoVeliculo;
	private static double valorDaMulta;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("--------Calculador de multa -------");
		System.out.println("-----------------------------------");
		
		System.out.print("Velocidade da Via: ");
		velocidadeDaVia = scanner.nextInt();
		System.out.print("Velocidade do Veículo: ");
		velocidadeDoVeliculo = scanner.nextInt();
		
		CalculaValorDaMulta();
		
		System.out.println("Valor da multa: R$"+valorDaMulta);
		
	}

	private static void CalculaValorDaMulta() {
		double diferencaDeVelocidade = velocidadeDoVeliculo - velocidadeDaVia;
		
		if(diferencaDeVelocidade<=0) {
			valorDaMulta = 0;
			return;
		}
		
		if(diferencaDeVelocidade <= 10) {
			valorDaMulta = 50;
		} else if (diferencaDeVelocidade > 10 && diferencaDeVelocidade <= 30 ) {
			valorDaMulta = 100;
		} else {
			valorDaMulta = 200;
		}
		
	}
}
