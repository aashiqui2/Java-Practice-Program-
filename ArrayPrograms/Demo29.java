// sort based on the factorial
public class Demo29 {

    public static void main(String[] args) {
        int[] arr = { 12,5,4,2,3};

        sortByFactorial(arr);

        System.out.println("Array sorted based on factorial values:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void sortByFactorial(int[] arr) {
        int n = arr.length;
        long[] factorials = new long[n];

        for (int i = 0; i < n; i++) {
            factorials[i] = factorial(arr[i]);
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (factorials[j] > factorials[j + 1]) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    long tempFact = factorials[j];
                    factorials[j] = factorials[j + 1];
                    factorials[j + 1] = tempFact;
                }
            }
        }
    }

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
