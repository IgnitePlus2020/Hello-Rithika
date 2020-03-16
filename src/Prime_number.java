import java.io.IOException;
import java.util.Scanner;

public class Prime_number {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n,m,i,j;
        System.out.println("Enter the value of n and m :");
        n=sc.nextInt();
        m=sc.nextInt();
        for(i=n;i<m;i++)
        {
           for(j=2;j<=i;j++)
           {
               if(i%j==0)
                   break;
           }
           if(i==j)
               System.out.print(j+" ");
        }
    }
}
