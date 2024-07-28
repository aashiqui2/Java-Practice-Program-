// Multiples of 3 and 5
public class Demo1 {
    public static void main(String[] args) {
        // count_of_divisor(120);
        // divisible_of_3_and_5();
        // isprime(3);
        // find_common_divisor(100,120);
        // find_greatest_common_divisor(100,120);//gcd//hcf
        // previous_greatest_common_divisor(100,120);
        least_common_multiple(3, 10);
    }

    public static void count_of_divisor(int no) {
        int div = 2;
        int count = 0;
        while (div <= (no / 2)) {
            // instead of running the loop from 2 to 120 the half ofits is a divisor
            if (no % div == 0) {
                System.out.print(div + " ");
                count++;
            }
            div++;
        }
        System.out.println(count);
    }

    public static void divisible_of_3_and_5() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println(i);
        }
    }

    public static void isprime(int no) {
        int div = 2;
        int count = 0;
        while (div <= (no / 2))// 2 to 50
        {
            if (no % div == 0) {
                count++;
                System.out.println("Not a Prime");
                break;
            }
            div++;
        }
        if (count == 0) {
            System.out.println("Given Number is Prime");
        }
    }

    public static void find_common_divisor(int no1, int no2) {
        int div = 2;
        // int small=0;
        // if(no1<no2){
        // small=no1;
        // }
        // ! using ternary
        int small = (no1 < no2) ? no1 : no2;
        while (div <= small / 2) {
            if (no1 % div == 0 && no2 % div == 0) {
                System.out.print(div + " ");
            }
            div++;
        }

    }

    public static void find_greatest_common_divisor(int no1, int no2) {
        int last = 0;
        int div = 2;
        int small = no1 < no2 ? no1 : no2;
        while (div <= small) {
            if (no1 % div == 0 && no2 % div == 0) {
                last = div;
            }
            div++;
        }
        System.out.println(last);
    }

    public static void previous_greatest_common_divisor(int no1, int no2) {
        int div = 2;
        int small = no1 < no2 ? no1 : no2;
        int last = 0;
        int prev = 0;
        while (div <= small) {
            if (no1 % div == 0 && no2 % div == 0) {
                prev = last;
                last = div;
            }
            div++;
        }
        System.out.println(prev);
    }

    public static void least_common_multiple(int no1, int no2) {
        int max = no1 > no2 ? no1 : no2;
        System.out.println(max);
        while (true) {
            if (max % no1 == 0 && max % no2 == 0) {
                System.out.println("LCM IS " + max);
                break;
            }
            max = max + 1;
        }
    }
}

//10%3==0 && 10%10==0
// 11%3==0 && 11%10==0
// 12%3==0 && 12%10==0

