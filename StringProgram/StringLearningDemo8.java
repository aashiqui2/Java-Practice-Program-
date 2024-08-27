// ? uppercase using  substring method
public class StringLearningDemo8 {
    public static void main(String[] args) {

        String  s="programming";//PrOgRaMmInG
       // System.out.println(s.substring(0,1).toUpperCase()+s.substring(1));
        // ? even uppercase
        for(int i=0;i<s.length();i++)
        {
            if(i%2==0){
                System.out.print(s.substring(i,i+1).toUpperCase());
            }
            else{
                System.out.print(s.substring(i,i+1).toLowerCase());
            }
        }
    }
}
