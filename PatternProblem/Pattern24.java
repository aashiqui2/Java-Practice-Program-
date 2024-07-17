 public class Pattern24 {
    static   public void main(String[] asd)
    {
      int n=5;
      for(int row=1;row<=n;row++)
      {
        for(int star=1;star<=row;star++)
        {
            if(star==1||star==row)
            {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        for(int space=1;space<=2*(n-row);space++)
        {
            System.out.print(" ");
        }
        for(int star=1;star<=row;star++)
        {
            if(star==1||star==row)
            {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
      }

    //   lower part
     for(int row=n;row>=1;row--)
      {
        for(int star=1;star<=row;star++)
        {
            if(star==1||star==row)
            {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        for(int space=1;space<=2*(n-row);space++)
        {
            System.out.print(" ");
        }
        for(int star=1;star<=row;star++)
        {
            if(star==1||star==row)
            {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
      }
       
         
    }
}

/*  
       *        *
       **      **
       * *    * *
       *  *  *  *
       *   **   *
       *   **   *
       *  *  *  *
       * *    * *
       **      **
       *        *

   */
