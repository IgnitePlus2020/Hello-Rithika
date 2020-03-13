import java.io.IOException;
import java.util.Scanner;

public class sum_of_odd_and_even {
    public static void main(String args[]) throws IOException{
        Scanner sc= new Scanner(System.in);
        int n,even_sum=0,odd_sum=0,i;
        System.out.println("Enter the number ");
        n=sc.nextInt();
        for(i=0;i<=n;i=i+2)
        {
            even_sum=even_sum+i;
        }
        for(i=1;i<=n;i=i+2)
        {
            odd_sum=odd_sum+i;
        }
        System.out.println("Even sum = " +even_sum);
        System.out.println("Odd sum = "+odd_sum);
    }
}
