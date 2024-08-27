public class Demo30 {

    public static int countSubsetsWithSum(int[] arr, int targetSum) {
        int n = arr.length;
        int[][] dp = new int[n + 1][targetSum + 1];

        // Initialize the dp array
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1; // There is always one way to get 0 sum: with the empty subset
        }
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<11;j++)
            {
                System.out.print(dp[i][j]);
            }
            System.out.println();
        }

        // Fill the dp array
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= targetSum; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - arr[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][targetSum];
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int targetSum = 10;
        System.out.println("Number of subsets with sum " + targetSum + ": " + countSubsetsWithSum(arr, targetSum));
    }
}
