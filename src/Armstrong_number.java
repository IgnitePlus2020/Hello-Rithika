import java.io.IOException;
import java.util.Scanner;

public class Armstrong_number {
    public static void main(String args[]) throws IOException{
        Scanner sc= new Scanner(System.in);
        int cube,n,m,sum=0;
        System.out.println("Enter a number: ");
        n=sc.nextInt();
        int num=n;
        while(n!=0)
        {
            m=n%10;
            sum= sum+(int)Math.pow(m,3);
            n=n/10;
        }
        if(num==sum)
            System.out.println("The number "+num+" is Armstrong ");
        else
           System.out.println("The number "+num+" is not Armstrong ");

    }
}
