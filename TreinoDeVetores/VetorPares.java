import java.util.Scanner;

public class VetorPares {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] A = new int[10];

        for (int i = 0; i < A.length; i++) {
            System.out.print("Digite o valor do elemento A[" + i + "]: ");
            A[i] = ler.nextInt();
        }

        System.out.println();
        for (int i = 0; i < A.length; i++) {
            System.out.println("Elemento A[" + i + "] = " + A[i]);
            System.out.print("Pares de 0 até " + A[i] + ": ");

            for (int j = 0; j <= A[i]; j++) {
                if (j % 2 == 0) {
                    System.out.print(j + " ");
                }
            }

            System.out.println("\n");
        }

        ler.close();
    }
}

