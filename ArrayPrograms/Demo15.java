//? printing odd index array 
public class Demo15 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
                 // 0  1  2  3   4
        for(int i=0;i<a.length;i++){
            if(i%2!=0){
                System.out.println(a[i]);
            }
        }
    // ! Alternative way
        // int[] a={10,20,30,40,50,60,70};
        //       // 0   1  2  3  4 5
        // int i=1;
        // while(i<a.length){
        //     System.out.println(a[i]);
        //     i+=2;
        // }

    }

}
