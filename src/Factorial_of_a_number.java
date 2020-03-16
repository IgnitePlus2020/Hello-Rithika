import java.io.IOException;
import java.util.Scanner;

public class Factorial_of_a_number {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n,i;
        int fact=1;
        System.out.println("Enter a number to find the factorial :");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial : "+fact);
    }
}
