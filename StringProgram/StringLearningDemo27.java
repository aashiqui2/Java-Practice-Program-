//! Remove Duplicates in a string
public class StringLearningDemo27 {
    public static void main(String[] args) {
        String s="aabbccd";
        String output=removeDuplicates(s);
        System.out.println(output);
    }
    public static String removeDuplicates(String s)
    {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char currChar=s.charAt(i);
            if(sb.indexOf(String.valueOf(currChar))==-1)
            {
                sb.append(currChar);
            }
        }
        return sb.toString();
    }
}
