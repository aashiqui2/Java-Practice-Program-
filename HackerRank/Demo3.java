//  repeated string
public class Demo3 {
    public static void main(String[] args) {
        String s = "aba";
        long n = 10;
        long remainder = n % s.length();
        long foundInString = 0;
        long remainderFound = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                foundInString++;
            }
            if (i < remainder && s.charAt(i) == 'a') {
                remainderFound++;
            }
        }
        System.out.println(foundInString);
        System.out.println(remainderFound);
        System.out.println(n/s.length());
        System.out.println((n / s.length()) * foundInString + remainderFound);
    }
}
