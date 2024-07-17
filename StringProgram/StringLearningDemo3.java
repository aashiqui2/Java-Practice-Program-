// ? vowels present or not in a string
public class StringLearningDemo3 {
    public static void main(String[] args) {
        String word = "abcd";
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u': count++;
            }
        }
        if(count==0)
        {
            System.out.println("No vowels");
        }
        else{
            System.out.println(count);
        }
    }
}
