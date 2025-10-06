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
				System.out.println("1º Faixa");
			}
			
			else if(id<=30) {
				System.out.println("2º Faixa");
			}
			
			else if(id<=45) {
				System.out.println("3º Faixa");
			}
			
			else if(id<=60) {
				System.out.println("4º Faixa");
			}
			
			else {
				System.out.println("5º Faixa");
			}
			
			i++;
			
			System.out.println("Deseja continuar? (1 - Sim / 2 - Não): ");
			Opcao = ler.nextInt();
			
		}while(Opcao == 1);
		
		
		
		
		
		

	}

}
