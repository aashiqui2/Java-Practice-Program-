// ?count of each vowels in a string

public class StringLearningDemo2 {
    public static void main(String[] args) {
        String word="education";
        int count=0, countOfa=0,countOfe=0,countOfi=0,countOfo=0,countOfu=0;
        for (int i = 0; i < word.length(); i++) {
            char ch=word.charAt(i);
            switch (ch) {
                case 'a': countOfa++; break; 
                case 'e': countOfe++;break;
                case 'i': countOfi++; break;   
                case 'o': countOfo++; break; 
                case 'u': countOfu++; break;  
            }
        }
        System.out.println("Count of  vowels is "+count);
        System.out.println("Count of  vowels a "+countOfa);
        System.out.println("Count of  vowels e "+countOfe);
        System.out.println("Count of  vowels i "+countOfi);
        System.out.println("Count of  vowels o "+countOfo);
        System.out.println("Count of  vowels u "+countOfu);
    }
}
