import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Sequence_2 {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n,i,b;
        double a;
        System.out.println("Enter the limit of the Sequence");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            a=Math.pow(-1,i);
            b=(int)a*i;
            System.out.print(b+",");
        }
    }
}
