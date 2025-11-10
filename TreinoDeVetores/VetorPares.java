public class VetorPares {
    public static void main(String[] args) {
        int[] A = { 3, 7, 4, 6, 2, 9, 5, 8, 1, 10 };

        for (int i = 0; i < A.length; i++) {
            System.out.println("Elemento A[" + i + "] = " + A[i]);

            for (int j = 0; j <= A[i]; j++) {
                if (j % 2 == 0) {
                    System.out.print(j + " ");
                }
            }

            System.out.println("\n");
        }
    }
}
