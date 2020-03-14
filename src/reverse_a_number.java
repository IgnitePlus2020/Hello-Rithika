import java.io.IOException;
import java.util.Scanner;

public class reverse_a_number {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n,rem,rev=0;// n = number entered || rem = remainder || rev = the reverse no. gets stored
        System.out.println("Enter the number to be reversed :");
        n=sc.nextInt();
        while(n!=0)
        {
            rem=n%10;        //finding the remainder
            rev=rev*10+rem;  //Calculating the reverse
            n=n/10;
        }
        System.out.println("The reversed number is = "+rev);
    }
}
