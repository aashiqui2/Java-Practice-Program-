// find the third minimun
import java.util.Scanner;

public class Demo28 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find the third minimum element
        Integer thirdMin = findThirdMinimum(arr);

        if (thirdMin == null) {
            System.out.println("The array does not have a third distinct minimum element.");
        } else {
            System.out.println("The third minimum element is: " + thirdMin);
        }

        scanner.close();
    }

    public static Integer findThirdMinimum(int[] arr) {
        if (arr.length < 3) {
            return null; // Not enough elements for a third minimum
        }

        Integer first = Integer.MAX_VALUE;
        Integer second = Integer.MAX_VALUE;
        Integer third = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num == first || num == second || num == third) {
                continue; // Skip duplicates
            }

            if (num < first) {
                third = second;
                second = first;
                first = num;
            } else if (num < second) {
                third = second;
                second = num;
            } else if (num < third) {
                third = num;
            }
        }

        // Check if we have found at least three distinct minimums
        return (third == Integer.MAX_VALUE) ? null : third;
    }
}
