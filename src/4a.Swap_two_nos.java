import java.io.IOException;
import java.util.Scanner;

public class Swap_two_nos {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a,b,temp=0; // a = 1st no. , b= 2nd no.,temp=temporary variable
        System.out.println("Enter the first number(a):");
        a=sc.nextInt();
        System.out.println("Enter the second number(b):");
        b=sc.nextInt();
        temp=a;         //swap operation
        a=b;
        b=temp;
        System.out.println("The value after swapping are");
        System.out.println("a = "+a+ " and b = "+b);
    }
}
