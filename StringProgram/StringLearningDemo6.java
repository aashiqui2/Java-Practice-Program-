//? Palindrome or not 
public class StringLearningDemo6 {
    
    public static void main(String[] args) {
        String word="ABCD";
        String word1="";
        for(int i=word.length()-1;i>=0;i--)
        {
            word1=word1+word.charAt(i);
        }
        System.out.println(word1);
        // ! do not use  == operator for comparing string
        if(word.equals(word1)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }

        //! Alternative way using string Builder
        StringBuilder sb = new StringBuilder(word);
        String reversed = sb.reverse().toString();
        if (word.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
