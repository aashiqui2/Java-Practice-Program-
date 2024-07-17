// ? printing only number only string using regex and conditon statement
public class StringLearningDemo4 {
    public static void main(String[] args) {
        String word = "Erode 638002";
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i)>='0' && word.charAt(i)<='9'){
            System.out.print(word.charAt(i));
            }
            if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z' ||word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                System.out.print(word.charAt(i));
            }

        }
        //! Alternative Pattern
        System.out.println(word.replaceAll("[a-zA-Z]", ""));
        System.out.println(word.replaceAll("[0-9]", ""));

    }
}
