import java.io.IOException;
import java.util.Scanner;

public class Decimal_to_binary {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a Decimal Number : ");
        n=sc.nextInt();
      String bin=Integer.toBinaryString(n);  //built in function to convert decimal to binary
      System.out.println(bin);
    }
}
