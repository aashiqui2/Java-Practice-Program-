public class H {
    public static void main(String[] args) {
        for(int i=0;i<7;i++) {
            for(int j=0;j<5;j++) {
                if(j==0 || i==3 || j==4)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}