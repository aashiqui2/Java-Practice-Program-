// ? Multiplication of odd length array 4 10 18 7 (updated version)
public class Demo3 {
    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={4,5,6,4};
        int small,large;
        small=a.length<b.length?a.length:b.length;
        large=a.length>b.length?a.length:b.length;
        System.out.println("small " + small);
        System.out.println("large " + large);

        int[] c=new int[large];
        for(int i=0;i<small;i++){
                c[i]=a[i]*b[i];
        }

        if(a.length>b.length){
            c[c.length-1]=a[a.length-1];
        }
        else if(b.length>a.length){
            c[c.length-1]=b[b.length-1];
        }

        for(int i=0;i<large;i++){
            System.out.println(c[i]);
        }

    }
}
