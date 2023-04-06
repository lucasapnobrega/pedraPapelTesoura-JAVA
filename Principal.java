import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String sim = "sim";
		String nao = "nao";
		
		int jogGanhou = 0;
		int pcGanhou = 0;
		int empate = 0;
		
		boolean continuar = true;
		boolean palavraContinuar = true;
		
		while(continuar) {
			
			Secundaria.menu(); // função MENU
			
			int opcaoJog = entrada.nextInt();
			
			int opcaoPc = Secundaria.sorteioNum(); // função do sorteio
			
			while(opcaoJog < 0 || opcaoJog > 2) {
				Secundaria.menuErro();
				opcaoJog = entrada.nextInt();
			}
			
			Secundaria.menuPc(opcaoPc); // função escolha do PC
			
			switch(opcaoJog) {
			
			case 0:
				System.out.println("Você escolheu PEDRA.");
				
				if(opcaoPc == 1) {
					System.out.println("O computador ganhou, mais sorte da próxima vez!");
					pcGanhou++;
				} else if(opcaoPc == 2) {
					System.out.println("Parabéns, você ganhou!");
					jogGanhou++;
				} else {
					System.out.println("EMPATE! Ambos escolheram PEDRA.");
					empate++;
				}
				
				break;
				
			case 1:
				System.out.println("Você escolheu PAPEL.");
				
				if(opcaoPc == 0) {
					System.out.println("Parabéns, você ganhou!");
					jogGanhou++;
				} else if(opcaoPc == 2) {
					System.out.println("O computador ganhou, mais sorte da próxima vez!");
					pcGanhou++;
				} else {
					System.out.println("EMPATE! Ambos escolheram PAPEL.");
					empate++;
				}
				
				break;
				
			case 2:
				System.out.println("Você escolheu TESOURA.");
				
				if(opcaoPc == 0) {
					System.out.println("O computador ganhou, mais sorte da próxima vez!");
					pcGanhou++;
				} else if(opcaoPc == 1) {
					System.out.println("Parabéns, você ganhou!");
					jogGanhou++;
				} else {
					System.out.println("EMPATE! Ambos escolheram TESOURA.");
					empate++;
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
					
					Secundaria.finalJogo(jogGanhou, pcGanhou, empate); // função que retorna as vitórias e empates
					
				} else {
					System.out.println("\n[ERRO]\nDigite apenas sim ou nao");
					palavraContinuar = true;
				}
				
			}
			
		}
		
		
	}
	

}
	

