//? separate the words and print it
public class StringLearningDemo15 {
    public static void main(String[] args) {
        String s = "hello wolrd";
        s = s.trim();
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                temp += s.charAt(i);
            }

            else {
                System.out.println(temp);
                temp = "";
            }
        }
        System.out.println(temp);
    }
}