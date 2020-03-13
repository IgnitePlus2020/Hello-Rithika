import java.io.IOException;
import java.util.Scanner;

public class Odd_or_even {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num; //num=number
        System.out.println("Enter the number to check if it is odd o even : ");
        num=sc.nextInt();
        if(num % 2==0)
            System.out.println(num+ " Is an even number ");
        else
            System.out.println(num+ " Is a odd number ");
    }
}
