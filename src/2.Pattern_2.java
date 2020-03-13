import java.io.IOException;
import java.util.Scanner;

public class Pattern_2 {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int k, y, j;
        int space;
        int n;
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        space = n;
        for (j= 1;j<=5;j++) {
            for(k=1;k<=space;k++) {
                System.out.print(" ");
            }
            for(y=1;y<=j;y++)
            {
                System.out.print(" * ");
            }
            space--;
            System.out.println();
        }
    }
}
