import java.io.IOException;
import java.util.Scanner;

public class swap_3_nos {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        int num1,num2,num3,temp=0;
        System.out.println("Enter three  numbers :");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        System.out.println("The numbers before swapping");
        System.out.println("num 1 : "+num1+", num 2 : "+num2+", num 3 :"+num3);
        System.out.println("The numbers after swapping");
        temp=num1;
        num1=num2;
        num2=num3;
        num3=temp;
        System.out.println("num 1 :"+num1+", num 2 :"+num2+", num 3 :"+num3);
    }
}
