// ? anagram or not (updated and simple)
public class StringLearningDemo19 {
    public static void main(String[] args) {
        String a="race";
        String b="care";
        if(isAnagram(a, b)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Anagram");
        }
        
    }
    public static boolean isAnagram(String a,String b)
    {
        char[] str1=a.toCharArray();
        char[] str2=b.toCharArray();        
        int[] count1=new int[256];
        int[] count2=new int[256];
        for(int i=0;i<a.length() && i<b.length();i++){
            count1[str1[i]]++;
            count2[str2[i]]++; 
        }
        if(str1.length!=str2.length)return false;
        
        for(int i=0;i<256;i++){
            // System.out.println(i+" "+ count1[i]+" == "+count2[i]);
            if(count1[i]!=count2[i])
            {
                return false;
            }
        }
        return true;
    }
}

