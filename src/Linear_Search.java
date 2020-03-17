import java.io.IOException;
import java.util.Scanner;

public class Linear_Search {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        int[] ar= new int[50];
        int n,i,key;
        int pos=0;
        System.out.println("Enter the number of elements :");
        n=sc.nextInt();
        System.out.println("Enter the elements :");
        for(i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println("Enter the element you want to search :");
        key=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(key==ar[i]) {
                pos = i;
                break;
            }
            else
                pos=-1;
        }
        if(pos==-1)
            System.out.println("The element is not found ");
        else
            System.out.println("The element is found at position "+pos);
    }
}
