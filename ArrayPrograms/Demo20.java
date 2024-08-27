//?Storing array reversely first-->last, second-->Third, Third-->third
public class Demo20 {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50};
              // 0  1  2  3  4
        System.out.println("Before Swapping");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        // temp=a[1];
        // a[1]=a[3];
        // a[3]=temp;
        int j=a.length-1;
        for(int i=0;i<a.length/2;i++){
           int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            j--;
        }
        System.out.println();
        System.out.println("After Swapping");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
