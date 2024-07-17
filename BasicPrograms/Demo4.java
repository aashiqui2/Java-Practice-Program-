public class Demo4 {
    public static void main(String[] args) {
        find_Neon(9);
        find_strong_number(145);
        find_spy_number(22);
    }

    public static void find_Neon(int no) {
        int result = find_power(no, 2);
        int sum = find_sum(result);
        if (sum == no) {
            System.out.println("Neon Number");
        } else {
            System.out.println("Not a Neon Number");
        }
    }

    public static int find_power(int base, int power) {
        int box = 1;
        while (power > 0) {
            box = box * base;
            power--;
        }
        return box;
    }

    public static int find_sum(int no) {
        int sum = 0;
        while (no > 0) {
            sum = sum + no % 10;
            no = no / 10;
        }
        return sum;
    }

    public static void find_strong_number(int no) {//1! 4! 5!
        int rem = 0, sum = 0;
        int no2=no;
        while (no > 0) {
            rem = no % 10;
            int result = find_factorial(rem);
            sum = sum + result;
            no=no/10;
        }
        if(no2==sum){
            System.out.println("Strong Number "+ sum);
        }
        else{
            System.out.println("Not a Strong Number "+ sum);
        }

    }
    public static int  find_factorial(int cap){
        int sum=1;
        int no=1;
       while(no<=cap){
            sum*=no;
            no++;
        }
        return sum;
    }
    public static void  find_spy_number(int no){
        int rem=0,sum=0,prod=1;
        while(no>0){
            rem=no%10;
            sum=sum+rem;
            prod=prod*rem;
            no=no/10;
        }
        String result=sum==prod?"Spy number":"Not a spy number";
        System.out.println(result);
       
    }
}
