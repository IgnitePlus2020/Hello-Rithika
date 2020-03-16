import java.io.IOException;
import java.util.Scanner;

public class Sequence_6 {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        int i,n;
        int a=0,b=1,c=1;       //a=first digit b=second digit
        System.out.println("Enter the limit of the sequence :");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.println(c+",");
            c=a+b;
            a=b;
            b=c;

        }
    }
}
