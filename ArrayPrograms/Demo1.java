//? multiplication of two arrays
public class Demo1 {
    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={4,5,6};
        if(a.length==b.length){
            int[] c=new int[a.length];
            for(int i=0;i<a.length;i++){
                    c[i]=a[i]*b[i];
            }
            for(int i=0;i<a.length;i++){
                System.out.println(c[i]);
            }
        }

    }
}
