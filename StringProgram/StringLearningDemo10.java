// ?Input: He is a very very good boy, isn't he?
// ?Output:
//? 10
//? He
//? is
//? a
//? very
//? very
//? good
//? boy
//? isn
//? t
//? he
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringLearningDemo10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String pattern = "[A-Za-z]+";

        Pattern r = Pattern.compile(pattern);

        Matcher m = r.matcher(input);

        StringBuilder tokens = new StringBuilder();
        int tokenCount = 0;

        // Find all matches
        while (m.find()) {
            tokens.append(m.group()).append("\n");
            tokenCount++;
        }

        // Print the number of tokens
        System.out.println(tokenCount);

        // Print all tokens
        System.out.print(tokens.toString());
    }
}
