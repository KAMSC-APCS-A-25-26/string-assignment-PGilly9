import java.util.Scanner;

public class PalindromeChecker {

    public static boolean isPalindrome(String str){

    StringBuilder sb = new StringBuilder(str);
    String palindrome = sb.reverse().toString();
    return str.equals(palindrome);
}
    public static void main(String[] args) {
        // TODO: Create a Scanner and read a full line from the user with nextLine().
        //       Keep the original input string so you can print it in the final message.
        Scanner sc  = new Scanner(System.in);

        // TODO: Build a lowercase version of the input for checking (case-insensitive comparison).
        //       (You don't need to remove spaces/punctuation for the current tests.)
System.out.print("Enter a word: ");
String str = sc.nextLine();
str = str.toLowerCase();
        // TODO: Determine whether the lowercase string reads the same forwards and backwards.
        //       Tip: compare it to a reversed copy of itself.
        if (isPalindrome(str)){
            System.out.println(str + " is a palindrome!");
        }
        else{
            System.out.println(str + " is not a palindrome!");
        }

        // TODO: Treat single-character inputs as palindromes (the above check will already handle this).

        // TODO: Print EXACTLY ONE of the following lines (no extra punctuation/labels):
        //       "<original> is a palindrome"
        //       "<original> is not a palindrome"
        //       where <original> is exactly what the user typed (preserve casing).
    }
}