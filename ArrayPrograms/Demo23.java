//! right rotate
public class Demo23 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
                //  0  1  2  3  4
        int k = 1;
        for(int i=1;i<=k;i++)
        {
            int last=a[a.length-1];
            for(int j=a.length-1;j>0;j--){
                a[j]=a[j-1];
            }
            a[0]=last;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
