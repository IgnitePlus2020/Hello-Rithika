import java.io.IOException;
import java.util.Scanner;

public class Binary_to_decimal {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        String n;
        System.out.println("Enter the binary value :");
        n=sc.nextLine();       //input a string
        System.out.println("Output: "+Integer.parseInt(n,2));       //to convert binary to decimal-parseInt
    }
}
