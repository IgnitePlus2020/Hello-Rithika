import java.io.IOException;
import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);

        String rev = sb.reverse().toString();
        int y=str.compareTo(rev);
        if (y==0) {
            System.out.println("String is a palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }
    }
}
