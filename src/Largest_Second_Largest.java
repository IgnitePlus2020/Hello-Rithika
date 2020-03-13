import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Largest_Second_Largest {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n1,n2,n3,large,slarg;
        System.out.println("Enter the value of  n1 n2 and n3 :");
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        int array[]={n1,n2,n3};
        Arrays.sort(array);
        large=array[2];
        slarg=array[1];
        System.out.println("The largest no.:"+large);
        System.out.println("The smallest no. :"+slarg);
    }
}
