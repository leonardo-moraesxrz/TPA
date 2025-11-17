import java.util.Scanner;

public class VerificaPrimos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] A = new int[10];

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = ler.nextInt();
        }

        System.out.println("\n--- Verificação de números primos ---");

        for (int i = 0; i < 10; i++) {
            int num = A[i];
            int divisores = 0;

            for (int j = 1; j <= num; j++) {
                if (num % j == 0) {
                    divisores++;
                }
            }

            if (divisores == 2) {
                System.out.println(num + " é primo.");
            } else {
                System.out.println(num + " não é primo.");
            }
        }

        ler.close();
    }
}


