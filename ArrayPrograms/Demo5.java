//?  second minimum element in an array
public class Demo5 {
    public static void main(String[] args) {
        int arr[] = { 10, 30, 20, 40, 50 };
        int len = arr.length;
        System.out.println("First Minimum " + FirstMinimum(arr, len));
        System.out.println("Second Minimum " + SecMinimum(arr, len));
        System.out.println("Third Minimum " + ThirdMinimum(arr, len));
        System.out.println("Second Maximum " + SecMaximum(arr, len));
        System.out.println("MaximumElement " + Maximun(arr, len));
        // int sec_smallest = Integer.MAX_VALUE;
        // System.out.println(sec_smallest);
    }

    public static int FirstMinimum(int[] arr, int n) {
        int small = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (small > arr[i]) {
                small = arr[i];
            }
        }
        return small;

    }

    public static int SecMinimum(int[] arr, int n) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < first) {
                second = first;
                first = arr[i];
            } else if (arr[i] < second)
                second = arr[i];
        }
        return second;

    }

    public static int ThirdMinimum(int[] arr, int n) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE, third = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] < second && arr[i] != first) {
                third = second;
                second = arr[i];
            } else if (arr[i] < third && arr[i] != first && arr[i] != second) {
                third = arr[i];
            }
        }

        return third;
    }

    public static int Maximun(int[] arr, int n) {
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int SecMaximum(int[] arr, int n) {
        int first =arr[0], second = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        return second;

    }

}
