import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String sim = "sim";
		String nao = "nao";
		
		boolean continuar = true;
		boolean palavraContinuar = true;
		
		while(continuar) {
			
			Secundaria.menu();
			int opcaoJog = entrada.nextInt();
			int opcaoPc = Secundaria.sorteioNum();
			
			while(opcaoJog < 0 || opcaoJog > 2) {
				Secundaria.menuErro();
				opcaoJog = entrada.nextInt();
			}
			
			
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
			
			switch(opcaoJog) {
			
				case 0:
					System.out.println("Você escolheu PEDRA.");
					
					if(opcaoPc == 1) {
						System.out.println("O computador ganhou, mais sorte da próxima vez!");
					} else if(opcaoPc == 2) {
						System.out.println("Parabéns, você ganhou!");
					} else {
						System.out.println("EMPATE! Ambos escolheram PEDRA.");
					}
					
					break;
					
				case 1:
					System.out.println("Você escolheu PAPEL.");
					
					if(opcaoPc == 0) {
						System.out.println("Parabéns, você ganhou!");
					} else if(opcaoPc == 2) {
						System.out.println("O computador ganhou, mais sorte da próxima vez!");
					} else {
						System.out.println("EMPATE! Ambos escolheram PAPEL.");
					}
					
					break;
					
				case 2:
					System.out.println("Você escolheu TESOURA.");
					
					if(opcaoPc == 0) {
						System.out.println("O computador ganhou, mais sorte da próxima vez!");
					} else if(opcaoPc == 1) {
						System.out.println("Parabéns, você ganhou!");
					} else {
						System.out.println("EMPATE! Ambos escolheram TESOURA.");
					}
					
					break;
			}
			
			palavraContinuar = true;
			while(palavraContinuar) {
				
				System.out.println("\nQuer continuar jogando? [sim/nao]");
				String continuarSN = entrada.next();
				
				if(continuarSN.equals(sim)) {
					continuar = true;
					palavraContinuar = false;
				} else if(continuarSN.equals(nao)){
					continuar = false;
					palavraContinuar = false;
					
					System.out.println("\nFIM DE JOGO!");
					
					System.exit(0);
				} else {
					System.out.println("\n[ERRO]\nDigite apenas sim ou nao");
					palavraContinuar = true;
				}
				
			}
			
		}
		
		
	}
	

}
