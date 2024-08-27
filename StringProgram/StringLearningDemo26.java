public class StringLearningDemo26 {
    public static void main(String[] args) {
        String s = "moeem";
        boolean b[] = new boolean[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (!b[i]) {
                int count = 0;
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        count++;
                        b[j] = true;
                    }
                }
                if (count > 0) {
                    System.out.println(s.charAt(i) + " comes " + count);
                }
            }
        }

    }
}
