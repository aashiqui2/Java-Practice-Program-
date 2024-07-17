public class StringLearningDemo20 {
    public static void main(String[] args) {

        String s = "aabbccd";
        int[] charArayCount = new int[256];
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            charArayCount[c[i]]++;
        }
        for (int i = 0; i < charArayCount.length; i++) {
            if (charArayCount[i] > 1) {
                System.out.println((char) i + " " + charArayCount[i]);
            }
        }
    }
}