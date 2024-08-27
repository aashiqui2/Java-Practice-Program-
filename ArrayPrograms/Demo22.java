// ! Right rotation
public class Demo22 {
    static public void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
                //  0  1  2  3  4
        int k = 1;
        for (int i = 1; i <= k; i++) {
            int first = a[0];
            for (int j = 0; j < a.length - 1; j++) {
                a[j] = a[j + 1];
            }
            a[a.length - 1] = first;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}

// class Solution {
//     // Function to rotate an array by d elements in counter-clockwise direction.
//    static void rotateArr(int arr[], int k, int n)
//     {
//         // add your code here
//         Solution ob=new Solution();
//         k=k%n;
//         reverse(arr,0,k-1);
        
//         reverse(arr,k,n-1);
        
//         reverse(arr,0,n-1);
        
//     }
//     static void reverse(int[] arr,int start,int end){
//         while(start<=end){
//         int temp=arr[start];
//         arr[start]=arr[end];
//         arr[end]=temp;
//         start++;
//         end--;
//         }
        
//     }
// }
