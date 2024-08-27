//? printing even elements in a array
import java.util.Scanner;
public class Demo16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int[] a=new int[len];
        int i=0;
        for(int j=0;j<a.length;j++){
            a[j]=sc.nextInt();
        }
        while(i<a.length){
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
            i++;
        }
        sc.close();
    } 
}
