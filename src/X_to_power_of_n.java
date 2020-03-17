import java.io.IOException;
import java.util.Scanner;

public class X_to_power_of_n {
    public static void main(String args[]) throws IOException{
        Scanner sc= new Scanner(System.in);
        int i,val=0;
        int temp=1;
        System.out.println("Enter the base  :");
        int base =sc.nextInt();
        System.out.println("Enter the power : ");
        int power =sc.nextInt();
        int n=power;
        while(power!=0)
        {
            temp=temp*base;
            power--;
        }
        System.out.println("The value of "+base+ " to the power " +n+ " = " +temp);
    }
}
