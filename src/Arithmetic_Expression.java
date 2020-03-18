import java.io.IOException;
import java.util.Scanner;

public class Arithmetic_Expression {
    public static void main(String args[]) throws IOException{
        int a,b,c,d,e,ar=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        a=sc.nextInt();
        System.out.println("Enter the value of b:");
        b=sc.nextInt();
        System.out.println("Enter the value of c:");
        c=sc.nextInt();
        System.out.println("Enter the value of d:");
        d=sc.nextInt();
        System.out.println("Enter the value of e:");
        e=sc.nextInt();
        ar=a+b+(c*e)-(c/d);
        System.out.println("The value of the arithmetic expression is :"+ar);
    }
}
