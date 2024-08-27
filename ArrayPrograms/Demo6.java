//?sum of array
public class Demo6 {
    public static void main(String[] args) {
        int arr[] = {12, 13, 1, 10, 34, 10};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
