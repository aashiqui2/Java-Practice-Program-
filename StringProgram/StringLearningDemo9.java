// ?find the firstchar[0] is repeated char

public class StringLearningDemo9 {
    public static void main(String[] args) {
        String word="laptop";
        boolean repeat=false;
        char ch=word.charAt(0);
        for(int i=1;i<word.length();i++)
        {
            if(ch==word.charAt(i)){
                System.out.println(ch +" Repeated");
                repeat=true;
                break;
            }
        }
        if(repeat==false){
            System.out.println(ch+" Not Repeated");
        }
    }
}
