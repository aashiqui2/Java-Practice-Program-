// ? count of Duplicate character
public class StringLearningDemo17 {
    public static void main(String[] args) {
        String s="momor";
        char[] c=s.toCharArray();
        boolean[] b=new boolean[c.length];
        int duplicateCount=0;
        for(int i=0;i<c.length;i++){
            if(!b[i]){
                int count=0;
                for(int j=0;j<c.length;j++){
                    if(c[i]==c[j]){
                        count++;
                        b[j]=true;
                    }
                }
                if(count>1){
                    duplicateCount++;
                }
            }
        }
        System.out.println(duplicateCount);
    }
}
