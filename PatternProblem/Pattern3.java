public class Pattern3 {
    public static void main(String[] args) {
        pattern3(5);
    }
    private static void pattern3(int n) {
        for(int row=1;row<=n;row++){
            // for(int col=n-row+1;col>=1;col--)
            for(int col=n;col>=row;col--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/*
    *****
    ****
    ***
    **
    *
 */