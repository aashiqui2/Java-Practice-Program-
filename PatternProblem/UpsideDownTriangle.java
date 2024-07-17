public class UpsideDownTriangle {

    // Function to print the pattern
    public static void printPattern(int n) {
        // int totalElements = n * (n + 1) / 2;
        int[][] leftHalf = new int[n][];
        int[][] rightHalf = new int[n][];

        // Initialize the arrays for each row
        for (int i = 0; i < n; i++) {
            leftHalf[i] = new int[n - i];
            rightHalf[i] = new int[n - i];
        }

        int num = 1;

        // Fill the left half array with numbers
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                leftHalf[i][j] = num++;
            }
        }

        // Fill the right half array with numbers
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n - i; j++) {
                rightHalf[i][j] = num++;
            }
        }

        // Print the pattern
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int space = 0; space < 2 * i; space++) {
                System.out.print(" ");
            }

            // Print the left half of the row
            for (int j = 0; j < leftHalf[i].length; j++) {
                System.out.print(leftHalf[i][j]);
                if (j != leftHalf[i].length - 1) {
                    System.out.print("*");
                }
            }

            if (i != n - 1) {
                System.out.print("*");
            }

            // Print the right half of the row
            for (int j = 0; j < rightHalf[i].length; j++) {
                System.out.print(rightHalf[i][j]);
                if (j != rightHalf[i].length - 1) {
                    System.out.print("*");
                }
            }

            // Move to the next line
            System.out.println();
        }
    }

    // Driver code
    public static void main(String[] args) {
        int N = 4;

        // Function call
        printPattern(N);
    }
}
