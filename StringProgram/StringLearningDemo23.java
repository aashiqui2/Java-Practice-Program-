public class StringLearningDemo23 {
    public static void main(String[] args) {
        String s = "3";
        String s1 = "4";
        char c[] = s.toCharArray();
        char c1[] = s1.toCharArray();

        // int a= Integer.valueOf(s);
        // int b= Integer.valueOf(s1);
        // System.out.println(a*b);



        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < c.length; i++) {
            count1 = count1 * 10 + (c[i] - '0');
        }
        for (int i = 0; i < c1.length; i++) {
            count2 = count2 * 10 + (c1[i] - '0');
        }
        System.out.println(count1 * count2);
    }
}
