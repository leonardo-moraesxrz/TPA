import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		int i = 1;
		int n, fatorial = 1;
		
		System.out.println("Digite um número inteiro");
		n = ler.nextInt();
		
		do {
			fatorial = fatorial*i;
			
			i++;
		}
		
		while( i <= n);
		
		System.out.println("O fatorial de " +n+ " é: "+fatorial);
		
		
		
	}

}
