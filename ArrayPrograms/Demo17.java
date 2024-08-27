//? Insert an element in middle of array and print the array
public class Demo17 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9,10};
               //0  1  2  3  4  5  6  7  8
        int no=11;
        // int temp=a[2];  
        int[] b=new int[a.length+1];

        // b[0]=a[0];
        // b[1]=a[1];
        // b[2]=no;
        // b[3]=a[3];
        // b[4]=a[4];

        for(int i=0;i<a.length/2;i++){
            b[i]=a[i];
        }
        b[a.length/2]=no;
        int start=(a.length/2)+1;
        System.out.println("start "+start);
        for(int i=start;i<b.length;i++){
            b[i]=a[i-1];
        }

        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
    
}
