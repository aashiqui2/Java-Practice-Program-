//! Finding count of duplicate elements in a given array
public class Demo24 {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,10};
        boolean[] b=new boolean[a.length];
        int duplicateCount=0;
        for(int i=0;i<a.length;i++){
            if(!b[i]){
                int count=1;
                for(int j=i+1;j<a.length;j++)
                {
                    if(a[i]==a[j]){
                        count++;
                        b[j]=true;
                    }
                }
                if(count>1){
                    duplicateCount++;
                }
            }
        }
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+"  ");
        }
        System.out.println();
        for(int i=0;i<b.length;i++){
            System.out.print(a[i]+"     ");
        }
        System.out.println();
        System.out.println("The duplicate Element Count is "+ duplicateCount);
    }
}

