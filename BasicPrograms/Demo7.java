import java.util.*;

public class Demo7 {
    public static void main(String[] args) {
        // find_vowels_consonent();
        // find_cube(4);
        // find_pattern12(10);
        // find_pattern13(4);
        // find_pattern14(4);
        find_pattern15(4);

    }

    public static void find_vowels_consonent() {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
        boolean vowels = input.charAt(0) == 'A' || input.charAt(0) == 'a' || input.charAt(0) == 'e'
                || input.charAt(0) == 'E' || input.charAt(0) == 'I' || input.charAt(0) == 'i' || input.charAt(0) == 'O'
                || input.charAt(0) == 'o' || input.charAt(0) == 'u' || input.charAt(0) == 'U';
        if (!(uppercase || lowercase)) {
            System.out.println("Not a  character");
        } else if (vowels) {
            System.out.println("Given character is vowels ");
        }
        sc.close();

    }

    public static void find_cube(int no) {
        for (int i = 1; i <= no; i++) {
            System.out.println(i * i * i);
        }
    }

    public static void find_pattern12(int no) {
        for (int i = 1; i <= no; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void find_pattern13(int no) {
        int num = 1;
        for (int i = 1; i <= no; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
            }
            num++;
            System.out.println();
        }
    }

    public static void find_pattern14(int no) {
        int num = 1;
        for (int i = 1; i <= no; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }

    public static void find_pattern15(int n) {
        int space = n + 4 - 1;// 4+4-1//7
        for (int i = 1; i <= n; i++) {
            for (int j = space; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
            space--;
        }
    }
}
