// ? Count the occurence of first Character in a string

public class StringLearningDemo {
    public static void main(String[] args) {
        String word="Logitech";
                 //  01234567
        char first=word.charAt(0);
        int count=0;
        for(int i=1;i<word.length();i++){
            if(first==word.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
