//? printing one and skip one array from first
public class Demo15 {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50};
              // 0  1  2  3  4
        int i=0;
        while(i<a.length){
            System.out.println(a[i]);
            // i++;
            // i++;
            i+=2;
        }
    }
    
}
