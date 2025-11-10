import java.util.Scanner;

public class VetorDivisores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] A = new int[10];

        for (int i = 0; i < A.length; i++) {
            System.out.print("Digite o valor do elemento A[" + i + "]: ");
            A[i] = input.nextInt();
        }

        System.out.println();
        for (int i = 0; i < A.length; i++) {
            System.out.println("Elemento A[" + i + "] = " + A[i]);
            System.out.print("Divisores: ");

            for (int j = 1; j <= A[i]; j++) {
                if (A[i] % j == 0) {
                    System.out.print(j + " ");
                }
            }

            System.out.println("\n");
        }

        input.close();
    }
}

