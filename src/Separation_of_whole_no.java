import java.io.IOException;
import java.util.Scanner;

public class Separation_of_whole_no {
    public static void main(String args[]) throws IOException{
        Scanner sc= new Scanner(System.in);
        double num,dec;//n=number || dec=fractional part
        int wh; //wh=whole no. part
        System.out.println("Enter the no.");
        num=sc.nextDouble();
        wh=(int)num;   //converting to integer
        dec=num-wh;
        System.out.println("Wholw no.=  "+wh);
        System.out.println("Fractional Value = ="+dec);


    }
}
