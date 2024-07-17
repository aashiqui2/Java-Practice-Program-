//! Input a number of maximum three digit and print the number in words.
//? Eg. Enter a Number of 3-digits : 457
//? Number In Words: Four Hundred Fifty Seven 

import java.util.Scanner;
public class Demo8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number (3-digit number )");
        int n = in.nextInt();
        wordNumber(n);
        in.close();
    }

    public static void wordNumber(int n) {
        if (n < 1 || n > 999) // condition for wrong input, -ve condition
            System.out.println("Wrong Input,Sorry");
        else {
            int u = n % 10;// last digit
            int tt = n / 10;
            int t = tt % 10;// second digit
            int h = n / 100;// fist digit
            String uw[] = { " ", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                    "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
                    "Ninteen" };
            String tw[] = { " ", "Ten", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
            String hw = " Hundred ";
            if (n < 20)// till 19
                System.out.println(uw[n]);
            else if (n < 100)// till 99
                System.out.println(tw[t] + " " + uw[u]);
            else // from 100 to 999
                System.out.println(uw[h] + hw + tw[t] + " " + uw[u]);
        }
    }
}
