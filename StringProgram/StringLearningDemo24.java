// panagram or not?
public class StringLearningDemo24 {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        if (ispangram(s)) {
            System.out.println("yes");
        } else {
            System.out.println("Not");
        }

    }

    public static boolean ispangram(String s) {
        boolean[] b = new boolean[26];
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                index = s.charAt(i) - 'A';
            } else if (s.charAt(i) >= 'a' & s.charAt(i) <= 'z') {
                index = s.charAt(i) - 'a';
            } else {
                continue;
            }
            b[index] = true;
        }
        for (int i = 0; i < 25; i++) {
            if (b[i] == false) {
                return false;
            }
            // System.out.println(b[i]);
        }
        return true;
    }
}
