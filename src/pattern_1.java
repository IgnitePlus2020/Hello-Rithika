import java.io.IOException;
import java.util.*;
    public class pattern_1 {
        public static void main(String args[]) throws IOException{
            Scanner sc = new Scanner(System.in);
            int i,j;
            int n;

            System.out.println("Enter the value of n");
            n=sc.nextInt();
            for(i=0;i<=n;i++)
            {
                for(j=0;j<i;j++)
                {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
    }