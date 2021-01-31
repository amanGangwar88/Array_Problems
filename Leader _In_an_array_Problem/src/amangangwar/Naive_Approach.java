package amangangwar;

import java.util.Scanner;

public class Naive_Approach {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter The Size Of array :");
		 int n =sc.nextInt();
		  int arr[] =new int[n];
		  System.out.print("Enter The element of array: ");
		  for(int i=0; i<n; i++) {
			  arr[i]=sc.nextInt();
			  System.out.println(" ");
		  }
		  for(int i=0; i<n; i++) {
			  int count=0;
				   for(int j=i+1; j<n; j++) {
						  if(arr[i]<=arr[j]) {
							  count = 1;
							  break;
						  } 
					  }
				   if(count==0) {
					   System.out.println(arr[i]);
				   }
			   }
	}

}
