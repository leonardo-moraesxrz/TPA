import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int maiores = 0, menores = 0, i = 1, id;
		
		while(i<=5) {
			
			System.out.println("Digite  a idade da "+i+"º pessoa");
			id = ler.nextInt();
			
			if(id>=18) {
				maiores = maiores+1;
			}
			
			else {
				menores = menores +1;
			}
			
			i++;
			                                                                                                                                                                                                                                                                                                    
		}
		
		System.out.println("Quantidade de maiores de idade: "+maiores);
		
		System.out.println("Quantidade de menores de idade: "+menores);

	}

}
