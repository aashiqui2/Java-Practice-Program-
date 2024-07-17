import java.util.Collections;
import java.util.*;

public class Demo9 {
    public static void main(String[] args) {
        int n = 7596801;
        String s = Integer.toString(n);
        Character[] c = new Character[s.length()];
        for (int i = 0; i < c.length; i++) {
            c[i] = s.charAt(i);
        }
        Arrays.sort(c, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (Character ch : c) {
            sb.append(ch);
        }
        System.out.println(sb.toString());

    }
}