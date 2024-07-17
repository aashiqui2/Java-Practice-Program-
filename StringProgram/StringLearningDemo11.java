public class StringLearningDemo11 {
    public static void main(String[] args) {
        String s1 = "Sunday is Funday";
        String s2 = "was";
        boolean contains = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(0)) {
                int count = 0;
                for (int j = 0; j < s2.length(); j++) {
                    if (s2.charAt(j) == s1.charAt(i)) {
                        count++;
                        i++;
                    }
                }
                if (count == s2.length()) {
                    contains = true;
                    System.out.println("Yes Contains");
                    break;
                } else {
                    System.out.println("No does not contains");
                    break;
                }
            }
            else if(contains==false){
                System.out.println("Does not Contain");
                break;
            }
        }
    }

}
