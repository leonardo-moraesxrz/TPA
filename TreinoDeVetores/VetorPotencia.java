import java.util.Scanner;

public class VetorPotencia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] A = new int[11];

        for (int i = 0; i < A.length; i++) {
            System.out.print("Digite o valor do elemento A[" + i + "]: ");
            A[i] = input.nextInt();
        }

        System.out.println();
        for (int i = 0; i < A.length; i++) {
            System.out.println("A[" + i + "] = " + A[i]);
        }

        input.close();
    }
}
