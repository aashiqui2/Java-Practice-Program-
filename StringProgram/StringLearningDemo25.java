public class StringLearningDemo25 {
    public static void main(String[] args) {
        String s="abcd";
        replace(s);
    }
    public static void replace(String s)
    {
        char ch[]=s.toCharArray();
        int n=3;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]>=65 &&ch[i]<=90)
            {
                if(ch[i]+n>90)
                {
                    ch[i]+=n-26;
                }
                else{
                    ch[i]+=n;
                }
            }
           else if(ch[i]>=97 &&ch[i]<=122)
            {
                if(ch[i]+n>122)
                {
                    ch[i]+=n-26;
                }
                else{
                    ch[i]+=n;
                }
            }

        }
        String result=new String(ch);
        System.out.println(result);

    }
}
