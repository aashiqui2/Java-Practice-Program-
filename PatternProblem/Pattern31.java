public class Pattern31 {
    public static void main(String[] args) {
        pattern11(4);
    }

    private static void pattern11(int n) {
        int originalM = n;
        n = 2 * n - 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                int atEveryIndex = originalM - Math.min(Math.min(row, col), Math.min(n - row + 1, n - col + 1));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
    /*
    3 3 3 3 3 3 3 
    3 2 2 2 2 2 3 
    3 2 1 1 1 2 3 
    3 2 1 0 1 2 3 
    3 2 1 1 1 2 3 
    3 2 2 2 2 2 3 
    3 3 3 3 3 3 3 
    */
