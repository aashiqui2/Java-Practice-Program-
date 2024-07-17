// ? Multiplication of odd length array 4 10 18 7
public class Demo2 {
    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={4,5,6,7};

        // int l1=a.length;
        // int l2=b.length;
        
        int small,large;
        // if(l1<l2){
        //     small=l1;
        //     large=l2;
        // }
        // else{
        //     small=l2;
        //     large=l2;
        // }

        // ! ternary operator
        // small=l1<l2? l1:l2;
        // large=l1>l2?l1:l2;

        small=a.length<b.length?a.length:b.length;
        large=a.length>b.length?a.length:b.length;

        int[] c=new int[large];

        for(int i=0;i<small;i++){
                c[i]=a[i]*b[i];
        }

        c[large-1]=b[large-1];//hard cording
        
        for(int i=0;i<large;i++){
            System.out.print(c[i]+" ");
        }

    }
}
