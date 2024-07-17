public class Demo3 {
    public static void main(String[] args) {
        print_reverse(12345);
        find_count_of_digits(12345);
        find_sum_of_digit(213456);

        int sum = sum_of_digits_until_single_digit(123456);
        while (sum > 9) {
            sum = sum_of_digits_until_single_digit(sum);
        }
        System.out.println(sum);

        find_palindrome(121);
        find_armstrong(8208);
    }

    public static void print_reverse(int no) {
        while (no > 0) {
            System.out.print(no % 10);
            no = no / 10;
        }
    }

    public static void find_count_of_digits(int no) {
        int count = 0;
        while (no > 0) {
            no = no / 10;

            count++;
        }
        System.out.println("count of digit is " + count);

    }

    public static void find_sum_of_digit(int no) {
        int sum = 0;
        while (no > 0) {
            sum = sum + no % 10;
            no = no / 10;
        }
        System.out.println(sum);
    }

    public static int sum_of_digits_until_single_digit(int no) {
        int sum = 0;
        while (no > 0) {
            sum = sum + no % 10;
            no = no / 10;
        }
        return sum;

    }
    public static void  find_palindrome(int no){
        int reverse=0;
        while(no>0){
            reverse=(reverse*10)+no%10;
            no=no/10;
        }
        if(no==reverse){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
    public static void  find_armstrong(int no){
        int armstrong=0;
        int digits=count_of_digit(no);
        // take copy
        int no2=no;
        while(no>0){
            int rem=no%10;
            // armstrong=armstrong+(rem*rem*rem);
            int value=find_power(rem, digits);
            armstrong=armstrong+value;
            no=no/10;
        }
        if(no2==armstrong){
            System.out.println("Armstrong Number "+armstrong);
        }
        else{
            System.out.println("Not A Armstrong "+armstrong);
        }
    }
    public static int find_power(int base,int power){
        int box=1;
        while(power>=1){
            box=box*base;
            power--;
        }
        // System.out.println(box);
        return box;
    }
    public static int count_of_digit(int no){
        int count=0;
        while(no>0){
            no=no/10;
            count++;
        }
        return count;

    }
}
