public class Pattern17 {
    public static void main(String[] args) {
        pattern10(5);
    }

    private static void pattern10(int n) {

        for(int row=1;row<n*2;row++){
            int totalColInRow=row>n?2*n-row:row;
            int noOfSapces=n-totalColInRow;
            for(int spaces=1;spaces<=noOfSapces;spaces++){
                System.out.print("  ");
            }
            for(int col=totalColInRow;col>=1;col--){
                System.out.print(col+" ");
            }
            for(int col=2;col<=totalColInRow;col++){
                System.out.print(col+" ");
            }

            System.out.println();
        }
    }


}
/*
      1 
    2 1 2 
  3 2 1 2 3 
4 3 2 1 2 3 4
  3 2 1 2 3 
    2 1 2 
      1
 */