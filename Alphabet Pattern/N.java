public class N {
    public static void main(String[] args) {
        for(int i=0;i<7;i++) {
            for(int j=0;j<7;j++) {
                if(j==0 || j-i==0 || j==6)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}