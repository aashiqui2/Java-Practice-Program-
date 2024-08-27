//! Binary search

public class Demo26 {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50};
        int left=0;
        int right=a.length-1;
        int searchItem=50;
        int result=Binary_Search(a,left,right,searchItem);
        if(result==-1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Found");
        }
          
    }
    public static int Binary_Search(int[] a,int left,int right,int searchItem){
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(a[mid]==searchItem){
                return mid;
            }
            else if(a[mid]<searchItem){
                left= mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }
}
