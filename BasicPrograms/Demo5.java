public class Demo5 {
    public static void main(String[] args) {
        find_fact(5);
       // ? Printing 1*10 2*9 2*8 ..
        print_multiplication(1,10);
        print_1_11_121(1);
        print_1_8_27_64(3);
        print_1_4_9_16(2);
        print_1_4_27_256(1);
        square_root(16);
    }

    public static void find_fact(int no) {
        int fact = 1;
        int no2=no;
        while (no > 0) {
            fact = fact * no;
            no--;
        }
        System.out.println("Factoarial of "+no2+" is "+fact);
        no2=no2-1;
        if(no2>0){
            find_fact(no2);
        }
        
    }
    public static void print_multiplication(int start,int end){
        while(end>start){
            System.out.println(start+" * "+end+" = "+start*end);
            start++;
            end--;

        }
    }
    public static void  print_1_11_121(int no){
        while(no<=121){
            System.out.println(no);
            no=no*11;
        }
    }
    public static void  print_1_8_27_64(int power){
        int no=1;
        while(no<=4){
            int result=find_power(no,power);
            System.out.println(result);
            no++;
        }
       
    }
    public static int find_power(int base,int power){
        int box=1;
        while(power>0){
            box=box*base;
            power--;

        }
        return box;
    }
  public static  void print_1_4_9_16(int power){
        int no=1;
        while(no<=4){
            int result=find_power(no,power);
            System.out.println(result);
            no++;
        }
    }
    public static void  print_1_4_27_256(int power){
        int no=1;
        while(no<=4){
            int result=find_power(no,power);
            power++;
            System.out.println(result);
            no++;
        }
    }
    public static void  square_root(int no){
        int div=2;
        while(div<(no/2)){
            if(no/div==div){
                System.out.println("Square root is "+ div);
                break;
            }
            div++;
        }
       
    }
}
