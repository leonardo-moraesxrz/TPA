import java.util.Scanner;

public class progamaIdade {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int id, i = 1;
		int Opcao;
		
		do {
			
			System.out.println("Digite a idade:");
			id = ler.nextInt();
			
			if(id<=15) {
				System.out.println("1� Faixa");
			}
			
			else if(id<=30) {
				System.out.println("2� Faixa");
			}
			
			else if(id<=45) {
				System.out.println("3� Faixa");
			}
			
			else if(id<=60) {
				System.out.println("4� Faixa");
			}
			
			else {
				System.out.println("5� Faixa");
			}
			
			i++;
			
			System.out.println("Deseja continuar? (1 - Sim / 2 - N�o): ");
			Opcao = ler.nextInt();
			
		}while(Opcao == 1);
		
		
		
		
		
		

	}

}
