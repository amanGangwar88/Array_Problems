package amangangwar;

import java.util.Scanner;
 

public class SortedArray {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter Size of Array :");
		 int array[] = new int[sc.nextInt()];
		 System.out.print ("Enter Array Elements :");
		 for(int i=0; i<array.length; i++) {
			 array[i] = sc.nextInt();
			 System.out.println(" ");
		 }
		 String result = "Yes";
		 for(int i=0; i<array.length-1; i++) {
			 if(array[i]>array[i+1]) {
		        result = "No" ;
			 }
		 }
		 System.out.println(result);
	}

}
