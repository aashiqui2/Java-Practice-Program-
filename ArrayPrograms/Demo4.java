//?  minimum element in an array
public class Demo4 {
    public static void main(String[] args) {
        int arr[] = {12, 13, 1, 10, 34, 10};
        int small=arr[0];
        for(int i=1;i<arr.length;i++){
            if(small>arr[i]){
                small=arr[i];
            }
        }
        System.out.println(small);
    }
}
