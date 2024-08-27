//? storing negative elements in a new array
public class Demo18 {
    public static void main(String[] args) {
        int[] a={-10,20,30,40,-50,-60};
        int negative=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                negative++;
            }
        }
        int[] b=new int[negative];
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                b[j]=a[i];
                j++;
            }
        }
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}
