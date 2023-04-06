import java.util.Random;

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
	
	public static void menuErro() {
		
		System.out.println("\nOpção incorreta! Digite novamente a opção abaixo:");
		System.out.println("\n0 - Pedra \n1 - Papel \n2 - Tesoura");
	}
}
