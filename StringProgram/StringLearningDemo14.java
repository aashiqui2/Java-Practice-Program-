// ?sort the string in ascending order
public class StringLearningDemo14 {
    public static void main(String[] args) {
        String s = "dcba";
        char[] c = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length() - 1; j++) {
                if (c[j] > c[j + 1]) {
                    char ch = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = ch;
                }
            }
        }
        // for(int i=0;i<c.length;i++){
        // System.out.print(c[i]+" ");
        // }
        String temp = new String(c);
        System.out.println(temp);

    }
}
