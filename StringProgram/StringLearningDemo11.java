public class StringLearningDemo11 {
    public static void main(String[] args) {
        String str = "sunday is funday";
        String str1 = "is";
        boolean contains = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str1.charAt(0)) {
                int count = 0;
                for (int j = 0; j < str1.length(); j++) {
                    if (str.charAt(i) == str1.charAt(j)) {
                        count++;
                        i++;
                    }
                }
                if (count == str1.length()) {
                    contains = true;
                    System.out.println("Yes");
                    break;
                }
            }
        }
        if (contains == false) {
            System.out.println("Does not Contain");
        }

    }

}
