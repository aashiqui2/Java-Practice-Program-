public class StringLearningDemo12 {
    public static void main(String[] args) {
        String s="      Hardwork nevers fails         ";
        // System.out.println(s.length());
        // s=s.trim();
        // System.out.println(s.length());
        int f=0,l=s.length()-1;
        boolean first =false,last=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ' && first==false){
                f++;
            }
            else{
                first=true;
            }

            if(s.charAt(l)==' '&& last==false){
                l--;
            }
            else{
                last=true;
            }
            if(first==true && last==true){
               break;
            }
        }
        for(int j=f;j<l;j++){
            System.out.print(s.charAt(j));
        }
    }
}
