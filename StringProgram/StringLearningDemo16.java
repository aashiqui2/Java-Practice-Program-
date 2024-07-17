// ? anagram or  not
public class StringLearningDemo16 {
    public static void main(String[] args) {
        String s1="race";
        String s2="care";
        if(s1.length()==s2.length()){
            for(int i=0;i<s1.length();i++){
                char ch=s1.charAt(i);
                int index=s2.indexOf(ch);
                if(index!=-1){
                    s2=s2.substring(0,index)+s2.substring(index+1);
                }
            }
        }
        if(s2.isEmpty()){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not anagram");
        }

        
    }
}
