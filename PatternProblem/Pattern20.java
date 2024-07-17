public class Pattern20 {
    static public void main(String[] args) {

        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 4; col++) {
                if (col == 1 || col == 4|| row==1 ||row ==5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
/*  
****
*  *
*  *
*  *
****
 */
