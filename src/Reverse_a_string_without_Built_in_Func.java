import java.io.IOException;
import java.util.Scanner;

public class Reverse_a_string_without_Built_in_Func {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to reverse : ");
        String str= sc.nextLine();
        String reverse="";
        int i;
        for(i=str.length()-1;i>=0;i--)
        {
            reverse=reverse+ str.charAt(i);
        }
        System.out.println("Reverse String is :"+reverse);
    }
}
