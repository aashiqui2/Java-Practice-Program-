// ?count of vowels in a string

public class StringLearningDemo1 {
    public static void main(String[] args) {
        String word="education";
        int count=0;
        for (int i = 0; i < word.length(); i++) {
            // char ch=word.charAt(i);
            // switch (ch) {
            //     case 'a':     
            //     case 'e':     
            //     case 'i':     
            //     case 'o':     
            //     case 'u': count++;    
            // }
            // switch (ch) {
            //     case 'a': count++; //1 3 8 9 12 
            //     case 'e': count++; //2 4 10 13
            //     case 'i': count++; //5 11 14   
            //     case 'o': count++; //6 15
            //     case 'u': count++; //7   
            // }
            // switch (ch) {
            //     case 'a': count++; break; 
            //     case 'e': count++;break;
            //     case 'i': count++; break;   
            //     case 'o': count++; break; 
            //     case 'u': count++; break;  
            // }
        }
        System.out.println("Count of  vowels is "+count);
    }
}
