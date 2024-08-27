//! Linear search
import java.util.Scanner;
public class Demo25 {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element to search");
        int k=sc.nextInt();
        for(int i=0;i<a.length;i++){
            if(k==a[i]){
                System.out.println("Found");
            }
            else{
                System.out.println("Not found");
            }
        }
        sc.close();
    }
    
}
