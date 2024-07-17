public class Pattern11 {
    public static void main(String[] args) {
        pattern8(5);
    }

    public static void pattern8(int n) {
        for (int row = n; row>=1; row--) {

            for (int space = 1; space <= n - row; space++) {
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
