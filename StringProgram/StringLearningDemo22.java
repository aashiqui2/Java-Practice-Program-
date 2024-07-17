public class StringLearningDemo22 {
    public static void main(String[] args) {
        String s = "swwiss";
        int[] charAray = new int[256];
        char[] c = s.toCharArray();
        for (char ch : c) {
            charAray[ch]++;
        }
        for (char ch : c) {
            if (charAray[ch] == 1) {
                System.out.println(ch);
                break;
            } else {
                System.out.println("No non repeating character");
            }
        }
    }
}
