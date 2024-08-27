//? Frequency of each elements in a array
public class Demo21 {
    public static void main(String[] args) {
        int[] a = { 10,20,30,40,50,10};
               
        // String name="GOBI KRISHNAN";
        // char[] a=name.toCharArray();

        int[] frequency = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int no = a[i];// 10
            int count = 1;
            for (int j = i + 1; j < a.length; j++) {// 1
                if (no == a[j]) {
                    count++;
                    frequency[j] = -1;
                }
            }
            if(frequency[i]!=-1){
                frequency[i] = count;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if(frequency[i]>0)
               System.out.println("The count of " + a[i] + " is " + frequency[i]);
        }
    
        int max=0;
        int position=0;
        for(int i=0;i<frequency.length;i++){
            if(frequency[i]>max){
                max=frequency[i];
                position=i;
            }
        }
        System.out.println(max+" comes at "+position+" position");
        System.out.println(a[position]);

    }
}
