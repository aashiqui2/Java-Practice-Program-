public class Pattern36{
    public static void main(String[] args)
    {
      int n=5;
      for(int row=1;row<=n;row++){
        for(int col=1;col<=row;col++){
            if(col%2==0){
                System.out.print("# ");
            }
            else{
                System.out.print("* ");
            }
        }
        System.out.println();
      }
    }
}


/*
* 
* # 
* # *
* # * #
* # * # * 
 */