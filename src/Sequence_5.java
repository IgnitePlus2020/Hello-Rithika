
import java.io.IOException;
import java.util.Scanner;

public class Sequence_5 {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n,b=1,i,c;
        double ans;
        System.out.println("Enter the limit of the Sequence :"); //Sequence :1,-2,6,-15,31,-56
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            ans= b+(int)Math.pow(i,2);
            b=(int)ans;
            c=(int)ans*(int)Math.pow(-1,i);
            System.out.print(c+",");
        }
    }
}
