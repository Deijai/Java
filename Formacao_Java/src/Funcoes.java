import java.util.Scanner;

public class Funcoes {
	
	
	public void cadastrarFrutas() {
		//Funçoes
				int qtd = 0;
				String frutas[];
				
				System.out.println("Informe a quantidade de frutas para cadastrar:");
				
				Scanner teclado = new Scanner(System.in);
				qtd = Integer.parseInt(teclado.nextLine());
				
				frutas = new String[qtd];
				
				if (qtd > 0) {
					
					for (int i = 0; i < qtd; i++) {
						System.out.println("Informe a fruta "+(i + 1));
						frutas[i] = teclado.nextLine();	
					}
					
					System.out.println(qtd);
					for (int i = qtd; i > 0; i--) {
						System.out.println(frutas[i - 1]);
					}
					
				}
				
				
				
				
				
				
				teclado.close();


	}

	public static void main(String[] args) {
		
			}

}
