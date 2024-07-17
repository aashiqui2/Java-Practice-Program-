public class J {
    public static void main(String[] args) {
        for(int i=0;i<7;i++) {
            for(int j=0;j<5;j++) {
                 if(j==2 || i==0 || i==6 && j!=3 && j!=4 || i==5 && j!=3 && j!=4 && j!=1) 
                    System.out.print("*");
                else 
                    System.out.print(" "); 
            }
            System.out.println();
        }
    }
}