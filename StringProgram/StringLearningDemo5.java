// ? only number in a string
public class StringLearningDemo5 {
    public static void main(String[] args) {
        String word = " Chennai 638002";
        int count = 0;
        for(int i=0;i<word.length();i++){
        if(word.charAt(i)>='0' && word.charAt(i)<='9'){
        count++;
        }
        }
        if(count==word.length()){
        System.out.println("All are number in the given string");
        }
        else{
        System.out.println("No, someother character in the string");
        }

        // ! Alternative Way
        // String word1=word.replaceAll("[a-zA-Z]","");

        // if (word.length() == word1.length()) {
        //     System.out.println("All are number in the given string");
        // } else {
        //     System.out.println("No, someother character in the string");
        // }

        // ! Alternative Way using exception
        // ? throws java.lang.NumberFormatException:
        // try{
        // int no= Integer.parseInt(word);
        // System.out.println(no);
        // }
        // catch(NumberFormatException e){
        // System.out.println(e);
        // System.out.println("All character are not numbers");
        // }

    }
}
