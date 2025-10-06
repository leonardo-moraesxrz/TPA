import java.util.Scanner;

public class Tabuada2 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		int i, n, r;
		
		for(i=1;i<=10;i++) {
			
			System.out.println("Tabuado do "+i+":");
			
			for(n=1;n<=10;n++){
				
				r = i*n;
				
				System.out.println(+i+"x"+n+"="+r);
				
			}
			
			
		}

	}

}
