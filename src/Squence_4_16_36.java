import java.io.IOException;
import java.util.Scanner;

public class Squence_4_16_36 {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n,i,sum=0;
        System.out.println("Enter the range of the sequence you want to obtain :");
        n=sc.nextInt();
        for(i=1;i<=n;i+=2)
        {
            sum=sum+(i*4);        //series calculation
            System.out.println(sum);
        }

    }
}

