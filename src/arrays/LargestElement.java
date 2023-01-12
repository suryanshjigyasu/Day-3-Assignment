package arrays;

import java.util.Scanner;

public class LargestElement {

    public static void main(String[] args) 
    {
        int num, max;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        num = s.nextInt();
        int a[] = new int[num];
        System.out.println("Enter elements of array:");
        for(int i = 0; i < num; i++)
        {
            a[i] = s.nextInt();
        }
        max = a[0];
        for(int i = 0; i < num; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
        }
        System.out.println("Maximum value:"+max);
    }
}


