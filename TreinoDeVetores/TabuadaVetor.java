import java.util.Scanner;

public class TabuadaVetor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] A = new int[5];

        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = ler.nextInt();
        }

        System.out.println("\n--- TABUADAS ---");

        for (int i = 0; i < 5; i++) {
            System.out.println("\nTabuada do " + A[i] + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(A[i] + " x " + j + " = " + (A[i] * j));
            }
        }

    }
}

