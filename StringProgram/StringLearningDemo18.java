// ? Occurence of Each character in a string
public class StringLearningDemo18 {
    public static void main(String[] args) {
        String s="aabbcc";
        String temp="";
        String temp1="";
        for(int i=0;i<s.length();i++){
            int count=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            temp=String.valueOf(s.charAt(i));
            if(!temp1.contains(temp)){
                temp1=temp;
                System.out.println(s.charAt(i)+" comes "+count);
            }
        }

    }
}
