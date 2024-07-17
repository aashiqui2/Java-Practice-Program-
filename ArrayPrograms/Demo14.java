//? delete an element from array
public class Demo14 {
    public static void main(String[] args) {
        int[] array = { 5, 2, 7, 3, 1, 8, 4, 6 };
        int elementToDelete = 3; // Element to delete

        // Print the original array
        System.out.println("Original array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Delete the specified element from the array
        array = deleteElement(array, elementToDelete);

        // Print the modified array
        System.out.println("Array after deleting element " + elementToDelete + ":");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    public static int[] deleteElement(int[] arr, int element) {
        int[] newArray = new int[arr.length - 1];
        int index = -1;
        // Find the index of the element to delete
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            }
        }
        // If element is not found, return the original array
        if (index == -1) {
            return arr;
        }
        // Copy elements from the original array to the new array
        // Skipping the element to delete
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArray[j++] = arr[i];
            }
        }

        return newArray;
    }
}
