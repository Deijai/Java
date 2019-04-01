import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {
		
		//Funçoes
		int qtd = 0;
		int ini = 0;
		String frutas = null;
		
		System.out.println("Informe a quantidade de frutas para cadastrar:");
		
		Scanner teclado = new Scanner(System.in);
		qtd = Integer.parseInt(teclado.nextLine());
		
		if (qtd != 0) {
			
			while (ini < qtd) {
				System.out.println("Informe a fruta");
				frutas = teclado.nextLine();
				System.out.println(frutas);
				ini++;		
				
			}
			
			
		}
		
		
		
		
		
		
		teclado.close();

	}

}
