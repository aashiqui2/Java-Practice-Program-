public class Pattern10 {
    public static void main(String[] args) {
        pattern8(5);
    }

    public static void pattern8(int n) {
        for (int row = 1; row <= n; row++) {

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
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 */
