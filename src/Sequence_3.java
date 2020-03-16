import java.io.IOException;
import java.util.Scanner;

public class Sequence_3 {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n,i;
        int a;
        System.out.println("Enter the limit of Sequence : ");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            a=(int)Math.pow(i,i);
            System.out.print(a+",");
        }
    }
}
