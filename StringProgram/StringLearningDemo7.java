// ?even index uppercase

public class StringLearningDemo7 {
    public static void main(String[] args) {
        String s="abcd";
        char[] ch=s.toCharArray();
        // ch[0]=(char)(ch[0]-32);
        // System.out.println(ch[0]);
        // for(int i=0;i<s.length();i++){
        //     System.out.print(ch[i]);
        // }
        
        // ? even index uppercase
        for(int i=0;i<ch.length;i++){
            if(i%2==0){
                if(ch[i]>='a' && ch[i]<='z'){
                    ch[i]=(char)(ch[i]-32);
                }
            }
        }
        s=new String(ch);
        System.out.println(s);
    }
}
