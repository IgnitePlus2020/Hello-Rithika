import java.io.IOException;
import java.util.Scanner;

public class Sequence_9 {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n,i;
       System.out.println("Enter the limit :");
       n=sc.nextInt();
       int a=1,b=4,c=7;
       int sum=0;
        System.out.print(a+ " "+b+" "+c+ " ");
       for(i=0;i<n;i++)
       {
           sum=a+b+c;
           a=b;
           b=c;
           c=sum;
           System.out.print(sum+" ");
       }
    }
}
