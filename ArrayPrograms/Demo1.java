// ? Multiplication of odd length array 4 10 18 7 (updated version 2)
public class Demo1 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,8,9};
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
            for(int i=small;i<c.length;i++){
                c[i]=a[i];
            }
        }
        else if(b.length>a.length){
            for(int i=small;i<c.length;i++){
                c[i]=b[i];
            }
          
        }

        for(int i=0;i<large;i++){
            System.out.println(c[i]);
        }

    }
}
