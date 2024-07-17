public class StringLearningDemo21 {
        public static void main(String[] args) {
            String s="Hello World";
            int vowelcount=0;
            int consonetcount=0;
            s=s.toLowerCase();
            char[] c=s.toCharArray();
            
            for(char ch:c){
                if(isVoweks(ch)){
                    vowelcount++;
                }
                else if(isconsonent(ch)){
                    consonetcount++;
                }
    
            }
            System.out.println(vowelcount);
            System.out.println( consonetcount);
    
        }
        public static boolean isVoweks(char c){
            String vowels="aeiou";
            return vowels.indexOf(c)!=-1;
        }
        public static boolean isconsonent(char c){
           return c>='a' &&c<='z';
        }
    }
    

