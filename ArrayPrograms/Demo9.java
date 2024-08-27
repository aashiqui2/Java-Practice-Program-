//? Java Program to Remove Duplicates in a Sorted Array
public class Demo9 {
    public static void main(String[] args) {
        int[] sortedArray = { 1, 1, 2, 2, 3, 4, 4, 5, 5, 6 };
        int[] uniqueArray = removeDuplicates(sortedArray);

        // Print the unique array
        for (int i = 0; i < uniqueArray.length; i++) {
            System.out.print(uniqueArray[i] + " ");
        }
    }

    public static int[] removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums;
        }
  
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                j++;
                nums[j] = nums[i];
            }
        }
        int[] uniqueArray = new int[j + 1];
        for (int i = 0; i < uniqueArray.length; i++) {
            uniqueArray[i] = nums[i];
        }
        return uniqueArray;
    }
}
 