//?descending order sorting array
public class Demo13 {
    public static void main(String[] args) {
        int[] array = {5, 2, 7, 3, 1, 8, 4, 6};
        // Sorting the array in descending order using insertion sort
        insertionSortDescending(array);
        // Printing the sorted array
        System.out.println("Sorted array in descending order:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    public static void insertionSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    } 
}
