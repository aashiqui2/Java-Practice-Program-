public class Demo6 {
    public static void main(String[] args) {
        binary_to_decimal(101);
        // decimal_to_binary(6);
        // swap_two_number(20,30);
        // swap_without_temp(20,15);
        find_fibonaci(5);
    }
    public static void   binary_to_decimal(int no){
        int decimal=0;
        int power=0;
        while(no>0){
            int rem=no%10;
            int result=rem*find_power(2,power);
            decimal=decimal+result;
            no=no/10;
            power++;
        }
        System.out.println(decimal);
    }
    public static int find_power(int base,int power){
        int box=1;
        while(power>0){
            box=box*base;
            power--;
        }
        return box;
    }
    public static void decimal_to_binary(int no){
        String binary="";
        while(no>0){
            int rem=no%2;
            binary=rem+binary;//0//1//1
            no=no/2;
        }
        System.out.println(binary);
      
    }
    public static void swap_two_number(int a,int b){
        System.out.println("Before Swapping");
        System.out.println(a);
        System.out.println(b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping");
        System.out.println(a);
        System.out.println(b);
    }
    public static void  swap_without_temp(int a ,int b){
        System.out.println("Before Swapping");
        System.out.println(a);
        System.out.println(b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping");
        System.out.println(a);
        System.out.println(b);
    }
    public static void find_fibonaci(int no){
        int a=0,b=1,temp=0;
        System.out.print(a+" ");
        System.out.print(b+" ");
        while(temp<=5){
            temp=a+b;
            a=b;
            b=temp;
            System.out.print(temp+" ");
        }
    }
}
