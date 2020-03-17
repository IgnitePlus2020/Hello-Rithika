import java.io.IOException;
import java.util.Scanner;

public class Sequence_7 {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n,ans_1=1,ans_2=-2,i;
        System.out.println("Enter the limit : ");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            System.out.print(" "+ans_1+" ");
            ans_1=ans_1+3;
            System.out.print(" "+ans_2+" ");
            ans_2=ans_2-4;
        }
    }
}
