// sort based on the factorial
public class Demo31 {

    public static void main(String[] args) {
        int[] arr = { 12,5,4,2,3};

        // Sort the array based on the factorial values of the elements
        sortByFactorial(arr);

        // Print the sorted array
        System.out.println("Array sorted based on factorial values:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Method to sort the array based on the factorial values of the elements
    public static void sortByFactorial(int[] arr) {
        int n = arr.length;
        long[] factorials = new long[n];

        // Compute the factorials and store them in the factorials array
        for (int i = 0; i < n; i++) {
            factorials[i] = factorial(arr[i]);
        }

        // Sort the array using bubble sort based on the factorial values
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (factorials[j] > factorials[j + 1]) {
                    // Swap elements in arr
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    // Swap corresponding elements in factorials
                    long tempFact = factorials[j];
                    factorials[j] = factorials[j + 1];
                    factorials[j + 1] = tempFact;
                }
            }
        }
    }

    // Method to compute the factorial of a number
    public static long factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        long fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
