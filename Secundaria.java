import java.util.Random;
import java.util.Scanner;

public class Secundaria {
	
	public static int sorteioNum() {
		
		Random rnd = new Random();
		int rndPc = rnd.nextInt(3);
		
		return rndPc;
	}
	
	public static void menu() {
		
		System.out.println("\n\nJOGO PEDRA, PAPEL E TESOURA\n");
		System.out.println("Escolha uma das opções abaixo:"
						   +"\n0 - Pedra \n1 - Papel \n2 - Tesoura");
		
	}
	
	public static void menuPc(int opcaoPc) {
		
		switch(opcaoPc) {
		
			case 0:
				
				System.out.println("\nO computador escolheu PEDRA.");
				break;
				
			case 1:
				System.out.println("\nO computador escolheu PAPEL.");
				break;
				
			case 2:
				System.out.println("\nO computador escolheu TESOURA.");
				break;
			
		}
	}
	
	
	public static void menuErro() {
		
		System.out.println("\nOpção incorreta! Digite novamente a opção abaixo:");
		System.out.println("\n0 - Pedra \n1 - Papel \n2 - Tesoura");
	}
	
	
	public static void finalJogo(int jogGanhou, int pcGanhou, int empate) {
		
		System.out.println("\nFIM DE JOGO!!!\n");
		
		System.out.println("- Jogador ganhou "+ jogGanhou +" partidas");
		System.out.println("- Computador ganhou "+ pcGanhou +" partidas");
		System.out.println("- Deu empate em "+ empate +" partidas");
		
		System.exit(0);
	}
}
