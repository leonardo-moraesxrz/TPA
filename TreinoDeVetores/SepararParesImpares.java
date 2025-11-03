import java.util.Scanner;

public class SepararParesImpares {
	
    public static void main(String[] args) {
    	
        Scanner ler = new Scanner(System.in);
        
        int[] A = new int[20];
        int[] B = new int[20];
        int contPar = 0;

        // Leitura do vetor A
        System.out.println("Digite 20 números inteiros:");
        for (int i = 0; i < 20; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = ler.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            if (A[i] % 2 == 0) {
                B[contPar] = A[i];
                contPar++;
            }
        }

        for (int i = 0; i < 20; i++) {
            if (A[i] % 2 != 0) {
                B[contPar] = A[i];
                contPar++;
            }
        }

        // Exibição do vetor B
        System.out.println("\nVetor B (pares primeiro, ímpares depois):");
        for (int i = 0; i < 20; i++) {
            System.out.print(B[i] + " ");
        }

        ler.close();
    }
}
