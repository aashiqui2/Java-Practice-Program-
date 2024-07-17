public class Pattern9 {
    public static void main(String[] args) {
        int n=5;
        for(int row=n;row>=1;row--)
        {
            for(int space=1;space<=n-row;space++)
            {
                System.out.print(" ");
            }
            for(int col=1;col<=2*row-1;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*  
*********
 *******
  *****
   ***
    *
 */