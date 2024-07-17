public class Demo2 {
    public static void main(String[] args) {
        addition_of_first_n_number(5);
        factorial(5);
        // ? Math Function
        // double java.lang.Math.pow(double a, double b)
        find_power(2,5);
        System.out.println(Math.pow(2,5));//returns a number which is double dy default
        System.out.println("Ceil "+Math.ceil(2.3));
        System.out.println("Floor "+Math.floor(2.3));
        System.out.println(Math.floorDiv(16,3));
        System.out.println(Math.abs(-5));
        
        // ? Prime Number 
        int no=2;
        int prime_count=0;
        while(prime_count<10){
            int result=first_10_prime_number(no);
            if(result>0){
                System.out.println("Prime Number "+ no); 
                prime_count++; 
            }
            // else{
            //     System.out.println("Not a Prime "+ no);
            // }
            no++;
        }
    }

    public static void  addition_of_first_n_number(int cap){
        int sum=0;
        int no=1;
       while(no<=cap){
            sum+=no;
            no++;
        }
        System.out.println(sum);
      
    }
    public static void factorial(int cap){
        int sum=1;
        int no=1;
       while(no<=cap){
            sum*=no;
            no++;
        }
        System.out.println(sum);

    }
    public static void find_power(int base,int power){
        int box=1;
        while(power>=1){
            box=box*base;
            power--;
        }
        System.out.println(box);
    }
    public static int first_10_prime_number(int no){
        int div=2;
        int count=0;
        while(div<=(no/2)){
            if(no%div==0){
                count++;
                // System.out.println("Not a prime "+ no);
                return -1;
            }
            div++;
        }
        if(count==0){
            return no;
        }
        return  no;
    }
}
