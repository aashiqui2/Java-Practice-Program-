public class Pattern5 {
    public static void main(String[] args) {
        pattern5(5);
    }

    private static void pattern5(int n) {
        for(int row=1;row<n*2;row++){
            int totalColInRow=row>n ? 2*n-row:row;
            for(int col=1;col<totalColInRow;col++){
                System.out.print("* ");
            }                         
            System.out.println();  
        }
    }
}

/*9 rows
*
* *       
* * *     
* * * *   
* * * * * 
* * * *   
* * *     
* *       
*
*/ 
