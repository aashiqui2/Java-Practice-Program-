public class Pattern7 {
    public static void main(String[] args) {
        pattern7(5);
    }

    public static void pattern7(int n) {
        for (int row = n; row >= 1; row--) {
            for (int space = 1; space <= 2 * (n - row); space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

/*
 * * * * *
 * * * *
 * * *
 * *
 * 
 */
