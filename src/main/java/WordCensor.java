import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCensor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: Read a full sentence from the user using Scanner.nextLine()
        String text = sc.nextLine();
        //String newText;

        // TODO: Replace each banned word with exactly ***: dang, nuts, oops, yikes
        String newText = null;
        if (text.contains("dang")) {
            newText = text.replaceAll("dang", "***");
        }
        if (text.contains("nuts")) {
            newText = text.replaceAll("nuts", "***");
        }
        if (text.contains("oops")) {
            newText = text.replaceAll("oops", "***");
        }
        if (text.contains("yikes")) {
            newText = text.replaceAll("yikes", "***");
        }




        // TODO: Print the result prefixed with: Censored:

        // NOTE: Tests require exactly three asterisks (no ****) for every replacement
        System.out.println(newText);
    }
}
