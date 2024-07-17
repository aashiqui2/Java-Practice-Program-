public class Demo1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        if(arr.length==0){
            return;
        }
        long sum=0,max=arr[0],min=arr[0];
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.printf("%d %d",(sum-max),(sum-min));
    }
}


