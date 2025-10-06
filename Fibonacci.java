import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a  = 1;
		int b = 1;
		int i = 1;
		int n, pro;
		
		System.out.println("Digite o número de termos");
		n = ler.nextInt();
		
		System.out.print(a + " " + b + " ");
		
		do {
            pro = a + b;
            System.out.print(pro + " ");

            a = b;
            b = pro;
            i++;
        } while (i < n);

	}

}
