//?  second minimum element in an array
public class Demo7 {
    public static void main(String[] args) {
        int arr[] = { 10,30,20,40,50};
        int len = arr.length;
        System.out.println(secLargest(arr, len));
        // int sec_smallest = Integer.MAX_VALUE;
        // System.out.println(sec_smallest);      
    }
    private static int secLargest(int[] arr, int n) {
        // int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        //   for (int i = 0; i < n; i++) {
        //     if (arr[i] < first) {
        //         second = first;
        //         first = arr[i];
        //     } else if (arr[i]< second)
        //         second = arr[i];
        // }
        int min=arr[0];
        for(int i=0;i<n;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        int secMin=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=min &&arr[i]<secMin)
            {
                secMin=arr[i];
            }
            
        }
        // return second;
        return secMin;
    }
}
