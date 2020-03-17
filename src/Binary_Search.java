import java.io.IOException;
import java.util.Scanner;

public class Binary_Search {
    public static void main(String args[]) throws IOException{
        int counter, num, item, first, last, middle;
        //To get user input
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of elements:");
        num = sc.nextInt();

        //Creating array to store the all the numbers
        int[] a = new int[num];

        System.out.println("Enter " + num + " integers");
        //Loop to store each numbers in array
        for (counter = 0; counter < num; counter++)
            a[counter] = sc.nextInt();

        System.out.println("Enter the search value:");
        item = sc.nextInt();
        first = 0;
        last = num - 1;
        middle = (first + last)/2;

        while( first <= last )
        {
            if ( a[middle] < item )
                first = middle + 1;
            else if ( a[middle] == item )
            {
                System.out.println(item + " found at location " + (middle + 1) + ".");
                break;
            }
            else
            {
                last = middle - 1;
            }
            middle = (first + last)/2;
        }
        if ( first > last )
            System.out.println(item + " is not found.\n");
    }
}