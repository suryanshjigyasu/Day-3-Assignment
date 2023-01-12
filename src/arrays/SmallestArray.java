package arrays;

import java.util.Scanner;

public class SmallestArray {
	 public static void main(String[] args)
	   {
	      int total, i, small;
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("Enter the Size of Array: ");
	      total = sc.nextInt();
	      int[] arr = new int[total];
	      System.out.print("Enter " +total+ " Numbers: ");
	      for(i=0; i<total; i++)
	         arr[i] = sc.nextInt();
	      
	      small = arr[0];
	      for(i=1; i<total; i++)
	      {
	         if(small>arr[i])
	            small = arr[i];
	      }
	      
	      System.out.println("\nSmallest Number = " +small);
	   }
	}


