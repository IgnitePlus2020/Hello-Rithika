import java.io.IOException;
import java.util.Scanner;

public class Sequence_8 {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n, ans_1= 1, i,ans_2=5,j=1;
        System.out.println("Enter the limit : ");
        n = sc.nextInt();
        for (i=1;i<=n;i+=2)
        {
            System.out.println(ans_1);
            System.out.println(ans_2);
            ans_1=ans_1+(12 * i);
            ans_2=ans_2+(24*j);
            j++;
        }
    }
}
