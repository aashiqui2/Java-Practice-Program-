// ?Bubble sort
public class Demo10 {
    public static void main(String[] args) {
        int[] array = { 5, 2, 7, 3, 1, 8, 4, 6 };
        bubbleSort(array);

        // Printing the sorted array
        System.out.println("Sorted array in ascending order:");
        // for (int num : array) {
        // System.out.print(num + " ");
        // }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i<n; i++) {
            for (int j = 0; j <n-1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
/* this is also applicable
   for (let i = 0; i < arr.length; i++) {
    for (let j = 1; j < arr.length; j++) {
      if (arr[j - 1] > arr[i]) {
        temp = arr[j - 1];
        arr[j - 1] = arr[i];
        arr[i] = temp;
      }
    }
 */
