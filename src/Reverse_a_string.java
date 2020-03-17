//Reversing a string with built in function "reverse"
import java.io.IOException;
import java.util.Scanner;

public class Reverse_a_string {
    public static void main(String args[]) throws IOException{
        System.out.println("Enter string to reverse:");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);   //StringBuilder= creates an empty string

        System.out.println("Reversed string is:");
        System.out.println(sb.reverse().toString());
    }
}
