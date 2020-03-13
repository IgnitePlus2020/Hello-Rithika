import java.io.IOException;
import java.util.Scanner;

public class simple_interest {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        float p,r,t;//  p=Principal amount || r=rate || t=time
        float si;  //simple interest
        System.out.println("Enter the principal amount : ");
        p=sc.nextFloat();
        System.out.println("Enter the rate : ");
        r=sc.nextFloat();
        System.out.println("Enter the time : ");
        t=sc.nextFloat();
        si=(p*r*t)/100; //calculating simple interest
        System.out.println("The simple interest : "+si);
    }
}
