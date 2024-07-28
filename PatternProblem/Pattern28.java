public class Pattern28 {
    public static void main(String[] args) {
        pattern8(5);
    }

    private static void pattern8(int n) {
        for(int row=1;row<n*2;row++){
            int totalStarts=row>n ? 2*n-row:row;
            int noOfSpaces=n-totalStarts;
            for(int spaces=1;spaces<=noOfSpaces;spaces++){
                System.out.print(" ");
            }
            for(int col=1;col<totalStarts;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
       
    }
}

/*
    
   *
  * *
 * * *
* * * *
 * * *
  * * 
   *

*/
