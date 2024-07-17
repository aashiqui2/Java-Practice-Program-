public class Demo2 {
    public static void main(String[] args) {
        String s="t4d2";
        String temp="";
        int k=0;
        for(int i=0;i<s.length();i++){
            k++;
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                int count=Integer.valueOf(String.valueOf(s.charAt(i)));
                for(int j=0;j<count;j++){
                    temp+=s.charAt(k-2);
                }
            }
        }
        System.out.println(temp);
    }
}
